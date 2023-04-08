package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int number2;

        while (true){

            System.out.println("Proszę podać pierwszą liczbę");
            number = input.nextInt();

            if (number == 0){
                break;
            }

            System.out.println("Proszę podać drugą liczbę");
            number2 = input.nextInt();

            if (number2 == 0){
                break;
            }

            System.out.println("Wynik dodawania:");
            System.out.println(number + " + " + number2 + " = " + (number + number2));

        }



    }

}
