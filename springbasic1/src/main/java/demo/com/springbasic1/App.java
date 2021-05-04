package demo.com.springbasic1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
     //  Vehicle obj=(Vehicle) context.getBean("vehicle"); xml based configuration
       Vehicle obj=(Vehicle) context.getBean("car");// annotation based confg
       obj.drive(); 
    }
}
