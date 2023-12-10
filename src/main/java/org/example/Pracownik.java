package org.example;

public class Pracownik implements InformacjeOPracowniku {
    protected String imie;
    protected String nazwisko;
    protected Dzial dzial;
    protected int wynagrodzenie;

    public Pracownik(String imie, String nazwisko, Dzial dzial, int wynagrodzenie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dzial = dzial;
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    public void wypiszDane() {
        System.out.println("\n------------------------" +
                            "\nImię pracownika: " + this.imie +
                            "\nNazwisko pracownika: " + this.nazwisko +
                            "\nDział pracownika: " + this.dzial +
                            "\nWynagrodzenie pracownika: " + this.wynagrodzenie +
                            "\n------------------------");
    }
}
