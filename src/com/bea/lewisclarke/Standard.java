package com.bea.lewisclarke;

public class Standard extends TicketType{
   int standardPrice = 0;

   Standard() {


   }

    Standard(String type) {
       super(type);
       setPrice();

}

    public int setPrice() {
       standardPrice = 8;
       return standardPrice;
}
}
