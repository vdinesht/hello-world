package StackTest;

import org.junit.jupiter.api.Test;
import org.stack.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStack {

    private Stack stack;

    TestStack(){
        stack = new Stack();
    }
    @Test
    void testIfStackIsReturningTopValue(){
        stack.push(1);
        stack.push(2);

        assertEquals (stack.pop(), 2);
    }
}
