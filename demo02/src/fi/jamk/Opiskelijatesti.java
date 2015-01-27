/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk;

import java.util.Scanner;

/**
 *
 * @author lauri
 */
public class Opiskelijatesti {
    public static void main(String args[]) {
        String[] rekisteri;
    rekisteri = new String[5];
    
    
        Opiskelija opisk1 = new Opiskelija("a", "b", 100);
        Opiskelija opisk2 = new Opiskelija("c", "d", 1000);
        Opiskelija opisk3 = new Opiskelija("e", "f", 10000);
        Opiskelija opisk4 = new Opiskelija("g", "h", 101010);
        Opiskelija opisk5 = new Opiskelija("i", "j", 121212);
    
    for (int i = 0; i > 5;i++){
       rekisteri[i] = opisk[i].getTiedot;
        }
    for (int j = 0; j > 5; j++) {
        System.out.println(rekisteri[j]);
    }
    
}
}
