package org.springbean;

import org.springbean.models.User;
import org.springbean.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


//starting point of our Spring Framework application
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        UserService service = context.getBean("userService", UserService.class);

        User user = service.findAll().get(0);

        System.out.println(user.getFirstName());
    }
}
