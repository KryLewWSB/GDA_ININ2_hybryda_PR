package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            //1. Start
            Scanner scan = new Scanner(System.in);
            //2. Podaj a (blok wejścia / wyjścia)
            System.out.println("Podaj a:");
            int a = scan.nextInt();
            //3. Podaj b (blok wejścia / wyjścia)
            System.out.println("Podaj b:");
            int b = scan.nextInt();
            //4. Podaj c (blok wejścia / wyjścia)
            System.out.println("Podaj c:");
            int c = scan.nextInt();
            //5. Wyliczenie sumy (blok operacji)
            int suma = a + b + c;
            //6. Blok wyjścia wypisz suma:
            System.out.println("Suma wartości a, b i c: " + suma);
            //7. stop
        }catch (Exception ex){
            System.out.println("Wyjątek: " + ex);
        }
    }
}