import java.util.Scanner;

public class Methodes {

    public static void main(String[] args) {

        helloWorld();
        groet();
        Scanner s = new Scanner(System.in);
        System.out.println("Wat is je naam?");
        String naam = s.nextLine();
        //    groet(naam);

        String output = groet(naam);
        System.out.println(output);

        System.out.println("Welk bedrag wil je inleggen?");
        float bedrag = s.nextFloat();
        System.out.println("Hoeveel jaar wil je sparen?");
        int jaar = s.nextInt();


        float totaal = berekenEindBedrag(bedrag, jaar, naam);
        //string weergeven voor rentes afgerond op 2 decimalen
        System.out.printf("Na " + jaar + " jaar heb je dit bedrag op je rekening staan: %.2f", totaal);

    }


    private static float berekenEindBedrag(float bedrag, int jaar, String naam) {
        float rente;
        if (bedrag > 1000) {
            rente = (float) 0.002;
        } else if (bedrag >= 600 & bedrag <= 1000) {
            rente = (float) 0.01;
        } else if (bedrag >= 300 & bedrag < 600) {
            rente = (float) 0.02;
        } else if (bedrag >= 100 & bedrag < 300) {
            rente = (float) 0.03;
        } else if (bedrag >= 0 & bedrag < 100) {
            rente = 0;
        } else {
            rente = (float) 0.1;
        }

        if (bedrag >= 0) {
            //string voor weergeven ingevoerde gegevens en bijbehorende rente
            String zin = "Beste " + naam + ", met een beginbedrag van " + bedrag + " krijg je een jaarlijkse rente van " + rente * 100 + "%";
            //zin weergeven
            System.out.println(zin);
        } else {
            //string voor weergeven ingevoerde gegevens en bijbehorende rente
            String zin = "Beste " + naam + ", met een schuld van " + bedrag + " heb je een jaarlijkse debetrente van " + rente * 100 + "%";
            //zin weergeven
            System.out.println(zin);
        }

        // getallen van een tot aantal jaar in lus aanmaken
        for (int x = 1; x <= jaar; x++) {
            //getal wordt elk jaar vermeerderd met rente r
            bedrag = bedrag + bedrag * rente;
            //string weergeven voor rentes afgerond op 2 decimalen

        }

        return bedrag;
    }

    static void helloWorld() {
        System.out.println("Hello World!");
    }


    static void groet() {
        System.out.println("Hallo, User!");
    }

    //   static void groet(String naam) {
    //       System.out.println("Hallo " + naam);
    //   }

    static String groet(String name) {
        String output = "Hallo " + name;
        return output;
    }


}

    /*

            ```
            - Schrijf een methode ```static String groet(String naam)``` met als input een naam die een begroeting begroeting teruggeeft met een ingevoerde naam. *Merk op dat je een compiler error krijgt*. Verwijder de methode ```static void groet(String naam)``` of plaats hem in commentaar. De compiler error zal dan verdwijnen. Roep deze methode aan en druk de output af:
            ```bash
    Hallo, Jan!
            ```
            **Merk op dat voorgaande 3 methodes allen dezelfde naam hebben. Dit wordt in Java overloading genoemd. De methodes worden onderscheiden door een verschillend aantal parameters of verschillende types parameters. Daarom konden de 2e en 3e methode niet tegelijkertijd bestaan.**
            - Hergebruik voor de laatste opgave delen van de code van de opdracht Spaarbedrag. Schrijf een methode ```static float berekenEindBedrag(float beginBedrag, float maandRente)``` met als input een beginbedrag en een maandpercentage en als output het eindbedrag berekent na 10 jaar. Vraag in het hoofdprogramma aan de gebruiker een bedrag en een rentepercentage en roep vervolgens deze methode aan en druk het eindbedrag af.
  ```bash
    Voer een bedrag in:
            1000
    Voer een maandrente in:
            2
    Uw eindbedrag bedraagt na 10 jaar:
            10765.137
            ````
            **Optioneel**

            - Formateer het eindbedrag:
            ```bash
  10.765,14
          ```

     */


