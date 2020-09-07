package book.service.impl;

import book.dao.IBookDao;
import book.domain.Book;
import book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public class BookServiceImpl implements IBookService {
    @Autowired
    @Qualifier("bookDao")
    private IBookDao bookDao = null;

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    @Override
    public Book findByName(String name) {
        return bookDao.findByName(name);
    }

    @Override
    public Book findById(Integer id) {
        return bookDao.findById(id);
    }

    @Override
    public int addBook(Book book) {
        return bookDao.addBook(book);
    }

    @Override
    public int updateBook(Book book) {
        return bookDao.updateBook(book);
    }

    @Override
    public int delete(Integer id) {
        return bookDao.delete(id);
    }
}
