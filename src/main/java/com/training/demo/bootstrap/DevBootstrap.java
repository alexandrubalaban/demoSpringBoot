package com.training.demo.bootstrap;

import com.training.demo.model.Author;
import com.training.demo.model.Book;
import com.training.demo.model.Publisher;
import com.training.demo.repositories.AuthorRepository;
import com.training.demo.repositories.BookRepository;
import com.training.demo.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by Sandu
 * on 09.03.2018
 */

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){


        Publisher humanitos = new Publisher();
        humanitos.setName("HUMANITOS");
        humanitos.setAdress("Iasi");

        publisherRepository.save(humanitos);

        //Dan
        Author eric = new Author("Eric", "Evans");
        Book domainDrivenDesign = new Book("Domain Driven Design", "1234", humanitos);
        eric.getBooks().add(domainDrivenDesign);
        domainDrivenDesign.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(domainDrivenDesign);

        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJ8", "23444", humanitos);
        rod.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
    }
}
