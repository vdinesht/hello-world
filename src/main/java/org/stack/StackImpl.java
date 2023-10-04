package org.stack;

public class StackImpl<T> implements Stack<T> {

    private T stackStore;
    private int stackSize;

    public StackImpl(){
        stackStore = null;
        stackSize = 0;
    }
    @Override
    public void push(T element) {
        stackStore = element;
    }

    @Override
    public T pop() {
        return stackStore;
    }

    @Override
    public int size() {
        return 0;
    }
}
