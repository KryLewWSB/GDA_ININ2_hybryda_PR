package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int tab1[] = {1, 2, 3};//deklaracja tablicy wraz z inicjalizacją
        int[] tab2 = {1, 2, 3};//deklaracja tablicy wraz z inicjalizacją

        String[] tablicaImion = new String[4];//Deklaracja 4 el. tablicy Stringów

        tablicaImion[0] = "Tomek";//inicjalizacja (przypisanie) wartości
        tablicaImion[1] = "Anna";//inicjalizacja wartości
        tablicaImion[2] = "Łukasz";//inicjalizacja wartości

        //Wypisanie wartości z tablicy z wykorzystaniem pętli foreach:
        for(String imie : tablicaImion){
            System.out.println(imie);
        }

    }
}