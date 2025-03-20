package lesson.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

// creo le var della superclasse condivise da tutte le sottoclassi
public class Prodotto {
protected String nome;
protected int codice;
protected String marca;
protected BigDecimal prezzo;
protected BigDecimal iva;


// creo un costruttore dove codice e iva solo di sola lettura e il resto di scrittura
public Prodotto(String nome, String marca, BigDecimal prezzo){
Random randomNum = new Random();
this.codice = randomNum.nextInt(9999);
this.nome = nome;
this.marca = marca;
this.prezzo = prezzo;
this.iva = new BigDecimal("0.22");
} 
// creo le var aperte per scrittura e lettura
public String getNome(){
    return this.nome;
}

public void setNome(String nome){
    this.nome = nome;
}

public String getMarca(){
    return this.marca;
}

public void setMarca(String marca){
    this.marca = marca;
}

public BigDecimal getPrezzo(){
    return this.prezzo;
}

public void setPrezzo( BigDecimal prezzo){
    this.prezzo = prezzo;
}
// creo le var aperte solo per lettura
public BigDecimal getIva(){
    return this.iva;
}

public int getCodice(){
    return this.codice;
}

public BigDecimal getPrezzoIvato(){
    if(prezzo != null ){
      return prezzo.add(prezzo.multiply(iva).setScale(2,RoundingMode.DOWN));
    }
    return null;
 }

public String toString(){
    return codice +" - "+ nome + " " + marca;
}



}





