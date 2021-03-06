package it.polito.ezshop.data.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicketEntryTest {

    private static final TicketEntryClass ticketEntry = new TicketEntryClass(null, null, null, 0, 0, 0);


    @Test
    public void testSetId() {
        ticketEntry.setId(1);
        assertEquals(ticketEntry.getId(), Integer.valueOf(1));
    }

    @Test
    public void testSetBarCode() {
        ticketEntry.setBarCode("1");
        assertEquals(ticketEntry.getBarCode(), "1");

    }

    @Test
    public void testSetProductDescription() {
        ticketEntry.setProductDescription("prova");
        assertEquals(ticketEntry.getProductDescription(), "prova");
    }

    @Test
    public void testSetAmount() {
        ticketEntry.setAmount(1);
        assertEquals(Integer.valueOf(ticketEntry.getAmount()), Integer.valueOf(1));
    }

    @Test
    public void testSetPricePerUnit() {
        ticketEntry.setPricePerUnit(1.0);
        assertEquals(ticketEntry.getPricePerUnit(), 1.0, 0.01);
    }

    @Test
    public void testSetDiscountRate() {
        ticketEntry.setDiscountRate(1.0);
        assertEquals(ticketEntry.getDiscountRate(), 1.0, 0.01);
    }

}
