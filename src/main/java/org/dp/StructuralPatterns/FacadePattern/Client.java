package org.dp.StructuralPatterns.FacadePattern;

public class Client {

    public static void main(String[] args) {

        ApiGateway apiGateway = new ApiGateway();
        System.out.println(apiGateway.getAllDetails("user1", "xsd-123"));

    }
}
