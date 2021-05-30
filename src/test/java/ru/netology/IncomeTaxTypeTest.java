package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTaxTypeTest {
    private IncomeTaxType tax = new IncomeTaxType();

    @Test
    void calculateTaxFor() {
     double amount = 1050.6;
     double expected = 136.578;
     double actual = tax.calculateTaxFor(amount);
     Assertions.assertEquals(expected,actual);
    }
}