package lesson.java.shop;

import java.math.BigDecimal;

public class main {
public static void main(String[] args) {
    
    Prodotto prodottoDiProva = new Prodotto("Prodotto Di Prova", "Marca Di Prova", new BigDecimal(24) );

    System.out.println(prodottoDiProva.dettagliProdotto());
    System.out.print(prodottoDiProva.getPrezzoIvato());

}
}
