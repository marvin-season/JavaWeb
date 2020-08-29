package pd.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;
import pd.domain.Player;

import java.util.List;

@Repository("playerDao")
public interface IPlayerDao {
    @Select("select * from player where id in (select pid from game_account)")
    List<Player> findAll();

    @Insert("insert into player values(#{id},#{name},#{age},#{gender},#{tel})")
    int savePlayer(Player player);

    @Select("select * from player where id = #{id}")
    Player findById(Integer id);

    /**
     * 一对多查询，sql:左外链接查询,左表:player
     * SELECT p.*,ga.* FROM player p LEFT OUTER JOIN game_account ga ON p.id=ga.pid
     *
     * @return
     */
    @Select("select * from player where name = #{pname}")
    @Results(id = "playerGAResMap", value = {
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "age", column = "age"),
            @Result(property = "name", column = "name"),
            @Result(property = "tel", column = "tel"),
            @Result(property = "gender", column = "gender"),
//            select = findAccountByPId,  column=id作为参数pd.dao.IGameAccountDao.findAccountByPId
            @Result(property = "gameAccounts", column = "id", many = @Many(select = "pd.dao.IGameAccountDao.findAccountByPId", fetchType = FetchType.LAZY))
    })
    List<Player> findAPlayerWithGameAccount(String pname);

    @Update("UPDATE player SET age=#{age},tel=#{tel},gender=#{gender},name=#{name} WHERE id=#{id}")
    int modifyPlayerInfo(Player player);

    @Select("select * from player where name = #{pname}")
    @Results(id = "playerRoleResMap", value = {
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "age", column = "age"),
            @Result(property = "name", column = "name"),
            @Result(property = "tel", column = "tel"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "rolers", column = "id", many = @Many(select = "pd.dao.IRolerDao.findRolerByPId", fetchType = FetchType.LAZY))
    })
    List<Player> findAllRolersOfPlayer(String pname);
}
