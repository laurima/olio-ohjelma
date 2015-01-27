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
public class Opiskelija {
  String etunimi,sukunimi;
  int ika;
  
  //constructorit
  
  public Opiskelija() {
      this.etunimi = "";
      this.sukunimi = "";
      this.ika = 0;
      }
  
  public Opiskelija(String etunimi, String sukunimi, int ika) {
      this.etunimi = etunimi;
      this.sukunimi = sukunimi;
      this.ika = ika;
  }
  
  public void setEtunimi(String etunimi) {
      this.etunimi = etunimi;
  }
  
  public void setSukunimi(String sukunimi) {
      this.sukunimi = sukunimi;
  }
  
  public void setIka(int ika) {
      this.ika = ika;
  }
  
  public String getTiedot() {
      return this.etunimi + " " + this.sukunimi + " " + this.ika;
  }
  
}
