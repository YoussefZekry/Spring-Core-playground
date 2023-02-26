package com.mypackage;
import java.sql.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mypackage.Classes.UserDAOImpl;
import com.mypackage.Interfaces.UserDAOInterface;
import com.mypackage.Models.User;


public class App 
{
    public static void main( String[] args )
    {
        //load spring config file
        ApplicationContext context = 
                new ClassPathXmlApplicationContext("beans2.xml");

        //retrieve bean from spring container
        UserDAOInterface userDAOInterface = (UserDAOInterface)context.getBean("UserDAOImpl");
        // UserDAOImpl userDAOImpll = (UserDAOImpl)context.getBean("UserDAOImpl");
        // UserModel userModel = new UserModel();
        // UserModel userModel = userDAOInterface.findUserById(2);
        
        System.out.println(userDAOInterface.count());
        // System.out.println(userModel.getUser_name());
        // System.out.println( userDAOInterface.findAll());
            // userModel.setId(5);
			// userModel.setEmail("updatedEmail");
			// userModel.setAddress("updatedAddress");
			// userModel.setPhone("updatedPhone");
			// userModel.setMobile("0100");
			// userModel.setDate_of_birth(Date.valueOf("2002-08-06"));
			// userModel.setRegistration_date(Date.valueOf("2005-08-06"));
			// userModel.setUser_name("user");
			// userModel.setPassword("123");
			// userModel.setFull_name("fname");
            // UserDAOImpl userDAOImpl = new UserDAOImpl();

        // userDAOInterface.insert(userModel);
        // userDAOInterface.update(userModel);
        // userDAOInterface.delete(4);
        

    }
}

