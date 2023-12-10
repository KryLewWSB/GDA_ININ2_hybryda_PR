package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        int liczba = 5;

        Pracownik pracownik1 = new Pracownik("Adam", "Kowalski", Dzial.KSIEGOWOSC, 5_000);
        Pracownik pracownik2 = new Pracownik("Anna",  "Nowak", Dzial.IT, 8_000);

        pracownik1.wypiszDane();
        pracownik2.wypiszDane();
    }
}