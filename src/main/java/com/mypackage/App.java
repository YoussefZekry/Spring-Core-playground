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
        UserInterface cUser = factory.getBean("ClassCUserID",UserInterface.class);


        System.out.println(cUser.details());
        
        System.out.println(cUser.getProduct());
    }
}
