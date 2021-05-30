package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VATaxTypeTest {
    private VATaxType taxType = new VATaxType();

    @Test
    void calculateTaxFor() {
        double amount = 134567.67;
        double expected = 24222.1806;
        double actual = taxType.calculateTaxFor(amount);
        Assertions.assertEquals(expected, actual);
    }
}