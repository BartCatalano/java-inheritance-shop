package lesson.java.shop;

import java.math.BigDecimal;
// creo le var della classe figlia
public class Cuffie extends Prodotto {
    protected boolean cablate;
    protected String colore;
// creo costruttore con le var della superclasse e della classe figlia
public Cuffie(String nome, String marca, BigDecimal prezzo, boolean cablate, String colore){
    // eredito le var della superclasse
    super(nome,marca,prezzo);
    this.cablate = cablate;
    this.colore = colore;
}
// creo i setter e getter
public String getColore(){
    return this.colore;
}

public void setColore(String colore){
    this.colore = colore;
}

public boolean setCablate(){
    return this.cablate;
}

public void getCablate(boolean cablate){
    this.cablate = cablate;
}

@Override 
public String dettagliProdotto(){
    return codice +" - "+ nome + " " + marca + " " + colore; 
}


}
