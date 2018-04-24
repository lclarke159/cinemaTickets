package com.bea.lewisclarke;

import java.util.Scanner;  //for inputs


public class Main {
    static int[] type;                          //type of tickets
    static int numberoftickets;                // number of tickets
    static int totalPrice = 0;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        TicketType tic;
        Standard std = new Standard();
        OAP oap = new OAP();
        Student stu = new Student();
        Child cld = new Child();
//Get inputs for ticket types etc
        System.out.println("Please enter the total number of tickets required");
        numberoftickets = s.nextInt();
        System.out.println("Please enter day of week");
        String day = s.next();
        type = new int[numberoftickets];
        System.out.println("Please enter type of ticket: \n1-Standard\n2-OAP\n3-Student\n4-Child");
        for (int i = 0; i < numberoftickets; i++) {
            System.out.println("Type of Ticket " + (i + 1));
            type[i] = s.nextInt();

//Wednesday discount
            //automate??

            if (day.equalsIgnoreCase("Wednesday")) {
                if (type[i] == 1) {
                    tic = new Standard("Standard");
                    int price = std.setPrice();
                    totalPrice = totalPrice + (price - 2);
                } else if (type[i] == 2) {
                    tic = new OAP("OAP");
                    int price = oap.setPrice();
                    totalPrice = totalPrice + (price - 2);
                } else if (type[i] == 3) {
                    tic = new Student("Student");
                    int price = stu.setPrice();
                    totalPrice = totalPrice + (price - 2);
                } else if (type[i] == 4) {
                    tic = new Child("Child");
                    int price = cld.setPrice();
                    totalPrice = totalPrice + (price - 2);
                }
//Standard pricing
            } else {
                if (type[i] == 1) {
                    tic = new Standard("Standard");
                    int price = std.setPrice();
                    totalPrice = totalPrice + price;
                } else if (type[i] == 2) {
                    tic = new OAP("OAP");
                    int price = oap.setPrice();
                    totalPrice = totalPrice + price;
                } else if (type[i] == 3) {
                    tic = new Student("Student");
                    int price = stu.setPrice();
                    totalPrice = totalPrice + price;
                } else if (type[i] == 4) {
                    tic = new Child("Child");
                    int price = cld.setPrice();
                    totalPrice = totalPrice + price;
                }
            }
        }
        System.out.println("The total cost of tickets for this movie is £" + totalPrice);
    }
}
