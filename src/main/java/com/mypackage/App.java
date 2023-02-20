package com.mypackage;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        //load spring config file
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(Config.class);
        
        //retrieve bean from spring container
        UserInterface user = context.getBean("classBUser",UserInterface.class);


        System.out.println(user.details());
        System.out.println(user.getProduct1());
        
        ClassBUser user2 = context.getBean("classBUser",ClassBUser.class);
        System.out.println(user2.getEmail());
        System.out.println(user2.getName());

        context.registerShutdownHook();
    }
}
