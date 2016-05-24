import dao.GameDao;
import dao.GameDaoMap;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.GameService;
import service.GameServiceImpl;

/**
 * Demo class to run application
 */
public class DemoApp {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        GameService gameService = (GameService) context.getBean("gameService");

        System.out.println(
                String.format("%s es molon? %s",
                        gameService.getByName("Doom").getName(),
                        gameService.getByName("Doom").isCool()));                ;

    }
}
