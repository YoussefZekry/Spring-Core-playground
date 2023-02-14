package com.mypackage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        //load spring config file
        ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
        
        //retrieve bean from spring container
        UserInterface user = factory.getBean("userID",UserInterface.class);
       
        System.out.println(user.details());
        
        System.out.println(user.getProduct());
    }
}
