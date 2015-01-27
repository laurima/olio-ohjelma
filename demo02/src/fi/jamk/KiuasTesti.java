/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk;

/**
 *
 * @author lauri
 */
public class KiuasTesti {
    
    public static void main(String args[]){
        //luodaan olio kiuas luokassa
        Kiuas kiuas = new Kiuas();
        kiuas.setKohdeaste(100);
        kiuas.setMerkki("Harvia");
        System.out.println(kiuas.getTiedot());
        
        //luodaan toinen kiuas olio
        
        Kiuas kiuas2 = new Kiuas(0, 0, "Harvia");
        System.out.println(kiuas2.getTiedot());
        kiuas2.setKohdeaste(100);
        
    }
    
}
