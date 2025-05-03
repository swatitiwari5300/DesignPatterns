package org.dp.StructuralPatterns.FacadePattern;

public class OrderService {

    public String getOrderDetails(String orderId){
        return "the order with ordertId: "+orderId+" is being processed.";
    }
}
