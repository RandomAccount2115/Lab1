package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class NumberSystemConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.println("Proszę podać liczbę:");

        number = input.nextInt();

        System.out.println("DEC = " + NumberSystemConverter.leftPad(8, '0', Integer.toString(number)) + " BIN = " + NumberSystemConverter.leftPad(8, '0', Integer.toBinaryString(number)) + " HEX = " + NumberSystemConverter.leftPad(8, '0',Integer.toHexString(number)));

    }

    private static String leftPad(int width, char charToFill,  String toAdd){

        int counter = toAdd.length();

        for (int i = counter; i <= width; i++){

            toAdd = charToFill + toAdd;

        }

        return toAdd;

    }

}
