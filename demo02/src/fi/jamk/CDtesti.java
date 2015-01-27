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
public class CDtesti {
    public static void main(String args[]) {
        CD cd = new CD(1, 2, "levy", "kappale");
        System.out.println(cd.getTiedot());
    }
}
