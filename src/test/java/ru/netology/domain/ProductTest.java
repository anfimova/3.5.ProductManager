package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductTest {

    private Product product = new Product("Title");

    @Test
    void shouldMatches() {
        Assertions.assertTrue(product.matches("Title"));
    }

    @Test
    void shouldNotMatches() {
        Assertions.assertFalse(product.matches("123"));
    }

}