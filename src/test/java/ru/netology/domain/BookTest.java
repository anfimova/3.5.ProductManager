package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BookTest {

    private Book book = new Book("Title", "Author");

    @Test
    void shouldMatchesTitle() {
        Assertions.assertTrue(book.matches("Title"));
    }

    @Test
    void shouldMatchesAuthor() {
        Assertions.assertTrue(book.matches("Author"));
    }

    @Test
    void shouldNotMatches() {
        Assertions.assertFalse(book.matches("123"));
    }

}