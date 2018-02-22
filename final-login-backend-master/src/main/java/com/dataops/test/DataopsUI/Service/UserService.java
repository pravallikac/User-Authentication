package com.dataops.test.DataopsUI.Service;


import com.dataops.test.DataopsUI.Model.UserInfo;
import com.dataops.test.DataopsUI.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public String registerValidation(UserInfo user) {

        try {
            UserInfo userExist = repo.findByUsername(user.getUsername());
            if(userExist!=null) {
                System.out.println("user already Exist");
                //return "user already Exists, sign up using different Credentials";
                return null;
            }
            else {
                //System.out.println("Starting to save user");
                repo.save(user);
                System.out.println(user);
                System.out.println("registration successful");
                return "Registration Successful, Login to continue.. ";
            }
        }catch(Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public UserInfo loginValidation(UserInfo user) {

        try {
            UserInfo userValid = repo.findByUsername(user.getUsername());

            if (userValid!= null && user.getPassword().equals(userValid.getPassword())) {

                System.out.println("validation Successful");
                return userValid;

            } else {
                System.out.println("validation Failed");
                return null;
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return null;


    }
}
