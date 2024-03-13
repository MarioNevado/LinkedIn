/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt.linkedin.converters;

import adt.linkedin.enumerations.Status;

/**
 *
 * @author Mario Nevado
 */
public class StatusConverter {
    
    /**
     * Convierte la enumeración Status 
     * @param status estado a transformar
     * @return un entero, que es su código
     */
    public int convertToDataBaseColumn(Status status){
        return status.getValue();
    }
    
    /**
     * Convierte un entero a Status 
     * @param index entero a transformar
     * @return un estado correspondiente con su código
     */
    public Status convertToAttribute(int index){
        return Status.values()[index];
    }
}
