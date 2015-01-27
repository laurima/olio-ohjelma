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
public class Elokuva {
  String nimi, ohjaaja;
  int budjetti;
  
  //constructorit
  
  public Elokuva() {
      this.nimi = "";
      this.ohjaaja = "";
      this.budjetti = 0;
      }
  
  public Elokuva(String nimi, String ohjaaja, int budjetti) {
      this.nimi = nimi;
      this.ohjaaja = ohjaaja;
      this.budjetti = budjetti;
  }
  
  public void setNimi(String nimi) {
      this.nimi = nimi;
  }
  
  public void setOhjaaja(String ohjaaja) {
      this.ohjaaja = ohjaaja;
  }
  
  public void setBudjetti(int budjetti) {
      this.budjetti = budjetti;
  }
  
  public String getTiedot() {
      return this.nimi + " " + this.ohjaaja + " " + this.budjetti;
  }
  
}