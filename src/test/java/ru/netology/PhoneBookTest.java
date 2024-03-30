package ru.netology;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    @Test
    public void testAddReturnsZero() {
        PhoneBook phoneBook = new PhoneBook();
        int result = phoneBook.add();
        assertEquals(1, result); // Тест не должен проходить
    }
}
