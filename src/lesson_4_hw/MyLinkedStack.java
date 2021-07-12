package lesson_4_hw;

public class MyLinkedStack <E> {
    private MyLinkedList<E> list = new MyLinkedList<>();

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(E item) {
        list.insertFirst(item);
    }

    public E pop() {
        return list.removeLast();
    }

    public E peek() {
        return list.getFirst();
    }

}
