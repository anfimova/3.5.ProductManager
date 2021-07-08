package ru.netology.domain;

import lombok.NoArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@Data

public class Product {

    private int id;
    private String title;
    private int price;

    public Product(String title) {
        this.title = title;
    }

    public boolean matches(String search) {
        if (title.contains(search)) {
            return true;
        }
        return false;
    }

}
