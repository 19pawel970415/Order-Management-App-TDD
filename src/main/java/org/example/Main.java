package org.example;

public class Main {
    //Zadanie: Implementacja i Testowanie Systemu Zarządzania Zamówieniami
    //Opis:
    //Stwórz prosty system zarządzania zamówieniami dla sklepu internetowego.
    // Twoje zadanie polega na zaimplementowaniu klasy Order oraz klasy OrderService, która będzie zarządzać zamówieniami.
    // Zastosuj podejście TDD, a więc najpierw napisz testy, a następnie implementację, aby te testy przeszły.
    // Wykorzystaj JUnit i AssertJ do stworzenia testów jednostkowych.
    //
    //Krok 1: Klasa Order
    //Klasa Order powinna mieć następujące właściwości:
    //
    //id (String): unikalny identyfikator zamówienia.
    //customerName (String): nazwa klienta.
    //items (List<String>): lista przedmiotów w zamówieniu.
    //totalAmount (double): całkowita kwota zamówienia.
    //Krok 2: Klasa OrderService
    //Klasa OrderService powinna:
    //
    //Umożliwiać dodanie nowego zamówienia do listy zamówień.
    //Umożliwiać usunięcie zamówienia na podstawie jego id.
    //Umożliwiać wyszukiwanie zamówienia po id.
    //Umożliwiać zwrócenie wszystkich zamówień.
    //Umożliwiać obliczenie sumarycznej wartości wszystkich zamówień.
    //Krok 3: TDD - Implementacja Krok Po Kroku
    //Red: Napisz testy jednostkowe dla metod w OrderService, które:
    //
    //Sprawdzają dodanie zamówienia do listy.
    //Sprawdzają usunięcie zamówienia z listy.
    //Weryfikują, czy zamówienie może być znalezione na podstawie id.
    //Weryfikują, czy zwracana jest poprawna lista zamówień.
    //Sprawdzają poprawność obliczenia sumarycznej wartości zamówień.
    //Green: Implementuj metody w OrderService, tak aby przechodziły testy.
    //
    //Refactor: Uporządkuj kod, zwracając uwagę na zasady SOLID i DRY.
    //
    //Wymagania dotyczące testów:
    //Wykorzystaj JUnit do tworzenia testów.
    //W testach sprawdzających właściwości zamówienia (Order), użyj AssertJ, aby zwiększyć czytelność asercji.
    //Skorzystaj z metod cyklu życia testów (@BeforeEach, @AfterEach),
    // aby przygotować dane do testów i czyścić po nich zasoby.
    //Krok 4: Rozszerzenia (opcjonalne)
    //Dodaj możliwość aktualizacji zamówienia w OrderService.
    //Wprowadź wyjątek, jeśli próbujesz dodać zamówienie z istniejącym id.
    //Napisz testy parametryzowane, aby przetestować różne przypadki dodawania zamówień.
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}