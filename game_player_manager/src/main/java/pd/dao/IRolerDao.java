package pd.dao;

import org.apache.ibatis.annotations.Select;
import pd.domain.Roler;

public interface IRolerDao {
    @Select("select * from roler where pid=#{id}")
    Roler findRolerByPId(Integer id);
}
