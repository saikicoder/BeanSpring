package org.springbean;

import org.springbean.repositories.UserRepository;
import org.springbean.repositories.UserRepositoryImpl;
import org.springbean.services.UserService;
import org.springbean.services.UserServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.BeanDefinitionDsl;

//@Configuration annotation is a starting point of a Spring Framework application
@Configuration
public class AppConfiguration {

    //@Beans will be injected by the Spring IoC container
    //Each Spring Bean is a singleton by default. It means that it doesn't matter how many times you will call “getUserRepository()” method → Spring will return the exact same instance of a UserServiceImpl
    //As you can see Spring will return exact same object (that hash value is a simple reference to memory, it is not changed, so it means that it is the same object) You can change this behavior by changing a @Scope of a Bean from a singleton to a prototype
    @Bean(name="userService")
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    public UserService getUserService(){
        UserServiceImpl service = new UserServiceImpl();
        service.setRepository(getUserRepository());
        return service;
    }

    @Bean(name="userRepository")
    public UserRepository getUserRepository(){
        return (new UserRepositoryImpl());
    }
}
