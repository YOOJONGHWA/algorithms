package ch04;

import java.util.IllegalFormatCodePointException;

public class intStack {

    private int[] stk;
    private int capacity;
    private int ptr;

    public class EmptyStackIntException extends RuntimeException {
        public EmptyStackIntException() {}
    }

    public class OverflowIntException extends RuntimeException {
        public OverflowIntException() {}
    }

    public intStack(int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            stk = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public int push(int x) throws OverflowIntException {
        if (ptr >= capacity)
            throw new OverflowIntException();
        return stk[ptr++] = x;
    }

    public int pop() throws EmptyStackIntException {
        if (ptr <= 0)
            throw new EmptyStackIntException();
        return stk[--ptr];
    }

    public int peek() throws EmptyStackIntException {
        if (ptr <= 0)
            throw new EmptyStackIntException();
        return stk[ptr - 1];
    }

    public void clear() {
        ptr = 0;
    }

    public int indexOf(int x) {
        for (int i= ptr - 1; i >= 0; i--) {
            if (stk[i] == x)
                return i;

        }
        return -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return ptr;
    }

    public boolean isEmpty() {
        return ptr <= 0;
    }

    public boolean isFull() {
        return ptr >= capacity;
    }

    public void dump() {
        if (ptr <= 0)
            System.out.println("스택이 비어 있습니다.");
        else {
            for (int i = 0; i < ptr; i++)
                System.out.print(stk[i] + " ");
            System.out.println();
        }
    }
}
