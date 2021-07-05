package lesson_4_hw;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        //realisation of the task_1

        MyLinkedStack<String> list = new MyLinkedStack<>();
        list.push("one");
        list.push("two");
        list.push("three");
        list.push("four");
        System.out.println(list.peek());
        for (int i = 0; i < 4; i++) {
            System.out.println(list.pop());
        }

        // realisation of the task_2

        MyLinkedList<Integer> mll = new MyLinkedList<>();
        mll.insertFirst(5);
        mll.insertFirst(6);
        mll.insertFirst(2);
        mll.insertFirst(8);
        System.out.println(mll);
        mll.insertLast(77);
        mll.insertLast(88);
        System.out.println("MyLinkedList: " + mll);

        Iterator<Integer> iterator = mll.iterator();
        System.out.println("Iterator: ");
        while (iterator.hasNext()){
        System.out.println(iterator.next() + ", ");
        }
        System.out.println();

        for (Integer x : mll) {
        System.out.println("Iterator: " + x);
        }

    }
}
