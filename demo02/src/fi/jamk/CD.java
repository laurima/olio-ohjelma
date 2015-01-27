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
public class CD {
    
    int nro;
    int pituus;
    String kplnimi;
    String levynimi;
    
    //constructorit
    public CD() {
    this.nro = 0;
    this.pituus = 0;
    this.kplnimi = "";
    this.levynimi = "";
}
    
    public CD(int nro, int pituus, String kplnimi, String levynimi) {
    this.nro = nro;
    this.pituus = pituus;
    this.kplnimi = kplnimi;
    this.levynimi = levynimi;
    }
    //metodit
    public void setNro(int nro) {
        this.nro = nro;
    }
    
    public void setPituus(int pituus) {
        this.pituus = pituus;
    }
    
    public void setKplnimi(String kplnimi) {
        this.kplnimi = kplnimi;
    }
 
    public void setLevynimi(String levynimi) {
        this.levynimi = levynimi;
    }
    
    public String getTiedot() {
        return this.levynimi + " " + this.kplnimi + " " + this.nro + " " + this.pituus;
    }
}
