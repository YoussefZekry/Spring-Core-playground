package com.mypackage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mypackage.Interfaces.UserDAOInterface;
import com.mypackage.Models.UserModel;


public class App 
{
    public static void main( String[] args )
    {
        //load spring config file
        ApplicationContext context = 
                new ClassPathXmlApplicationContext("beans2.xml");

        //retrieve bean from spring container
        UserDAOInterface userDAOInterface = (UserDAOInterface)context.getBean("UserDAOImpl");

        // UserDAOImpl userDAOImpl = new UserDAOImpl();
        UserModel userModel = userDAOInterface.findUserByIdAndMob(2,"012");
        System.out.println(userDAOInterface.count());
        System.out.println(userModel.getUser_name());
    }
}
