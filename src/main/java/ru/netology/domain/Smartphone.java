package ru.netology.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

public class Smartphone extends Product {

    private String firm;

    public Smartphone(String title, String firm) {
        super(title);
        this.firm = firm;
    }
}
