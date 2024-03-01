/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt.linkedin.biz;

import java.io.*;
import java.util.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

/*
Gestión del directorio config	OK
El programa verifica que existe el directorio config y busca los archivos XML, JSON y Properties que hay en el directorio 
0.5 puntos
Lectura de ficheros XML	OK
El programa lee ficheros XML indiferentemente de su estructura
1.5 puntos
Estructura de almacenamiento  OK
Se almacenan los valores leídos de los ficheros en una estructura de datos.
0.5 puntos
Método get	OK
Se pueden obtener valores de la estructura de datos separando los campos por el carácter .
2 puntos
---------------------------------------------------------------------------------------------------------------------------
Lectura de ficheros JSON	
El programa lee ficheros JSON indiferentemente de su estructura
1.5 puntos
Lectura de ficheros Properties	
El programa lee ficheros properties y separa campos de sus campos por el carácter .
1.5 puntos

Escritura fichero XML	
Se guarda la información de la estructura de datos
0.5 puntos
Escritura fichero Properties	
Se guarda la información de la estructura de datos
0.5 puntos
Escritura fichero JSON	
Se guarda la información de la estructura de datos
0.5 puntos
Código limpio	
Existe control de excepciones y errores. Se utilizan otras clases y métodos debidamente nombrados
1 puntos
 */
public class XMLReader extends DataReader{

    DocumentBuilderFactory factory;
    private Map<Object, Object> data;
    private final int ERROR_HEADER = 400;

    public XMLReader(File f) throws Exception {
        data = new LinkedHashMap<>();
        factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(f);
        Element root = doc.getDocumentElement();
        NodeList database = root.getChildNodes();
        read(database);
    }

    @Override
    public void read(NodeList database) {
        for (int i = 0; i < database.getLength(); i++) {
            if (!data.containsKey(database.item(i))) {
                if (!database.item(i).getNodeName().equals("#text")&& !database.item(i).getNodeName().equals("#comment")) {
                    if (!data.containsKey(database.item(i))) {
                        data.put(ERROR_HEADER + i, search(database.item(i), new LinkedHashMap<>()));
                    }
                    
                }
            }
        }
    }

    private Map<Object, Object> search(Node n, Map<Object, Object> childs) {
        Map<Object, Object> parent = new LinkedHashMap<>();
        Node aux;
        if (n.getChildNodes().getLength() != 1) {
            for (int i = 0; i < n.getChildNodes().getLength(); i++) {
                aux = n.getChildNodes().item(i);
                if (!aux.getNodeName().equals("#text") && !aux.getNodeName().equals("#comment")) {
                    if (aux.getChildNodes().getLength() == 1) {
                        childs.put(aux.getNodeName(), aux.getTextContent().trim());
                    } else {
                        for (int j = 0; j < aux.getChildNodes().getLength(); j++) {
                            Node son = aux.getChildNodes().item(j);
                            if (son.getNodeType() == Node.TEXT_NODE && !son.getTextContent().isBlank()) {
                                childs.put(aux.getNodeName(), son.getTextContent().trim());
                            } else if (!son.getNodeName().equals("#text")) {
                                search(aux, childs);
                            }
                        }
                    }
                }
            }
            parent.put(n.getNodeName(), childs);
        } else {
            parent.put(n.getNodeName(), n.getTextContent().trim());
        }
        return parent;
    }

    public Map<Object, Object> getData() {
        return data;
    }
}