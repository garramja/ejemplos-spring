package service;

import model.Game;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for Game Service
 */
public class GameServiceTest {

    @Test
    public void testGetByName() {

        GameService gameService = new GameServiceImpl();
        Game game = gameService.getByName("Doom");
        Assert.assertEquals("Doom", game.getName());

    }

}


