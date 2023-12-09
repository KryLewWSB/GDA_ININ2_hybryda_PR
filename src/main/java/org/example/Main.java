package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Przykład: gra w kości z wykorzystaniem metody random()
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Podaj wartość liczbową od [ 1 - 6 ]: ");
            int podanaLIczba = scan.nextInt();

            if(podanaLIczba > 0 && podanaLIczba < 7) {
                int wylosowanaWartosc = (int) (Math.random() * 5 + 1);//wartości od 1 do 6
                if (podanaLIczba == wylosowanaWartosc) {
                    System.out.println("Brawo wygrałeś!" + "\nPodana wartość w konsoli: " + podanaLIczba + "\nWylosowa wartość: " + wylosowanaWartosc);
                } else {
                    System.out.println("Niestety przegrałeś!" + "\nPodana wartość w konsoli: " + podanaLIczba + "\nWylosowa wartość: " + wylosowanaWartosc);
                }
            }else{
                System.out.println("Podałeś złą wartość! Poprawna: [ 1 - 6 ] ");
            }

        }





    }
}