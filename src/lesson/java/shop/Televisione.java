package lesson.java.shop;

import java.math.BigDecimal;

public class Televisione extends Prodotto {
    protected boolean smart;
    protected int pollici;

    public Televisione(String nome,String marca, BigDecimal prezzo, boolean smart, int pollici){
        super(nome,marca,prezzo);
        this.smart = smart;
        this.pollici = pollici;
    }

    public boolean setSmart(){
        return this.smart;
    }
    
    public void getSmart(boolean smart){
        this.smart = smart;
    }

    public void setPollici(int pollici){
        this.pollici = pollici;
    }
 
    public int getPollici(){
        return this.pollici;
    }
    @Override 
    public String dettagliProdotto(){
        return codice +" - "+ nome + " " + marca + " " + pollici + " pollici";
    }

}
