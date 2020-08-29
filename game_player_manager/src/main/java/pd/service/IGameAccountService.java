package pd.service;

import pd.domain.GameAccount;

import java.util.List;

public interface IGameAccountService {

    List<GameAccount> findAGameAccountWithPlayer(GameAccount gameAccount) ;

    List<GameAccount> findAll();

    List<GameAccount> findForLogin(GameAccount gameAccount);

    int saveGameAccount(GameAccount gameAccount);

    int deleteGAInfoByName(GameAccount gameAccount);
}
