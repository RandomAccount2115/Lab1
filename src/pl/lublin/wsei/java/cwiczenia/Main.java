package pl.lublin.wsei.java.cwiczenia;

/** Komentarz javadoc
 *
 * @author Student
 * @version 1.0
 *
 *
 * */

public class Main {

    public static void main(String[] args) {

        // Komentarz jednolinijkowy

        /*
        Komentarz wielolinijkowy
         */

        System.out.println("Losowy tekst\n");

        System.out.print("Kilka");
        System.out.print("losowych");
        System.out.print("wyrazów");

        System.out.println();
        System.out.println();

        System.out.println("Kilka");
        System.out.println("losowych");
        System.out.println("wyrazów");

        System.out.println();

        System.out.print("Kilka\n");
        System.out.print("losowych\n");
        System.out.print("wyrazów\n");

        System.out.println();


        int a = 39;
        double b = 2.99;
        String s = "Losowy tekst";

        System.out.printf("a = %d, b = %f, s = %s %n", a, b, s);

        System.out.printf("a = %d, b = %.2f, s = %20s %n", a, b, s);

        System.out.println();

        System.out.println("Tekst z użyciem \"apostrofu\"");

        System.out.println();

        System.out.printf("alfa\tsin(alfa)\n");

        for (int i = 0; i < 370; i += 10){

            System.out.printf("%d\t%f\t\n", i, Math.sin(i/360.0*2*Math.PI));

        }

        System.out.println();

        System.out.println("Tableka logarytmów");

        System.out.println();

        System.out.println("agr     log2(arg)     sum(arg)");
        System.out.println(" 1          0             1");
        System.out.println(" 2          1             3");
        System.out.println(" 4          2             7");

        System.out.println();



    }

}
