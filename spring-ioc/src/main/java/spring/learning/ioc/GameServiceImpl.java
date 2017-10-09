package spring.learning.ioc;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : panxin
 */
public class GameServiceImpl implements GameService {

    private final HeroService heroService;

    @Autowired
    public GameServiceImpl(HeroService heroService) {
        this.heroService = heroService;
    }

    public void play() {
        System.out.println("Wow!!");
        heroService.sayHello();
    }

}
