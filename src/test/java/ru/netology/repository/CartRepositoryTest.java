package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.NegativeIdException;
import ru.netology.domain.PurchaseItem;

import static org.junit.jupiter.api.Assertions.*;

class CartRepositoryTest {
    PurchaseItem first = new PurchaseItem(101, 1, "first", 100, 10);
    PurchaseItem second = new PurchaseItem(222, 2, "first", 10, 20);
    PurchaseItem third = new PurchaseItem(30, 3, "first", 1, 30);

    @Test
    public void myTest() {
        CartRepository repo = new CartRepository();
        repo.save(first);
        repo.save(second);
        repo.save(third);

        assertThrows(NegativeIdException.class, () -> {
            repo.removeById(-100);
        });

    }

}