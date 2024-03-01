/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt.linkedin.biz;

import java.io.File;
import java.util.Map;
import org.w3c.dom.NodeList;

/**
 * 
 * @author Mario Nevado
 */
public abstract class DataReader {
    
    public void read(File f) throws Exception{}
    public void read(NodeList database){}
    public void read(Object obj, Map<Object, Object> parent) throws Exception{}
}