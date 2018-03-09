package com.training.demo.Controller;

import com.training.demo.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Sandu
 * on 09.03.2018
 */
@Controller
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public  String getBooks(Model model){
        model.addAttribute("books", bookRepository.findAll());

        return "books";
    }
}
