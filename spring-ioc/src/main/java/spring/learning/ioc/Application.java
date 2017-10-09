package spring.learning.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : panxin
 */
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-application.xml");

        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.sayHello();

        GameService gameService = context.getBean(GameService.class);
        gameService.play();

        HeroService heroService = context.getBean("heroService", HeroService.class);
        heroService.sayHello();
    }

}
