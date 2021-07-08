package lesson_3_hw;

import java.util.Arrays;

public class MyDeque<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;
    private int capacity;

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        this.capacity = capacity;
        list = (T[]) new Object[capacity];
    }
    public MyDeque() {
        this.capacity = DEFAULT_CAPACITY;
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void insertRight(T item) {
        if (isFull()) {
            reCapacity((int) (capacity * 1.5));
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public void insertLeft(T item) {
        if (isFull()) {
            reCapacity((int) (capacity * 1.5));
        }
        for (int i = end; i > 0; i--) {
            list[i] = list[i - 1];
        }
        list[0] = item;
        size++;
        end = nextIndex(end);
    }

    public T peekBegin() {
        if (isEmpty()) {
            throw new StackOverflowError("queue is empty");
        }
        return list[begin];
    }

    public T peekEnd() {
        if (isEmpty()) {
            throw new StackOverflowError("queue is empty");
        }
        if (size > 1 && (end - 1) < 0) {
            return list[nextIndex(list.length - 1)];
        } else {
            return list[end - 1];
        }
    }

    public T removeFirst() {
        T temp = peekBegin();
        if (size > 1 && (end == 0)) {
            for (int i = 0; i < size; i++) {
                list[i] = list[i + 1];
            }
            list[size - 1] = null;
            end = size - 1;
        } else {
            for (int i = 0; i < end; i++) {
                list[i] = list[i + 1];
            }
            end = nextIndex(end - 2);
        }
        size--;
        return temp;
    }

    public T removeLast() {
        T temp = peekBegin();
        size--;
        list[end - 1] = null;
        end = nextIndex(end - 2);
        return temp;
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    private int prevIndex(int index) {
        return (index - 1 + list.length) % list.length;
    }

    public boolean isFull() {
        return size == list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void reCapacity(int newCapacity) {
        this.capacity = (int) (newCapacity);
        T[] tempArr = (T[]) new Object[newCapacity];
        System.arraycopy(list, begin, tempArr, 0, list.length - begin);
        if(end != list.length - 1) {
            System.arraycopy(list, 0, tempArr, list.length - begin, end + 1);
        }
        list = tempArr;
        begin = 0;
        end = size;
    }

    @Override
    public String toString() {
        return Arrays.toString(list) + " begin = " + begin + ", end = " + end;
    }
}
