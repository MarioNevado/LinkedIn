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
    public int convertToDataBaseColumn(WorkDayType type){
        return type.getValue();
    }
    public WorkDayType convertToAttribute(int index){
        return WorkDayType.values()[index];
    }
}
