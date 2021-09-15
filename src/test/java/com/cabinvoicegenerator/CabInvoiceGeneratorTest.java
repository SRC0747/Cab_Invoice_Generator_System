package com.cabinvoicegenerator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CabInvoiceGeneratorTest {
    CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
    @Test
    public void toCalculate_Fare() {
        cabInvoiceGenerator.calculateFare();
        cabInvoiceGenerator.calculateAggregateFare();
    }
}