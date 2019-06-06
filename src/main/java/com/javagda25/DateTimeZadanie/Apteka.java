package com.javagda25.DateTimeZadanie;

// Stwórz aplikację a w niej klasę Customer. Każdy Customer ma pola:
//  - wiek (int)
//  - w ciąży (boolean)
//  - nazwa/imie
//  - data i godzina dołączenia do kolejki (w konstruktorze ustawiamy datę i godzinę na null)
//
// Stwórz klasę apteka a w niej listę klientów. Apteka powinna mieć metodę:
// - dodaj osobę do kolejki -> addToQueue(Customer):void - która umieszcza klienta w kolejce i NADAJE KLIENTOWI
// CZAS DOŁĄCZENIA DO KOLEJKI JAKO LocalDateTime.now.
// - wylistuj kolejkę -> listCustomers():void - która wypisuje stan kolejki (linia pod linią klientów)
//
// - osoby starsze powinny pójść możliwie na przód kolejki jeśli mają powyżej 60 lat, jeśli nie ustawiają się
// normalnie na koniec
// - osoby w ciąży mają priorytet nad wszystkimi
// - zadanie rozwiąż przez Comperarable
// - ostatecznym kryterium porównania jest godzina dotarcia do kolejki. Jeśli dołączyliśmy do kolejki później,
// to jesteśmy na liście niżej.
//
// Zadanie ma być wykonane w formie parsera. Wykonujemy komendy:
// - nowyklient gosia 13 false
// - nowyklient marian 13 true
// (powyższe komendy prezentują dodawanie klientów)
// (gosia nie jest w ciazy, marian jest)
//
// - dodajdokolejki gosia
// (powyższa komenda prezentuje dodanie klienta do kolejki)
// - listuj

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Apteka {
    public static void main(String[] args) {
            List<Customer> kolejka = new ArrayList<>();
            kolejka.add(new Customer("Joanna", 15, false));
            kolejka.add(new Customer("Zdzisław", 75, false));
            kolejka.add(new Customer("Zuzanna", 34, true));
            kolejka.add(new Customer("Anna", 24, true));
            kolejka.add(new Customer("Kamil", 62, false));
            kolejka.add(new Customer("Kamila", 30, false));
            kolejka.add(new Customer("Bartek", 45, false));
            kolejka.add(new Customer("Irena", 61, false));

//            Collections.sort(kolejka);

            System.out.println(kolejka);
            Collections.sort(kolejka, new CustomerComparator());
            System.out.println(kolejka);

    }
}
