package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {



        //Zadanie 11. Zadeklaruj zmienną przechowującą liczby całkowite i przypisz jej dowolną wartość początkową.
        //Napisz instrukcję, która w przypadku gdy wartość zmiennej jest mniejsza od zera, zamieni tę wartość na dodatnią (zachowa się jak wartość bezwzględna w matematyce). Użyj operatora warunkowego.
        //Należy wykorzystać metodę Math.abs(-5);
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int podanaLiczba = scan.nextInt();

        System.out.println( "Podana liczba to: " + Math.abs(podanaLiczba) );





    }
}