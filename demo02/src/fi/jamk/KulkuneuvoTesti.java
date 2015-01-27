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
public class KulkuneuvoTesti {
    public static void main(String args[]) {
        Kulkuneuvo kulkuneuvo = new Kulkuneuvo();
        kulkuneuvo.asetaNimi("Saab");
        kulkuneuvo.asetaNopeus(100);
        System.out.println(kulkuneuvo.tulostaTiedot());
    }
    
    
}
