package service;

import dao.GameDao;
import dao.GameDaoMap;
import model.Game;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Test for Game Service
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class GameServiceTest {

    @Autowired
    GameService gameService;

    @Test
    public void testGetByName() {

        Game game = gameService.getByName("Doom");
        Assert.assertEquals(game, getGameExpected());

    }

    private Game getGameExpected() {
        return new Game("Doom", "FPS", 2016, true);
    }

}


