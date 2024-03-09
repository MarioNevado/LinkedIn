/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt.linkedin.converters;

import adt.linkedin.enumerations.Status;

/**
 *
 * @author mario
 */
public class StatusConverter {
    
    public int convertToDataBaseColumn(Status status){
        return status.getValue();
    }
    public Status convertToAttribute(int index){
        return Status.values()[index];
    }
}
