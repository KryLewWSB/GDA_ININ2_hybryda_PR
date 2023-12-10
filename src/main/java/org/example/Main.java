package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);

        List<Pracownik> listaPracownikow = new ArrayList<>();
        listaPracownikow.add( new Pracownik("Adam", "Kowalski", Dzial.KSIEGOWOSC, 5_000 ));
        listaPracownikow.add( new Pracownik("Anna",  "Nowak", Dzial.IT, 8_000 ));

        Kierownik kierownik1 = new Kierownik("Tomasz",
                                            "Kowal",
                                                    Dzial.IT,
                                        9_000,
                                                    2_000);

        for(Pracownik pracownik : listaPracownikow){
            pracownik.wypiszDane();
        }

        kierownik1.wypiszDane();
    }
}