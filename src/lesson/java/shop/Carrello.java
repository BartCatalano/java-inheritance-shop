package lesson.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
    //  creo un array di tipo Prodotto che contiene i prodotti selezionati
    Prodotto[] prodotti = new Prodotto[2];
    // creo il systemin per fare da scanner
 Scanner input = new Scanner(System.in);

//  creo un ciclo for che mi stampa il nome la mrca, il prezzo e la categoria

   for (int i = 0; i < prodotti.length; i++) {
    // creo il systemout del nome del prodotto scannerizzato
     System.out.println("Nome del Prodotto : ");
        String nome = input.nextLine();

        System.out.println("Marca del Prodotto : ");
        String marca = input.nextLine();

        System.out.println("Prezzo del Prodotto senza iva : ");
          int prezzo = Integer.parseInt(input.nextLine());

          System.out.println("A quale categoria appartiene? (scrivi Tv, Smartphone o cuffie )");
          String categoriaProdotto = input.nextLine();

          switch (categoriaProdotto.toLowerCase()){
            
            case "Tv":

            System.out.println("Dimensioni della TV in pollici: ");
            int pollici = Integer.parseInt(input.nextLine());

            System.out.println("è smart tv?: ");
            boolean SMART = Boolean.parseBoolean(input.nextLine());

            Televisione Tv = new Televisione(nome, marca, new BigDecimal(prezzo), SMART, pollici );

            break;

            case "smartphone":

            System.out.println("Gygabite di memoria : ");
          int memory = Integer.parseInt(input.nextLine());

        
          Smartphone smartphone = new Smartphone(nome, marca, new BigDecimal(prezzo), memory);

          break;

          case "cuffie":

          System.out.println("colore delle cuffie: ");

          String colore = input.nextLine();

          System.out.println("Sono Wireless? (inserisci True o False)");

          boolean cablate = Boolean.parseBoolean(input.nextLine());

          Cuffie cuffie = new  Cuffie(nome, marca, new BigDecimal(prezzo), cablate, colore);

          break;

          }

          System.out.println("---------------");

        

   }

   input.close();

System.out.println("Ecco il tuo carrello");
for (int i = 0; i < prodotti.length; i++){
    System.out.println(prodotti[i]);
    System.out.println("---------------");
}

            }

}
