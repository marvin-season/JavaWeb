package pd.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pd.dao.IGameAccountDao;
import pd.domain.GameAccount;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class GameAccountTest {
    private InputStream is = null;
    private SqlSession sqlSession = null;
    private IGameAccountDao gameAccountDao = null;

    @Before
    public void init() throws IOException {
        is = Resources.getResourceAsStream("SqlConfig.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        sqlSession = sessionFactory.openSession();
        gameAccountDao = sqlSession.getMapper(IGameAccountDao.class);
    }

    @After
    public void destroy() throws IOException {
        is.close();
        sqlSession.close();
    }

    @Test
    public void findAll() {
        List<GameAccount> gameAccounts = gameAccountDao.findAll();
        for (GameAccount gameAccount :  gameAccounts) {
            System.out.println(gameAccount);
        }
    }
    @Test
    public void findGameAccountWithPlayer(){
        List<GameAccount> accountWithPlayer = gameAccountDao.findAGameAccountWithPlayer("昵称1");
        for (GameAccount gameAccount :
                accountWithPlayer) {
            System.out.println("--------游戏及玩家信息--------");
            System.out.println(gameAccount);
            System.out.println(gameAccount.getPlayer() );
        }
    }
    @Test
    public void findAccountByPId(){
        GameAccount gameAccount = gameAccountDao.findAccountByPId(5);
        System.out.println(gameAccount);
    }
}
