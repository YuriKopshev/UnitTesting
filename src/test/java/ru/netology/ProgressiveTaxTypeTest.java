package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgressiveTaxTypeTest {
    private ProgressiveTaxType taxType = new ProgressiveTaxType();

    @Test
    void calculateTaxForLessThan_100000() {
        double amount = 99999.9;
        double expected = 9999.99;
        double actual = taxType.calculateTaxFor(amount);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void calculateTaxForMoreThan_100000() {
        double amount = 250000.34;
        double expected = 37500.051;
        double actual = taxType.calculateTaxFor(amount);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void calculateTaxFor_100000() {
        double amount = 100000;
        double expected = 10000;
        double actual = taxType.calculateTaxFor(amount);
        Assertions.assertEquals(expected,actual);


    }
}