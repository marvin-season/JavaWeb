package pd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pd.dao.IPlayerDao;
import pd.domain.Player;
import pd.service.IPlayerService;

import java.util.List;

@Service("playerService")
public class PlayerServiceImpl implements IPlayerService {
    @Autowired
    @Qualifier("playerDao")
    private IPlayerDao playerDao = null;

    @Override
    public List<Player> findAll() {
        return playerDao.findAll();
    }

    @Override
    public int savePlayer(Player player) {
        return playerDao.savePlayer(player);
    }

    @Override
    public List<Player> findAPlayerWithGameAccount(String name) {

        return playerDao.findAPlayerWithGameAccount(name);
    }

    @Override
    public int modifyPlayerInfo(Player player) {
        return playerDao.modifyPlayerInfo(player);
    }

    @Override
    public List<Player> findAllRolersOfPlayer(String name) {
        return playerDao.findAllRolersOfPlayer(name);
    }
}
