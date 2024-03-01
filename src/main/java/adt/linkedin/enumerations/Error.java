/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt.linkedin.enumerations;

/**
 *
 * @author mario
 */
public enum Error {
    
    USERNAME(1, "El nombre de usuario debe estar en minúsculas");
    private int code;
    private String msg;
    
    private Error(int code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
