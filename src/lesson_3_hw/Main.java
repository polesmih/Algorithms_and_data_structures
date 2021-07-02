package lesson_3_hw;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        // task 1 v-1
        String str = "population";
        MyStack<Character> stackStr = new MyStack<>();
        for (int i = 0; i < str.length(); i++) {
            stackStr.push(str.charAt(i));
        }
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            System.out.print(stackStr.pop());
        }
        System.out.println();

        // task 1 v-2
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();
        Stack stackString = new Stack();
        for (char ch : chars) {
            stackString.push(ch);
        }
        while (!stackString.isEmpty()) {
            System.out.print((char) stackString.pop());
        }

        // task 2 & realisation task 3
        MyDeque<Integer> deque = new MyDeque<>();
        deque.insertRight(1);
        System.out.println("Condition of the stack after add to the right: " + deque);
        deque.insertLeft(2);
        System.out.println("Condition of the stack after add to the left: " + deque);
        deque.insertRight(3);
        System.out.println("Condition of the stack after add to the right: " + deque);
        deque.removeFirst();
        System.out.println("Condition of the stack after remove the first index: " + deque);
        deque.removeLast();
        System.out.println("Condition of the stack after remove the last index:: " + deque);
        deque.insertLeft(4);
        deque.insertLeft(5);
        deque.insertLeft(6);
        deque.insertLeft(7);
        deque.insertLeft(8);
        deque.insertLeft(9);
        deque.insertLeft(10);
        System.out.println("Condition of the stack after add elements to the left: " + deque);
        deque.insertRight(11);
        deque.insertRight(12);
        deque.insertRight(13);
        System.out.println("Condition of the stack after add elements to the right: " + deque);

    }



}
