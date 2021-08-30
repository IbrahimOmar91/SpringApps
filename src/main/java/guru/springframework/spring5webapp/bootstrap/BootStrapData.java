package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.repositories.AuthorRepo;
import guru.springframework.spring5webapp.repositories.BookRepo;
import guru.springframework.spring5webapp.repositories.PublisherRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepo authorRepo;
    private final BookRepo bookRepo;
    private final PublisherRepo publisherRepo;

    public BootStrapData(AuthorRepo authorRepo, BookRepo bookRepo, PublisherRepo publisherRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
        this.publisherRepo = publisherRepo;
    }

    @Override
    public void run(String... args) {
        /*
        Author eric = new Author("Ali", "Hani");
        Book book = new Book("Have fun coding", "112345");

        Publisher publisher = new Publisher();
        publisher.setName("My Publisher");
        publisher.setCity("MyCity");
        publisherRepo.save(publisher);

        eric.getBooks().add(book);
        book.getAuthors().add(eric);

        book.setPublisher(publisher);
        publisher.getBooks().add(book);

        authorRepo.save(eric);
        bookRepo.save(book);
        publisherRepo.save(publisher);

        System.out.println("Hello from bootstrap");
        System.out.println(publisher);
        System.out.println(book);
        System.out.println(eric);
        System.out.printf("Now you have %d Books%n", authorRepo.count());
        System.out.printf("Now you have %d Publishers%n", publisherRepo.count());

         */
    }
}
