/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt.linkedin.tools;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
    
    public static void mouseEntered(JLabel label){
        label.setFont(new Font(Utils.FONT, 1, label.getFont().getSize()));
    }
    
    public static void mouseExited(JLabel label){
        label.setFont(new Font(Utils.FONT, 0, label.getFont().getSize()));
    }
    
    public static void mouseEntered(JTextField field){
        field.setFont(new Font(Utils.FONT, 1, field.getFont().getSize()));
    }
    
    public static void mouseExited(JTextField field){
        field.setFont(new Font(Utils.FONT, 0, field.getFont().getSize()));
    }
    
}
