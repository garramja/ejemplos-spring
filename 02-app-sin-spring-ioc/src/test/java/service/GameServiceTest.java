package service;

import dao.GameDao;
import dao.GameDaoMap;
import model.Game;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Test for Game Service
 */
public class GameServiceTest {

    @Test
    public void testGetByName() {

        GameDao gameDao = Mockito.mock(GameDaoMap.class);
        Mockito.when(gameDao.getByName("Doom")).thenReturn(getGameExpected());

        GameService gameService = new GameServiceImpl(gameDao);
        Game game = gameService.getByName("Doom");
        Assert.assertEquals("Doom", game.getName());

    }

    private Game getGameExpected() {
        return new Game("Doom", "FPS", 2016, true);
    }

}


