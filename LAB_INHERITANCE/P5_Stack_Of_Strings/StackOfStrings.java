package OOP.LAB_INHERITANCE.P5_Stack_Of_Strings;

import java.util.ArrayDeque;


public class StackOfStrings {
    private ArrayDeque<String> data;

    public StackOfStrings() {
        this.data = new ArrayDeque<>();
    }

    public void push(String item) {
        data.push(item);
    }

    public String pop() {
      return data.pop();
    }

    public String peek() {
       return data.peek();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
}
