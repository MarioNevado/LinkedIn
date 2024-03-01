/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt.linkedin.biz;

import java.io.*;
import java.util.*;

/**
 *
 * @author Mario Nevado
 */
public class PropertiesReader extends DataReader {

    private Map<Object, Object> data;

    public PropertiesReader(File file) throws Exception {
        data = new HashMap<>();
        try {
            read(file);
        } catch (Exception exception) {
            throw exception;
        }
    }

    @Override
    public void read(File file) throws IOException, Exception{
        HashMap<Object, Object> map = new HashMap<>();
        String[] elementContainer;
        String root = "";
        try (FileInputStream stream = new FileInputStream(file)) {
            Properties properties = new Properties();
            properties.load(stream);
            for (Map.Entry<Object, Object> entry : properties.entrySet()) {
                Object key = entry.getKey();
                Object val = entry.getValue();
                if (((String) key).contains(".")) {
                    elementContainer = ((String) key).split("\\.");
                    for (int i = 0; i < elementContainer.length; i++) {
                        if (i % 2 != 0) {
                            map.put(elementContainer[i], val);
                        } else {
                            root = elementContainer[i];
                        }
                    }
                    data.put(root, map);
                } else {
                    data.put(key, val);
                }
            }

        } catch(IOException ioException){
            throw new IOException("Error en entrada/salida");
        } catch (Exception exception) {
            throw exception;
        }
    }

    public Map<Object, Object> getData() {
        return data;
    }

}