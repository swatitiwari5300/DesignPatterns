package org.dp.StructuralPatterns.FacadePattern;

public class ApiGateway {

    OrderService orderService;
    UserService userService;

    public ApiGateway(){
        this.orderService = new OrderService();
        this.userService = new UserService();
    }

    public String getAllDetails(String userId, String orderId){
        return userService.getUserDetails(userId)+"\n"+orderService.getOrderDetails(orderId);
    }
}
