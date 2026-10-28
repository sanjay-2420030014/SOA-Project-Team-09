package com.libraryfine.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Library Service Unit Tests
 */
class LibraryServiceApplicationTests {

    @Test
    void testMemberCreation() {
        Member member = new Member("Rahul Sharma", "rahul@example.com");
        assertEquals("Rahul Sharma", member.getName());
        assertEquals("rahul@example.com", member.getEmail());
    }

    @Test
    void testBookCreation() {
        Book book = new Book("Java Programming", "Herbert Schildt", "978000000001");
        assertEquals("Java Programming", book.getTitle());
        assertEquals("Herbert Schildt", book.getAuthor());
        assertEquals("978000000001", book.getIsbn());
    }
}

