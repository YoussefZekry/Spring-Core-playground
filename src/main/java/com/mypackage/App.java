package com.mypackage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        //load spring config file
        ConfigurableApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
        
        //retrieve bean from spring container
        UserInterface user = factory.getBean("ClassBUserID",UserInterface.class);


        System.out.println(user.details());
        System.out.println(user.getProduct1());

        factory.registerShutdownHook();
    }
}
