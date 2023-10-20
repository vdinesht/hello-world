package palindrome;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class App {

    private static final Palindrome palindrome = new JavaStackPalindromeImpl();
    public static void main(String[] args) {
        System.out.println("Please enter string(s) to check when done press Ctrl+D: ");
        List<String> lines = new BufferedReader(new InputStreamReader(System.in))
                                .lines().toList();

        for (String str: lines){
            if (palindrome.IsPalindrome(str)){
                System.out.println(str + " is a palindrome.");
            }
            else {
                System.out.println(str + " is NOT a palindrome.");
            }
        }
        System.out.println("Application is shutting down.");

    }

}
