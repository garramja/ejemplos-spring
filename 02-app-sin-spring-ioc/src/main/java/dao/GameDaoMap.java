package dao;

import model.Game;

import java.util.HashMap;
import java.util.Map;

/**
 * Game Dao Implementation
 */
public class GameDaoMap implements GameDao {

    private static Map<String, Game> gamesByName = new HashMap<String, Game>();

    static {
        Game game1 = new Game("Doom","FPS", 2016, true);
        Game game2 = new Game("RollerCoasterTycon","Simulator", 2008, true);
        gamesByName.put(game1.getName(), game1);
        gamesByName.put(game2.getName(), game2);
    }

    @Override
    public Game getByName(String id) {
        return gamesByName.get(id);
    }
}
