package lesson.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Prodotto[] prodotti = new Prodotto[2];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < prodotti.length; i++) {
            System.out.println("Nome del Prodotto: ");
            String nome = input.nextLine();

            System.out.println("Marca del Prodotto: ");
            String marca = input.nextLine();

            System.out.println("Prezzo del Prodotto senza IVA: ");
            BigDecimal prezzo = new BigDecimal(input.nextLine());

            System.out.println("A quale categoria appartiene? (scrivi tv, smartphone o cuffie)");
            String categoriaProdotto = input.nextLine().toLowerCase();

            switch (categoriaProdotto) {
                case "tv":
                    System.out.println("Dimensioni della TV in pollici: ");
                    int pollici = input.nextInt();
                    input.nextLine(); // Consuma il newline

                    System.out.println("È Smart TV? (si/no): ");
                    boolean SMART = input.nextLine().trim().equalsIgnoreCase("si");

                    prodotti[i] = new Televisione(nome, marca, prezzo, SMART, pollici);
                    break;

                case "smartphone":
                    System.out.println("Gigabyte di memoria: ");
                    int memory = input.nextInt();
                    input.nextLine(); // Consuma il newline

                    prodotti[i] = new Smartphone(nome, marca, prezzo, memory);
                    break;

                case "cuffie":
                    System.out.println("Colore delle cuffie: ");
                    String colore = input.nextLine();

                    System.out.println("Sono Wireless? (si/no): ");
                    boolean wireless = input.nextLine().trim().equalsIgnoreCase("si");

                    prodotti[i] = new Cuffie(nome, marca, prezzo, wireless, colore);
                    break;

                default:
                    System.out.println("Categoria non valida, riprova.");
                    i--; // Per ripetere la richiesta
                    continue;
            }

            System.out.println("---------------");
        }

        input.close();

        System.out.println("Ecco il tuo carrello:");
        for (Prodotto prodotto : prodotti) {
            System.out.println(prodotto);
            System.out.println("---------------");
        }
    }
}

