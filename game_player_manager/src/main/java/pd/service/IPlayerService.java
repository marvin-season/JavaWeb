package pd.service;

import pd.domain.Player;

import java.util.List;

public interface IPlayerService {
    List<Player> findAll();

    int savePlayer(Player player);

    List<Player> findAPlayerWithGameAccount(String name);

    int modifyPlayerInfo(Player player);

    List<Player> findAllRolersOfPlayer(String name);
}
