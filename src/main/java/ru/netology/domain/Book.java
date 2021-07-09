package ru.netology.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)

public class Book extends Product {

    private String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    public boolean matches(String search) {
        if (super.matches(search)) {
            return true;
        }
        if (author.contains(search)) {
            return true;
        }
        return false;
    }

}
