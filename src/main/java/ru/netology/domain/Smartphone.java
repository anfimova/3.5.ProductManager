package ru.netology.domain;

import lombok.Data;

@Data

public class Smartphone extends Product {

    private String firm;

    public Smartphone(String name, String firm) {
        super(name);
        this.firm = firm;
    }
}
