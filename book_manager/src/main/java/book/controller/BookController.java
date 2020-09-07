package book.controller;

import book.domain.Book;
import book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("bookService")
    private IBookService bookService = null;

    //    查询所有书籍
    @RequestMapping("findAll")
    public String findAll(Model model) {
        List<Book> books = bookService.findAll();
        model.addAttribute("books", books);
        return "ShowAllBook";
    }

    //    跳转到增加书籍页面
    @RequestMapping("toAddBook")
    public String toAddBook() {
        return "addBook";
    }

    //    添加书籍
    @RequestMapping("addBook")
    public String addBook(Book book) {
        System.out.println("book:" + book);
        int i = bookService.addBook(book);
        System.out.println(i);
        return "redirect:/book/findAll";
    }

    //    跳转到修改页面
    @RequestMapping("toUpdate")
    public String toUpdate(Integer id, Model model) {
        Book book = bookService.findById(id);
        System.out.println(book);
        model.addAttribute("QBook", book);
        return "update";
    }

    @RequestMapping("update")
    public String update(Book book) {
        int i = bookService.updateBook(book);
        return "redirect:/book/findAll";
    }

    //    删除一本书
    @RequestMapping("delete")
    public String delete(Integer id) {
        System.out.println(id);
        int delete = bookService.delete(id);
        System.out.println(delete);
        return "redirect:/book/findAll";
    }

    //    根据书名查找
    @RequestMapping("findByName")
    public String findByName(String name, Model model) {
        Book book = bookService.findByName(name);
        List<Book> books = new ArrayList<>();
        books.add(book);
        model.addAttribute("books", books);
        System.out.println(book);
        return "ShowAllBook";
    }
}
