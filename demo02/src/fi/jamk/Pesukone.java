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
public class Pesukone {
    //ominaisuudet
    boolean pese;
    boolean linkous;
    int aika;
    int ohjelma;
    
    //luokan alustajat eli constructorit
    //"PO:" Auto auto = new Auto();
    
    public Pesukone(){
            this.pese = false;
            this.linkous = false;
            this.aika = 0;
            this.ohjelma = 0;
    }
    
    // "PO:" Auto auto = new Auto("Saab",1900,70);
    public Pesukone(boolean pese, boolean linkous, int aika, int ohjelma){
        this.pese = false;
        this.linkous = false;
        this.aika = 0;
        this.ohjelma = 0;
    }

    //metodi pesee
    public void pyorita() {
        this.pese = true;
}
    //metodi linkoaa
    public void linkous() {
        this.linkous = true;
    }
    
    //metodi säätää pesuaikaa
    public void aika() {
        this.aika++;
    }
    
    //metodi säätää ohjelmaa
    public void ohjelma() {
        this.ohjelma++;
    }
    
    //metodi palauttaa pesukoneen pesutilan
    public boolean getPese() {
        return this.pese;
    }
    
    //metodi palauttaa pesukoneen linkoustilan
    public boolean getLinkous() {
        return this.linkous;
    }
    
    //metodi palauttaa pesukoneen pesuajan
    public int getAika() {
        return this.aika;
    }
    
    //metodi palauttaa ohjelman numeron
    public int getOhjelma() {
        return this.ohjelma;
    }
    
    //metodi palauttaa koneen kaikki tiedot
    public void getTiedot() {
    return "pesutila: " + this.pese + " linkoustila: " + this.linkous + " aika:  " + this.aika + " ohjelman numero: " + this.ohjelma;
    }
    
    //metodi asettaa koneen pesutilaan
    public void setPese(boolean pese) {
        this.pese = pese;
    }
    
    //metodi asettaa koneen linkoustilaan
    public void setLinkous(boolean linkous) {
        this.linkous = linkous;
    }
    
    //metodi asettaa koneen ajan
    public void setAika(int aika) {
        this.aika = aika;
    }
    
    //metodi asettaa koneen ohjelman
    public void setOhjelma(int ohjelma) {
        this.ohjelma = ohjelma;
    }
}
