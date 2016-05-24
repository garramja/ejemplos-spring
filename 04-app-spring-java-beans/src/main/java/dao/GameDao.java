package dao;

import model.Game;

/**
 * Game Dao Interface
 */
public interface GameDao {

    Game getByName(String id);
}
