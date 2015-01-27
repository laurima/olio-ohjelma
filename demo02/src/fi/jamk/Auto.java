
package fi.jamk;

/**
 *
 * @author lauri
 */
public class Auto {
    //ominaisuudet
    String merkki;
    int vuosimalli;
    int vuosiluku;
    int nopeus;
    
    //luokan alustajat eli constructorit
    //"PO:" Auto auto = new Auto();
    public Auto(){
        this.merkki = "";
        this.vuosimalli = 0;
        this.nopeus = 0;
    }
    // "PO:" Auto auto = new Auto("Saab",1900,70);
    public Auto(String merkki, int vuosimalli, int nopeus){
        this.merkki = merkki;
        this.vuosimalli = vuosimalli;
        this.nopeus = nopeus;
    }
    
    //metodi kasvattaa auton nopeutta
    public void kiihdyta() {
        this.nopeus++;
    }
    
    //metodi vähentää auton nopeutta
    public void jarruta() {
        this.nopeus--;
    }
    
    //metodi palauttaa auton merkin
    public String getMerkki() {
        return this.merkki;
    }
    
   //metodi palauttaa auton vuosimallin
    public int getVuosimalli() {
        return this.vuosimalli;
    }
    
    //metodi palauttaa auton nopeuden
    public int getNopeus() {
        return this.nopeus;
    }
    
    //metodi palauttaa auton kaikki ominaisuudet yhtenä merkkijonona
     public String getTiedot() {
         return this.merkki + " " + this.vuosimalli + " " + this.nopeus;
     }
    
    //metodi muuttaa auton merkkiä
    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }
    
    //metodi muuttaa auton vuosimallia
    public void setVuosimalli(int vuosimalli) {
        this.vuosimalli = vuosimalli;
    }
    
    }
