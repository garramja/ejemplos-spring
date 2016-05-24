package config;

import dao.GameDao;
import dao.GameDaoMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.GameService;
import service.GameServiceImpl;

/**
 * Configuration for Spring Context
 */
@Configuration
public class SpringContextConfiguration {

    @Bean
    public GameDao gameDao() {
        return new GameDaoMap();
    }

    @Bean
    public GameService gameService() {
        return new GameServiceImpl(gameDao());
    }

}
