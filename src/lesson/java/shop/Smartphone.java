package lesson.java.shop;

import java.math.BigDecimal;
import java.util.Random;
// creo le var della classe figlia
public class Smartphone extends Prodotto {
    protected int codiceIMEI;
    protected int memory;
// creo costruttore con le var uniche quelle ereditate
    public Smartphone(String nome, String marca, BigDecimal prezzo, int memory){
        super(nome,marca,prezzo);
        Random randomNum = new Random();
        this.codiceIMEI = randomNum.nextInt(9999);
        this.memory = memory;

    }
    // creo i getter e setter
    public int getCodice(){
        return this.codiceIMEI;
    }

    public void setMemory(int memory){
        this.memory = memory;
    }
 
    public int getMemory(){
        return this.memory;
    }
// faccio override del metodo dei dettagli per inserire i dettagli unici
    @Override 
public String dettagliProdotto(){
    return codice +" - "+ nome + " " + marca + " " + memory +"Gb" +" " + codiceIMEI; 
}
}
