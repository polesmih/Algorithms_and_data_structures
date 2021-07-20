package lesson_6_hw;

import java.lang.management.ThreadInfo;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        final int count = 20;
        int isBalance = 0;

        for (int i = 0; i < count; i++) {
            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
            while (map.height() < 6) {
                map.put(ThreadLocalRandom.current().nextInt(-100, 100), ThreadLocalRandom.current().nextInt(0, 100));
            }
            System.out.println(map);

            if (map.isBalance())
                isBalance++;
        }

        System.out.println("Всего деревьев - " + count +
                ", из них сбалансировано - " + isBalance +
                ", из них не сбалансировано - " + (count - isBalance));


    }
}
