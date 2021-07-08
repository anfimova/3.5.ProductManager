package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    private Smartphone smartphone = new Smartphone("Title", "Firm");

    @Test
    void shouldMatchesTitle() {
        Assertions.assertTrue(smartphone.matches("Title"));
    }

    @Test
    void shouldMatchesFirm() {
        Assertions.assertTrue(smartphone.matches("Firm"));
    }

    @Test
    void shouldNotMatches() {
        Assertions.assertFalse(smartphone.matches("123"));
    }

}