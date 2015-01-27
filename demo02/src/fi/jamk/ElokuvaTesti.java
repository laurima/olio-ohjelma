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
public class ElokuvaTesti {
    public static void main(String args[]) {
        Elokuva elokuva = new Elokuva("Elokuva", "ohjaaja", 10);
        System.out.println(elokuva.getTiedot);
        Elokuva elokuva2 = new Elokuva("Jatko-osa", "Toinen ohjaaja", 100);
        System.out.println(elokuva2.getTiedot);
    }
    
}
