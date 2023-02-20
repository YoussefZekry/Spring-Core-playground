package com.mypackage;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;


public class App 
{
    public static void main( String[] args )
    {
        //load spring config file
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("production");
        context.register(Config.class);
        context.refresh();

        Environment env = context.getEnvironment();
        boolean containsMyProp = env.containsProperty("java.home");
        System.out.println("========="+ containsMyProp + "========" + env.getProperty("java.home", "nothing"));
        
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
