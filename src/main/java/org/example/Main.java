package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        int liczba = 5;

        Pracownik pracownik1 = new Pracownik();
        pracownik1.imie = "Adam";
        pracownik1.nazwisko = "Kowalski";

        Pracownik pracownik2 = new Pracownik();
        pracownik2.imie = "Anna";
        pracownik2.nazwisko = "Nowak";
        System.out.println("Imię pierwszego pracownika: " + pracownik1.imie +
                            "\nNazwisko pierwszego pracownika:" + pracownik1.nazwisko);
        System.out.println("Imię drugiego pracownika: " + pracownik2.imie +
                            "\nNazwisko drugiego pracownika:" + pracownik2.nazwisko);
    }
}