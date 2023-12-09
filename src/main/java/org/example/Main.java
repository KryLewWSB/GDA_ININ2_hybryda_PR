package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] tablicaLiczb = new int[5];

        //Pętl przyjmująca wartości do tablicy
        for(int i = 0; i < tablicaLiczb.length; i++){
            System.out.println("Podaj liczbę numer " + (i+1));
            tablicaLiczb[i] = scan.nextInt();
        }

        //Wypisanie wartości z tablicy:
        for(int liczba : tablicaLiczb){
            System.out.println(liczba);
        }


    }
}