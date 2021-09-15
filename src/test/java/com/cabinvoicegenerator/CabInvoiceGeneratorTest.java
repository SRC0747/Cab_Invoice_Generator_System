package com.cabinvoicegenerator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CabInvoiceGeneratorTest {
    CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
    @Test
    public void toCalculate_Fare() {
        cabInvoiceGenerator.calculateFare();
    }

    @Test
    public void toCalculate_Aggregate_Fare() {
        cabInvoiceGenerator.calculateAggregateFare();
    }

    @Test
    public void toDisplay_EnhancedInvoice() {
        cabInvoiceGenerator. displayEnhancedInvoice();
    }

    @Test
    public void toCheck_Ride() {
        cabInvoiceGenerator.rideDetail();
    }

    @Test
    public void toCheck_RideCategory() {
        cabInvoiceGenerator.rideCategory();
    }
}