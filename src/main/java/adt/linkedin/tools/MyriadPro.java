/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt.linkedin.tools;

import java.awt.Font;
import java.io.InputStream;

/**
 *
 * @author dev
 */
public class MyriadPro {
    Font font = null;
    public String RIO = "Muller.ttf";
    public String BPR = "Muller.otf";
    
    public Font getFont(String name, int style, float size){
        try{
            InputStream is = getClass().getResourceAsStream(name);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
            return font.deriveFont(style, size);
        }catch(Exception e){
            e.printStackTrace();
            return new Font(Utils.FONT, 0, 15);
        }finally{
            
        }
    }
    
}
