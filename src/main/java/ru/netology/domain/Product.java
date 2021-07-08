package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Product {

    private int id;
    private String title;
    private int price;

    public Product(String name) {
        this.title = name;
    }

}
