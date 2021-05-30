package ru.netology;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[] { new Bill(20000, new IncomeTaxType(), taxService),
                new Bill(99999, new ProgressiveTaxType(), taxService), new Bill(100001, new ProgressiveTaxType(), taxService),
                new Bill(30000, new VATaxType(), taxService) };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}