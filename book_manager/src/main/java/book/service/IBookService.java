package book.service;

import book.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IBookService {

    //    查询所有书籍
    List<Book> findAll();

    //    根据书名查找
    Book findByName(String name);
    Book findById(Integer id);

    //    新增书籍
    int addBook(Book book);

    int updateBook(Book book);

    int delete(Integer id);
}
