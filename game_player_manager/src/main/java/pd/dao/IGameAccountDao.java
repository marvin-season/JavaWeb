package pd.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;
import pd.domain.GameAccount;

import java.util.List;

@Repository("gameAccountDao")
public interface IGameAccountDao {

    @Select("select * from game_account")
    List<GameAccount> findAll();

    @Select("select * from game_account where name=#{name} and password=#{password}")
    List<GameAccount> findForLogin(GameAccount gameAccount);

    @Insert("insert into game_account values(#{id}, #{pid},#{name},#{password},#{rank},#{score})")
    int saveGameAccount(GameAccount gameAccount);


    /* 查询游戏账号及其使用者，对一查询 sql:
     * SELECT * FROM game_account ga , player p WHERE  p.id=ga.id
     */
    @Select("select * from game_account where name=#{gname}")
    @Results(id = "resMap", value = {
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "pid", column = "pid"),
            @Result(property = "name", column = "name"),
            @Result(property = "password", column = "password"),
            @Result(property = "rank", column = "rank"),
            @Result(property = "score", column = "score"),
            @Result(property = "player", column = "pid", one = @One(select = "pd.dao.IPlayerDao.findById", fetchType = FetchType.EAGER))//立即加载
    })
    List<GameAccount> findAGameAccountWithPlayer(String gname);

    @Select("select * from game_account where pid=#{id}")
    GameAccount findAccountByPId(Integer id);

    @Delete("delete from game_account where name=#{name}")
    int deleteGAInfoByName(GameAccount gameAccount);
}
