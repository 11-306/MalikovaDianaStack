package StackMinMax;

public class Main {
    public static void main(String[] args) {
        StackMaxAndMin stack = new StackMaxAndMin();
        stack.push(8);
        stack.push(2);
        stack.push(3);
        stack.push(1);
        stack.push(5);
        stack.push(6);
        stack.push(4);
        stack.push(10);
        System.out.println("min " + stack.min());
        System.out.println("max " + stack.max());
    }
}
