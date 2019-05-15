package com.pluralsight.bookstore.repository;

import com.pluralsight.bookstore.module.Book;
import com.pluralsight.bookstore.module.Language;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class bookRepositoryTest {

    @Inject
    private BookRepository bookRepository;

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(BookRepository.class)
                .addClass(Book.class)
                .addClass(Language.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml")
                .addAsManifestResource("META-INF/test-persistence.xml","persistence.xml");

    }

    @Test(expected = Exception.class)
    public void createInvalidBook(){
        Book book = new Book(null,"descrition","isbn",123,12F,new Date(),"http://bbablabab",Language.ENGLISH);
        bookRepository.create(book);
    }

    @Test(expected = Exception.class)
    public void findWithInvalidId(){
       bookRepository.find(null);
    }

    @Test
    public void create() throws Exception{
        //Test Counting Book
        assertEquals(Long.valueOf(0),bookRepository.countAll());
        assertEquals(0,bookRepository.findAll().size());
        //Create a Book
        Book book = new Book(" a title","descrition","isbn",123,12F,new Date(),"http://bbablabab",Language.ENGLISH);
        book = bookRepository.create(book);
        Long bookId = book.getId();

        //Check created Book
        assertNotNull(bookId);

        //Find created Book
        Book bookFound = bookRepository.find(bookId);

        //check the found book
        assertEquals(" a title",bookFound.getTitle());

        //Test Counting book
        assertEquals(Long.valueOf(1),bookRepository.countAll());
        assertEquals(1,bookRepository.findAll().size());

        //Delete the Book
        bookRepository.delete(bookId);
        //Test Counting book
        assertEquals(Long.valueOf(0),bookRepository.countAll());
        assertEquals(0,bookRepository.findAll().size());



    }
}
