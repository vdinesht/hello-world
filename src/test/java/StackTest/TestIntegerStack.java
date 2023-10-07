package StackTest;

import org.junit.jupiter.api.Test;
import org.stack.Stack;
import org.stack.StackImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIntegerStack {

    private Stack<Integer> intStack;

    @Test
    void isStackReturningValueInLIFO(){

        intStack = new StackImpl<Integer>();
        intStack.push(1);
        intStack.push(2);

        assertEquals (intStack.pop(), 2);
    }

    @Test
    void pushThreeObjectAndCheckSize(){
        intStack = new StackImpl<Integer>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        assertEquals(3, intStack.size());
    }

    @Test
    void pushAndPopCheckSize(){
        intStack = new StackImpl<Integer>();
        intStack.push(1);
        intStack.pop();
        intStack.push(2);
        intStack.pop();
        intStack.push(3);

        assertEquals(1, intStack.size());
    }
}
