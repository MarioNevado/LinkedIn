/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt.linkedin.converters;

import adt.linkedin.enumerations.WorkDayType;

/**
 *
 * @author mario
 */
public class WorkDayTypeConverter {
    
    /**
     * Convierte la enumeración WorkDayType 
     * @param type tipo a transformar
     * @return un entero, que es su código
     */
    public int convertToDataBaseColumn(WorkDayType type){
        return type.getValue();
    }
    
    /**
     * Convierte un entero a WorkDayType 
     * @param index entero a transformar
     * @return un tipo correspondiente a su codigo
     */
    public WorkDayType convertToAttribute(int index){
        return WorkDayType.values()[index];
    }
}
