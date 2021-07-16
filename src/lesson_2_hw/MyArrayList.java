package lesson_2_hw;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyArrayList<E extends Comparable <E>> {
    private E[] list;
    private int size;
    private int capacity;

    private final int DEFAULT_CAPACITY = 10;


    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (E[]) new Comparable[capacity];
    }

    public MyArrayList() {
        list = (E[]) new Comparable[DEFAULT_CAPACITY];
    }

    // метод для увеличения массива на (size / 2 + 1)
    private void increaseCapacity() {
        capacity  = capacity + (size / 2 + 1);
        E[] newList = (E[]) new Comparable[capacity];
        for (int i = 0; i < size; i++) {
            newList[i] = list[i];
            list[i] = null;
        }
        list = newList;
    }

    public void add(E item) {
    // добавлена проверка переполнения массива и при необходимости увеличение
        if (size >= capacity) {
            increaseCapacity();
        }

        list[size] = item;
        size++;
    }

    public void add(int index, E item) {
    // добавлена проверка корректности index [0..size]
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("the index doesn't exist");
        }

    // добавлена проверка переполнения массива и при необходимости увеличение
        if (size >= capacity) {
            increaseCapacity();
        }

        for (int i = size; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = item;
        size++;
    }


    public void remove(int index) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        // добавлена проверка корректности index [0..size]
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("the index doesn't exist");
        }

        for (int i = index; i <= size ; i++) {
            list[i] = list[i + 1];
        }
        size--;
        list[size] = null;
    }

    public boolean remove(E item) {
        int i = index(item);
        if (i == -1) {
            return false;
        }
        remove(i);
        return true;
    }

    public boolean contains(E item) {
        return index(item) > -1;
    }

    public int indexOf(E item) {
        return index(item);
    }

    private int index(E item) {
        int i;
        for (i = 0; i < size; i++) {
            if (list[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E get(int index) {
        // добавлена проверка корректности index [0..size]
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("the index doesn't exist");
        }
        return list[index];
    }

    public int size() {
        return size;
    }


    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(list, size));
    }

    public boolean less(E item1, E item2) {
        return item1.compareTo(item2) < 0;
    }

    private void swap(int index1, int index2) {
        E temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }

    public void selectionSort() {
        int iMin;
        for (int i = 0; i < size; i++) {
            iMin = i;
            for (int j = i + 1; j < size; j++) {
                if (less(list[j], list[iMin])) {
                    iMin = j;
                }
            }
            swap(i, iMin);
        }
    }

    public void insertionSort() {
        E key;
        for (int i = 1; i < size; i++) {
            int j = i;
            key = list[i];
            while (j > 0 && less(key, list[j - 1])) {
                list[j] = list[j - 1];
                j--;
            }
            list[j] = key;
        }
    }

    public void bubbleSort() {
        for (int i = size - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (less(list[j + 1], list[j])) {
                    swap(j + 1, j);
                }
            }
        }
    }

}
