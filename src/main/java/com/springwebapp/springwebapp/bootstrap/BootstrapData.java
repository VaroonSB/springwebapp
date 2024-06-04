package com.springwebapp.springwebapp.bootstrap;

import com.springwebapp.springwebapp.domain.Author;
import com.springwebapp.springwebapp.domain.Book;
import com.springwebapp.springwebapp.domain.Publisher;
import com.springwebapp.springwebapp.repositories.AuthorRepository;
import com.springwebapp.springwebapp.repositories.BookRepository;
import com.springwebapp.springwebapp.repositories.PublisherRepository;
import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository,
                         PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Lang");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("12345");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author mave = new Author();
        mave.setFirstName("Mave");
        mave.setLastName("June");

        Book ejb = new Book();
        ejb.setTitle("No EJB");
        ejb.setIsbn("67890");

        Author maveSaved = authorRepository.save(mave);
        Book ejbSaved = bookRepository.save(ejb);

        ericSaved.getBooks().add(dddSaved);
        maveSaved.getBooks().add(ejbSaved);
        dddSaved.getAuthors().add(ericSaved);
        ejbSaved.getAuthors().add(maveSaved);

        authorRepository.saveAll(Arrays.asList(ericSaved, maveSaved));

        System.out.println("In Bootstrap");
        System.out.println("Author Count: " + authorRepository.count());
        System.out.println("Book Count: " + bookRepository.count());

        Publisher publisher = new Publisher();
        publisher.setPublisherName("My Publisher");
        publisher.setAddress("123 Main");
        Publisher publisherSaved =  publisherRepository.save(publisher);

        dddSaved.setPublisher(publisherSaved);
        ejbSaved.setPublisher(publisherSaved);
        authorRepository.saveAll(Arrays.asList(ericSaved, maveSaved));
        bookRepository.saveAll(Arrays.asList(dddSaved, ejbSaved));

        System.out.println("Publisher Count: " + publisherRepository.count());
    }
}
