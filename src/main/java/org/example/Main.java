package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Przykład: gra w lotto z wykorzystaniem zbioru set i metody random()
        Scanner scan = new Scanner(System.in);

        //KROK 1: Przyjmujemy 6 wartości z konsoli i zapisujemy je do zbioru set.
        Set<Integer> liczbyUzytkownika = new HashSet<>();
        while (liczbyUzytkownika.size() < 6){
            System.out.println("Podaj liczbę: [1-48]");
            int liczbaOdebrana = scan.nextInt();
            if(liczbaOdebrana > 0 && liczbaOdebrana < 49) {
                liczbyUzytkownika.add(liczbaOdebrana);
            }else{
                System.out.println("Podałeś złą wartość! Podaj jeszcze raz liczbę...");
            }
        }

        System.out.println("Wartości podane przez użytkownika: " + liczbyUzytkownika);

        //KROK 2: Wygenerować losowe 6 wartości:
        Set<Integer> liczbyWylosowane = new HashSet<>();
        while (liczbyWylosowane.size() < 6){
            int losowanieWartosci = (int)(Math.random() * 47 + 1);//generowanie wartości od 1-48
            liczbyWylosowane.add(losowanieWartosci);
        }

        System.out.println("Wartości wylosowane: " + liczbyWylosowane);

        //KROK 3: sprawdzenie trafionych wartości:
        Set<Integer> liczbyTrafione = new HashSet<>();
        for(int liczba : liczbyUzytkownika){
            if(liczbyWylosowane.contains(liczba)){
                liczbyTrafione.add(liczba);
            }
        }

        //KROK 4: Wypisanie trafionych wartości:
        System.out.println("Wartości trafione: " + liczbyTrafione + "\nLiczba trafionych: " + liczbyTrafione.size());

    }
}