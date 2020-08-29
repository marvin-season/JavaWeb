package pd.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pd.domain.Player;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class PlayerTest {
    private InputStream is = null;
    private SqlSession sqlSession = null;
    private IPlayerDao playerDao = null;

    @Before
    public void init() throws IOException {
        is = Resources.getResourceAsStream("SqlConfig.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        sqlSession = sessionFactory.openSession();
        playerDao = sqlSession.getMapper(IPlayerDao.class);
    }

    @After
    public void destroy() throws IOException {
        sqlSession.commit();
        is.close();
        sqlSession.close();
    }

    @Test
    public void findById() {
        Player player = playerDao.findById(7);
        System.out.println(player);
    }

    @Test
    public void findPlayerWithGameAccount() {
        List<Player> playerWithGameAccounts = playerDao.findAPlayerWithGameAccount("小马");
        for (Player playerWithGameAccount : playerWithGameAccounts) {
            System.out.println(playerWithGameAccount);
            System.out.println(playerWithGameAccount.getGameAccounts());
        }
    }

    @Test
    public void modifyPlayerInfo(){
        Player player = new Player();
        player.setId(2);
        player.setAge(20);
        player.setGender("male");
        player.setTel("177****8490");
        player.setName("小马");
        playerDao.modifyPlayerInfo(player);
    }
    @Test
    public void findAllRolersOfPlayer(){
        List<Player> rolersOfPlayer = playerDao.findAllRolersOfPlayer("小李");
        for (Player rolerOfPlayer : rolersOfPlayer) {
            System.out.println(rolerOfPlayer);
            System.out.println(rolerOfPlayer.getRolers());
        }
    }
}
