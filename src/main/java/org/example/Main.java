package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Przykład: gra w lotto z wykorzystaniem zbioru set i metody random()
        //Scanner scan = new Scanner(System.in);

        int[] tablica = {1, 2, 3};

        // 1 sposób wyświetlenia wartości z tablicy:
        System.out.println(Arrays.toString(tablica));

        // 2 sposób wyświetlenia wartości z tablicy:
        for(int liczba : tablica){
            System.out.println(liczba);
        }


        List<Integer> lista = new ArrayList<>();
        lista.add(5);

        System.out.println(lista);//1 sposób wyświetlenia listy

        //2 sposób wyświetlenia listy
        for(int liczba : lista){
            System.out.println(liczba);
        }

    }
}