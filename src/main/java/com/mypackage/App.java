package com.mypackage;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        //load spring config file
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        //retrieve bean from spring container
        UserInterface user = context.getBean("classBUser",UserInterface.class);


        System.out.println(user.details());
        System.out.println(user.getProduct1());
        System.out.println(ClassBUser.getEmail());
        System.out.println(ClassBUser.getName());

        context.registerShutdownHook();
    }
}
