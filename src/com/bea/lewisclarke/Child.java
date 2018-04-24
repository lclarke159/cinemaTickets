package com.bea.lewisclarke;

public class Child extends TicketType {
    private int childPrice = 0;

    Child() {

    }

    Child(String type) {
        super(type);
        setPrice();
    }

    public int setPrice() {
        childPrice = 4;
        return childPrice;
    }

}

