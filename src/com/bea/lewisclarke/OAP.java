package com.bea.lewisclarke;

public class OAP extends TicketType {
    private int OAPPrice = 0;

    OAP() {

    }

    OAP(String type) {
        super(type);
        setPrice();
    }

    public int setPrice() {
        OAPPrice = 6;
        return OAPPrice;
    }
}
