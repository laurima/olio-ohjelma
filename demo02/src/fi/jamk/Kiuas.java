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
public class Kiuas {
    //ominaisuudet
    int aste;
    int kohdeaste;
    String merkki;
    
    //luokan alustajat eli constructorit
    //"PO:" Kiuas kiuas = new Kiuas();
    
    public Kiuas(){
    this.aste = 0;
    this.kohdeaste = 0;
    this.merkki = "";
}
    // "PO:" Kiuas kiuas = new Kiuas(0,100,"Harvia");
    public Kiuas(int aste, int kohdeaste, String merkki){
        this.aste = aste;
        this.kohdeaste = kohdeaste;
        this.merkki = merkki;
    }
    
    //metodi kasvattaa kiukaan lämpötilaa
    public void lammita() {
        this.aste++;
    }
    
     //metodi laskee kiukaan lämpötilaa
    public void jaahdyta() {
        this.aste--;
    }
    
    //metodi palauttaa kiukaan lämpötilan
    public int getAste() {
        return this.aste;
    }
    
    //metodi palauttaa kiukaan kohdelämpötilan
    public int getKohdeaste() {
        return this.kohdeaste;
    }
    
    //metodi palauttaa kiukaan kohdelämpötilan
    public String getMerkki() {
        return this.merkki;
    }
    
    //metodi palauttaa auton kaikki ominaisuudet yhtenä merkkijonona
     public String getTiedot() {
         return this.aste + " " + this.kohdeaste + " " + this.merkki;
     }
     
     //metodi muuttaa kiukaan kohdelämpötilaa
    public void setKohdeaste(int kohdeaste) {
        this.kohdeaste = kohdeaste;
    }
    
    //metodi muuttaa kiukaan merkkiä
    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }
     
}
