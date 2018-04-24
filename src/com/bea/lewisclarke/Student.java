package com.bea.lewisclarke;

public class Student extends TicketType {
    private int studentPrice = 0;

    Student() {

    }

    Student(String type) {
        super(type);
        setPrice();
    }

    public int setPrice() {
        studentPrice = 6;
        return studentPrice;
    }

}
