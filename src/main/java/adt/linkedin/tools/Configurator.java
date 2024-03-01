/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt.linkedin.tools;

import adt.linkedin.biz.JSONReader;
import adt.linkedin.biz.PropertiesReader;
import adt.linkedin.biz.XMLReader;
import adt.linkedin.exceptions.NotValidDirectoryException;
import adt.linkedin.exceptions.NotValidExtensionException;
import java.io.*;
import java.util.*;
import javax.xml.stream.*;
import org.json.simple.*;


public class Configurator { //mirar carpeta conf

    private HashMap<Object, Object> data;
    private JSONReader jReader;
    private XMLReader xReader;
    private PropertiesReader pReader;

    public Configurator() throws NotValidDirectoryException, Exception {//segun su extension llamara a un lector, solo leera .json, .xml o.properties
        data = new HashMap<>();
        File directory = new File("conf");
        if (!directory.exists() || !directory.isDirectory()) {
            throw new NotValidDirectoryException(getMsg(directory));
        } else {
            File files[] = directory.listFiles();
            for (File file : files) {
                manageExtension(file);
            }
        }

    }
    
    private void manageExtension(File file) throws NotValidExtensionException, Exception{
        String extension = getExtension(file);
                if (extension.equals("xml")) {
                    try {
                        xReader = new XMLReader(file);
                        data.putAll(xReader.getData());
                    } catch (Exception exception) {
                        throw exception;
                    }
                } else if (extension.equals("json")) {
                    try {
                        jReader = new JSONReader(file);
                        data.putAll(jReader.getData());
                    } catch (Exception exception) {
                        throw exception;
                    }
                } else if (extension.equals("properties")) {
                    try {
                        pReader = new PropertiesReader(file);
                        data.putAll(pReader.getData());
                    } catch (Exception exception) {
                        throw exception;
                    }
                } else {
                    throw new NotValidExtensionException("Extensión de archivo inválida");
                }
    }

    public Object get(String route, char splitter) { //por si se separa por otro valor
        String[] splittedRoute;
        if (splitter == '.') splittedRoute = route.split("\\" + Character.toString(splitter)); //controlo que el separador sea un punto o no para escaparlo
        else splittedRoute = route.split(Character.toString(splitter));
        for (int i = 0; i < splittedRoute.length; i++) {
            String piece = splittedRoute[i];
            Object value = data.get(piece);
            if (data.containsKey(piece) && value instanceof Map) { 
                if (i + 1 < splittedRoute.length) {
                    String next = splittedRoute[i + 1];
                    if (((Map) value).containsKey(next) && !(((Map) value).get(next) instanceof Map)) {
                        return ((Map) value).get(next);
                    }else return ((Map) value).get(next);
                }else return (Map<Object, Object>) value;
            } else if (data.containsKey(piece)){
                return value;
            }else break;
        }
        return null;

    }
    public Object get(String route) { //por defecto usa el .
        String[] splittedRoute= route.split("\\.");
        for (int i = 0; i < splittedRoute.length; i++) {
            String piece = splittedRoute[i];
            if (data.containsKey(piece) && data.get(piece) instanceof Map) {
                if (i + 1 < splittedRoute.length) {
                    if (((Map) data.get(piece)).containsKey(splittedRoute[i + 1]) && !(((Map) data.get(piece)).get(splittedRoute[i + 1]) instanceof Map)) {
                        return ((Map) data.get(piece)).get(splittedRoute[i + 1]);
                    }
                }else return (HashMap<Object, Object>) data.get(piece);
            } else if (data.containsKey(piece)) return data.get(piece);
            else break;
            
        }
        return null;

    }

    public void save(String fileName, String format) throws NotValidExtensionException, Exception {
        if (format.equals("xml")) {
            toXMLFile(fileName, data);
        } else if (format.equals("json")) {
            toJSONFile(fileName);
        } else if (format.equals("properties")) {
            try (FileOutputStream stream = new FileOutputStream(fileName + ".properties")) {
                toPropFile(stream, data);
            } catch (Exception exception) {
                throw exception;
            }
        } else {
            throw new NotValidExtensionException("Extension invalida");
        }
    }

    private void toPropFile(FileOutputStream outputStream, Map<Object, Object> map) throws IOException, Exception {
        Properties prop = new Properties();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            if (val instanceof Map) {
                toPropFile(outputStream, (Map) val);
            } else {
                prop.setProperty((String) key, (String) val);
            }
        }
        try {
            prop.store(outputStream, "Obtained data");
        } catch (IOException ioException) {
            throw new IOException("Error almacenando en objeto properties");
        } catch (Exception exception) {
            throw exception;
        }
    }

    private void toJSONFile(String name) throws Exception {
        try (FileWriter writer = new FileWriter(name + ".json")) {
            JSONArray array = new JSONArray();
            for (Map.Entry<Object, Object> entry : data.entrySet()) {
                Object key = entry.getKey();
                Object val = entry.getValue();
                JSONObject object = new JSONObject();
                object.put(key, val);
                array.add(object);
            }
            writer.write(array.toJSONString());
        } catch (Exception exception) {
            throw exception;
        }
    }

    private void toXMLFile(String name, Map<Object, Object> map) throws IOException, XMLStreamException, Exception { //toFile pero en xml
        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newFactory();
        XMLStreamWriter xWriter = null;
        try {
            xWriter = xmlOutputFactory.createXMLStreamWriter(new FileWriter(name + ".xml"));
            xWriter.writeStartDocument();
            xWriter.writeCharacters("\n");
            xWriter.writeStartElement("FileInfo");
            xWriter.writeCharacters("\n");
            writeXMLContent(xmlOutputFactory, xWriter, map);
            xWriter.writeEndElement();
            xWriter.writeEndDocument();
            xWriter.close();
        } catch (IOException | XMLStreamException exception) {
            if (exception instanceof IOException) {
                throw new IOException("Error de entrada/salida");
            } else if (exception instanceof XMLStreamException) {
                throw new XMLStreamException("Error en XMLStream");
            }
        } catch (Exception exception) {
            throw exception;
        } finally {
            if (xWriter != null) {
                try {
                    xWriter.close();
                } catch (XMLStreamException xmlException) {
                    throw new XMLStreamException("Error al cerrar el XMLStreamWriter");
                }
            }
        }

    }

    private void writeXMLContent(XMLOutputFactory xmlOutputFactory, XMLStreamWriter xWriter, Map<Object, Object> map) throws XMLStreamException, Exception {
        try {
            for (Map.Entry<Object, Object> entry : map.entrySet()) {
                Object key = entry.getKey();
                Object val = entry.getValue();
                xWriter.writeStartElement((String) key);
                if (!(val instanceof Map)) {
                    xWriter.writeCharacters((String) val);
                } else {
                    xWriter.writeCharacters("\n");
                    writeXMLContent(xmlOutputFactory, xWriter, (Map) val);
                }
                xWriter.writeEndElement();
                xWriter.writeCharacters("\n");
            }
        } catch (XMLStreamException xmlException) {
            throw new XMLStreamException("Error al cerrar el XMLStreamWriter");
        } catch (Exception exception) {
            throw exception;
        }
    }

    private String getMsg(File directory) {
        if (!directory.exists()) {
            return "NO EXISTE";
        } else {
            return "NO ES UN DIRECTORIO";
        }
    }

    private String getExtension(File file) {
        return file.getName().split("\\.")[file.getName().split("\\.").length - 1];
    }

    @Override
    public String toString() {
        return data.toString();
    }

}