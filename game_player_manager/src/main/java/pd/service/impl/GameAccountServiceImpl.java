package pd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pd.dao.IGameAccountDao;
import pd.domain.GameAccount;
import pd.service.IGameAccountService;

import java.util.List;

@Service("gameAccountService")
public class GameAccountServiceImpl implements IGameAccountService {

    @Autowired
    @Qualifier("gameAccountDao")
    private IGameAccountDao gameAccountDao = null;

    @Override
    public List<GameAccount> findAGameAccountWithPlayer(GameAccount gameAccount) {
        return gameAccountDao.findAGameAccountWithPlayer(gameAccount.getName());
    }

    @Override
    public List<GameAccount> findAll() {
        return gameAccountDao.findAll();
    }

    @Override
    public List<GameAccount> findForLogin(GameAccount gameAccount) {
        return gameAccountDao.findForLogin(gameAccount);
    }

    @Override
    public int saveGameAccount(GameAccount gameAccount) {
        gameAccount.setRank("暂未进行排位");
        gameAccount.setScore(1200);
        return gameAccountDao.saveGameAccount(gameAccount);
    }

    @Override
    public int deleteGAInfoByName(GameAccount gameAccount) {
        return gameAccountDao.deleteGAInfoByName(gameAccount);
    }
}
