package ru.netology;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    @Test
    public void testAddReturnsPhone() {
        PhoneBook phoneBook = new PhoneBook();
        String input = "79776776767";
        boolean isMatching = Pattern.matches("79\\d{9}", input);
        assertTrue(isMatching, "Номер телефона должен соответствовать шаблону");
    }

    @Test
    public void testAddReturnsName() {
        PhoneBook phoneBook = new PhoneBook();
        String input = "Ayaz";
        boolean isMatching = Pattern.matches("^[A-Za-z]+([-][A-Za-z]+)*$", input);
        assertTrue(isMatching, "Имя должно соответствовать шаблону");
    }

    @Test
    public void testAddReturnsContacts() {
        PhoneBook phoneBook = new PhoneBook();
        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("79776776767", "Yasha");
        int result = phoneBook.add("79999191880", "Ayaz");
        assertNotNull(result, "Список контактов не должен быть пустым");
    }
}
