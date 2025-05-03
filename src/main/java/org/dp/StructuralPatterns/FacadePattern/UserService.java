package org.dp.StructuralPatterns.FacadePattern;

public class UserService {

    public String getUserDetails(String userId){
        return "The user with userId: "+userId+" has premium membership";
    }
}
