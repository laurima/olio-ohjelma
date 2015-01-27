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
public class AutoTesti {
    
    public static void main(String args[]) {
        //luodaan olio Auto-luokasta
        Auto auto = new Auto();
        auto.setMerkki("Saab");
        auto.setVuosimalli(1900);
        auto.kiihdyta();
        System.out.println(auto.getTiedot());
        
        //luodaan toinen olio Auto-luokasta
        
        Auto auto2 = new Auto("Audi", 2015, 200);
        System.out.println(auto2.getTiedot());
    }
    
}
