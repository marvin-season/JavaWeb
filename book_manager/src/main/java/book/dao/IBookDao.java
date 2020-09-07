package book.dao;

import book.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("bookDao")
public interface IBookDao {
    //    查询所有书籍
    @Select("select * from book")
    List<Book> findAll();

    //    根据书名查找
    @Select("select * from book where name=#{name}")
    Book findByName(String name);

    //根据id查找
    @Select("select * from book where id=#{id}")
    Book findById(Integer id);

    //    新增书籍
    @Insert("insert into book(name, author, price, version) values(#{name}, #{author}, #{price}, #{version})")
    int addBook(Book book);

    //    修改页面书籍
    @Update("UPDATE book SET name=#{name}, author=#{author}, price=#{price}, version=#{version} WHERE id = #{id}")
    int updateBook(Book book);

    //删除一个书籍信息
    @Delete("delete from book where id = #{id}")
    int delete(Integer id);
}
