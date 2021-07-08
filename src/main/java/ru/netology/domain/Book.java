package ru.netology.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

public class Book extends Product {

    private String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

}
