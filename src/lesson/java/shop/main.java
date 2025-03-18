package lesson.java.shop;

import java.math.BigDecimal;

public class main {
public static void main(String[] args) {
    
    Prodotto prodottoDiProva = new Prodotto("Prodotto Generico", "Marca Generica", new BigDecimal(24) );

    System.out.println(prodottoDiProva.dettagliProdotto());
    System.out.println(prodottoDiProva.getPrezzoIvato());

    // istanzio una classe cuffia di prova
    Cuffie cuffiaSony = new Cuffie("Cuffia", "Sony", new BigDecimal(106), false,  "rosse");
    System.out.println(cuffiaSony.dettagliProdotto());
    System.out.println(cuffiaSony.getPrezzoIvato());

    // istanzio una classe smartphone di prova
    Smartphone Iphone = new Smartphone("Iphone","Apple", new BigDecimal(1200), 2);
    System.out.println(Iphone.dettagliProdotto());
    System.out.println(Iphone.getPrezzoIvato());
    
// istanzio una televisione di prova
Televisione SamsungTv = new Televisione("MaximTv","Samsung", new BigDecimal(600), true,57);
System.out.println(SamsungTv.dettagliProdotto());
    System.out.println(SamsungTv.getPrezzoIvato());

}
}
