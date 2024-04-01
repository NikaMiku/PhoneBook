package ru.netology;

import java.util.HashMap;
import java.util.regex.Pattern;

public class PhoneBook {
    private HashMap<String, String> contacts;

    public PhoneBook() {
        this.contacts = new HashMap<>();
    }

    public int add(String phone, String name) {
        if (Pattern.matches("79\\d{9}", phone) && Pattern.matches("^[A-Za-z]+([-][A-Za-z]+)*$", name)) {
            contacts.put(phone, name);
            return contacts.size();
        } else {
            return 0;
        }
    }

    public HashMap<String, String> getContacts() {
        return contacts;
    }
}
