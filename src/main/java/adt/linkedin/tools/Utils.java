/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt.linkedin.tools;

import java.awt.Color;

/**
 *
 * @author dev
 */
public class Utils {
    
    public static final String FONT = "Liberation Sans";
    public static final Color PURPLE = new Color(153,102,255);
    
    public static boolean isNumeric(String sequence){
        for (char c : sequence.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    
}
