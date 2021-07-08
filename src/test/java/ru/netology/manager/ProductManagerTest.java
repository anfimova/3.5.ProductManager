package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    ProductManager manager = new ProductManager(new ProductRepository());
    private Product one = new Book("OneTitle", "OneAuthor");
    private Product two = new Book("TwoTitle", "TwoAuthor");
    private Product three = new Smartphone("ThreeTitle", "ThreeFirm");
    private Product four = new Smartphone("FourTitle", "FourFirm");
    private Product five = new Product();

    @BeforeEach
    void setUp() {
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
    }


    @Test
    void shouldSearchBookByText() {
        Product[] expected = new Product[]{two};
        Product[] actual = manager.searchBy("Two");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchSmartphoneByText() {
        Product[] expected = new Product[]{four};
        Product[] actual = manager.searchBy("Four");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchBothByText() {
        Product[] expected = new Product[]{one, two, three, four};
        Product[] actual = manager.searchBy("Title");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchNothingByText() {
        Product[] expected = new Product[]{};
        Product[] actual = manager.searchBy("123");
        assertArrayEquals(expected, actual);
    }

}