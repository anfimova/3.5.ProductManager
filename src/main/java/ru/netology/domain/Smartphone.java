package ru.netology.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)

public class Smartphone extends Product {

    private String firm;

    public Smartphone(String title, String firm) {
        super(title);
        this.firm = firm;
    }

    public boolean matches(String search) {
//        return super.matches(search) || firm.matches(search);
        if (super.matches(search)) {
            return true;
        }
        if (firm.contains(search)) {
            return true;
        }
        return false;
    }

}
