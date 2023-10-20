package StackTest;

import org.junit.jupiter.api.Test;
import palindrome.JavaStackPalindromeImpl;
import palindrome.Palindrome;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestJavaStackPalindromeImpl {

    @Test
    void checkForPalindrome(){
        Palindrome palindrome = new JavaStackPalindromeImpl();

        assertTrue(palindrome.IsPalindrome("madam"));
        assertFalse(palindrome.IsPalindrome("dinesh"));
    }
}
