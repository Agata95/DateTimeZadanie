package com.javagda25.DateTimeZadanie;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;

@Data
@AllArgsConstructor

public class Customer implements Comparator<Customer> {
    private String imie;
    private int wiek;
    private boolean wCiazy;

    @Override
    public int compare(Customer o1, Customer o2) {
        if (this.wiek < 60) {
            return 1;
        } else if (this.wiek > 60 && this.wiek > o1.wiek) {
            return -1;
        }
        return 0;
    }
}
