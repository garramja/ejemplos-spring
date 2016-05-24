import dao.GameDao;
import dao.GameDaoMap;
import service.GameService;
import service.GameServiceImpl;

/**
 * Demo class to run application
 */
public class DemoApp {

    public static void main(String[] args) {

        GameDao gameDao = new GameDaoMap();
        GameService gameService = new GameServiceImpl(gameDao);

        System.out.println(
                String.format("%s es molon? %s",
                        gameService.getByName("Doom").getName(),
                        gameService.getByName("Doom").isCool()));                ;

    }
}
