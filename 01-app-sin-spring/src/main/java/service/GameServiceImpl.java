package service;

import dao.GameDao;
import dao.GameDaoMap;
import model.Game;

/**
 * Game Service Implementation
 */
public class GameServiceImpl implements GameService {

    private GameDao gameDao = new GameDaoMap();

    @Override
    public Game getByName(String id) {
        return gameDao.getByName(id);
    }
}
