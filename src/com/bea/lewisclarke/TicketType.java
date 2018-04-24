package com.bea.lewisclarke;

public abstract class TicketType {
    private String getTicketType;

    TicketType() {

    }

    TicketType(String type) {this.getTicketType = type;

    }

    public void setType(String getTicketType) {
        this.getTicketType = getTicketType;
    }

    public String getType() { return this.getTicketType; }
    public abstract int setPrice();


}
