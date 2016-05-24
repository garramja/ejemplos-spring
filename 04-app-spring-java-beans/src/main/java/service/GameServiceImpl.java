package service;

import dao.GameDao;
import dao.GameDaoMap;
import model.Game;

/**
 * Game Service Implementation
 */
public class GameServiceImpl implements GameService {

    private GameDao gameDao;

    public GameServiceImpl(GameDao gameDao) {
        this.gameDao = gameDao;
    }

    @Override
    public Game getByName(String id) {
        return gameDao.getByName(id);
    }
}
