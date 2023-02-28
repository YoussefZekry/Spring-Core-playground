package com.mypackage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mypackage.Interfaces.UserDAOInterface;
import com.mypackage.Models.Person;


public class App 
{
    public static void main( String[] args )
    {
        //load spring config file
        ApplicationContext context = 
                new ClassPathXmlApplicationContext("beans2.xml");

        //retrieve bean from spring container
        UserDAOInterface userDAOInterface = (UserDAOInterface)context.getBean("UserDAOImpl");
        
        System.out.println(userDAOInterface.count());
        userDAOInterface.insert(new Person("medhat","saleh") );        

    }
}

