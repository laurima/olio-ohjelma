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
public class Kulkuneuvo {
    
    //ominaisuudet
    int nopeus;
    String nimi;
    
    //constructorit
    public Kulkuneuvo(){
        this.nopeus = 0;
        this.nimi = "";
    }
  
    public Kulkuneuvo(String nimi, int nopeus) {
        this.nimi = nimi;
        this.nopeus = nopeus;
    }
    //metodit
    public void asetaNopeus(int nopeus) {
        this.nopeus = nopeus;
    }
    
    public void asetaNimi(String nimi) {
        this.nimi = nimi;
    }
    
    public String tulostaTiedot() {
        return this.nopeus + " " + this.nimi;
    }
    
    public String palautaNimi() {
        return this.nimi;
    }
    
}
