/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt.linkedin.enumerations;

/**
 *
 * @author mario
 */
public enum Extension {
    XML("xml"), JSON("json"), PROPERTIES("properties");
    private String extension;
    
    private Extension(String extension){
        this.extension = extension;
    }
    
    public String getExtension(Extension extension){
        return extension.name().toLowerCase();
    }
}
