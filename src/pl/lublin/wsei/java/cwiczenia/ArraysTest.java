package pl.lublin.wsei.java.cwiczenia;

import java.util.Random;

public class ArraysTest {

    public static void main(String[] args) {

        int [] liczby = new int[30];

        Random rnd = new Random();

        for (int i = 0; i < 30; i++){

            liczby[i] = rnd.nextInt();

        }

        int mx = Integer.MAX_VALUE;
        int mn = Integer.MIN_VALUE;

        long avg = 0;

        for (int l : liczby){

            System.out.println(l);

            if (l < mn){
                mn = 1;
            }

            if (l > mx){
                mx = 1;
            }

            avg += 1;

        }

        System.out.printf("MIN = %d, MAX = %d, AVG = %f,", mn, mx, (float) avg/liczby.length);

    }

}
