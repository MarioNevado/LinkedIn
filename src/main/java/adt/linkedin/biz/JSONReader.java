/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt.linkedin.biz;

import java.io.*;
import java.util.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.*;

/**
 *
 * @author Mario Nevado
 */
public class JSONReader extends DataReader {

    private Map<Object, Object> data;

    public JSONReader(File file) throws FileNotFoundException, IOException, Exception{
        try{
        data = new HashMap<>();
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader(file));
        read(object, data);
        }catch(FileNotFoundException fileException){
            throw new FileNotFoundException("Archivo no encontrado");
        }catch(IOException ioException){
            throw new IOException("Error en entrada/salida");
        }
        catch(Exception exception){
            throw exception;
        }

    }

    @Override
    public void read(Object object, Map<Object, Object> parent) {
        JSONArray jsonArray = new JSONArray();
        jsonArray.add(object);
        for (Object jsonElement : jsonArray) {
            if (jsonElement instanceof Map) {
                for (Map.Entry<Object, Object> entry : ((Map<Object, Object>) jsonElement).entrySet()) {
                    Object key = entry.getKey();
                    Object val = entry.getValue();
                    if (val instanceof Map) {
                        Map<Object, Object> childs = new TreeMap<>();
                        parent.put(key, childs);
                        read(val, childs);
                    } else if (val instanceof ArrayList) {
                        parent.put(key, treatList((List) val));
                    } else {
                        parent.put(key, val);
                    }
                }
            }
        }
    }

    private Map<Object, Object> treatList(List<Object> mapList) { //lista de mapas
        Map<Object, Object> treatedList = new HashMap<>();
        int cont = 0;
        String before = "";
        for (Object o : mapList) {
            for (Map.Entry<Object, Object> entry : ((Map<Object, Object>) o).entrySet()) {
                Object key = entry.getKey();
                Object val = entry.getValue();
                if (!treatedList.containsKey(key) && !before.equals(key)) {
                    cont++;
                    key = ((String) key) + Integer.toString(cont);
                }
                treatedList.put(key, val);
            }
        }
        return treatedList;
    }

    public Map<Object, Object> getData() {
        return data;
    }

}