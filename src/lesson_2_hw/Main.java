package lesson_2_hw;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        MyArrayList<Integer> mal = new MyArrayList<>();
//        mal.add(4);
//        mal.add(6);
//        mal.add(7);
//        mal.add(9);
//        mal.add(2);
//        mal.add(8);
//        mal.add(9);
//        mal.add(5);
//        mal.add(1);
//        mal.add(0);
//        mal.add(11);
//
//        System.out.println(mal);
//
//        mal.add(2, 11);
//        System.out.println(mal);

        Random random = new Random();
        MyArrayList<Integer> mal = new MyArrayList<>(10000);
        for (int i = 0; i < 10000; i++) {
            mal.add(random.nextInt(10000));
        }

        System.out.println(mal);

//        mal.selectionSort();
//        System.out.println(mal);
        mal.insertionSort();
        System.out.println(mal);
//        mal.bubbleSort();
//        System.out.println(mal);

    }
}
