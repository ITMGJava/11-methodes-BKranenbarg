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

        //variabele rente
        float maandRente = (float) 0.055;
        System.out.println("Voer een bedrag in");
        //koppel de variabele getal aan het ingevoerde getal
        var beginBedrag = s.nextFloat();

        float totaal = berekenEindBedrag(beginBedrag, maandRente);
        //string weergeven voor rentes afgerond op 2 decimalen
        System.out.printf("%n Gespaard bedrag na 10 jaar met rente van " + maandRente + "% is $ " + ": %.2f", totaal);

    }


    private static float berekenEindBedrag(float bedrag, float rente) {
        //variabele aanmaken voor output tafel
        String output;

        // getallen van een tot tien in lus aanmaken
        for (int x = 1; x <= 10; x++) {
            //getal wordt elk jaar vermeerderd met rente r
            bedrag = bedrag + bedrag * rente;
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


