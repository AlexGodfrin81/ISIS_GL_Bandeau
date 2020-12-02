/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;

/**
 *
 * @author ALEX
 */
public class Effets {
    
    Color[] listColor = {Color.RED,Color.BLUE,Color.GREEN,Color.YELLOW,Color.ORANGE,Color.MAGENTA};
    String[] fontName = {"Monospaced","SansSerif","Dialog"};
    
    public Effets(){}
    
    public Color randomColor(){
        Random rng = new Random();
        return listColor[rng.nextInt(listColor.length)];
    }
    
    public String jeuPendu(String s){
        String res = "";
        for (int i =0; i<s.length();i++){
            res+="_";
        }
        return res;
    }
    
    public String jeuPenduResolution(String pendu, String text){
        Random rng = new Random();
        int index = rng.nextInt(text.length());
        Character lettre = text.charAt(index);
        char[] tab = pendu.toCharArray();
        tab[index] = lettre;
        return String.valueOf(tab);
    }
    
    public Font randomFont(int taille){
        Random rng = new Random();
        return new Font(fontName[rng.nextInt(fontName.length)],Font.PLAIN,taille);
    }
    
}
