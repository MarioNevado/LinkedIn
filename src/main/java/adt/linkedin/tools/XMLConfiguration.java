/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt.linkedin.tools;

import adt.linkedin.enumerations.Extension;
import java.io.FileWriter;
import java.io.IOException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

/**
 *
 * @author mario
 */
public class XMLConfiguration {
    private final XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newFactory();
    
    public XMLOutputFactory getOutputFactory(){
        return xmlOutputFactory;
    }
    
    public XMLStreamWriter getWriter(String filename) throws IOException, XMLStreamException{
        return this.xmlOutputFactory.createXMLStreamWriter(new FileWriter(filename + "." + Extension.XML.getExtension(Extension.XML)));
    }
}
