package com.training.demo.Controller;

import com.training.demo.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Sandu
 * on 09.03.2018
 */
@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController (AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthor(Model model){
        model.addAttribute("authors", authorRepository.findAll());

        return "authors";
    }
}
