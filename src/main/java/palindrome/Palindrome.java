package palindrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Please enter a string: ");
        List<String> lines = new BufferedReader(new InputStreamReader(System.in))
                .lines().collect(Collectors.toList());
        System.out.println("The value entered by you is: " + lines);


    }

}
