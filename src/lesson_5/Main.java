package lesson_5;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Pow pow = new Pow();

        System.out.println(pow.recPow(2, 10));

        BackpackTask();

    }

    static void BackpackTask() {
        LinkedList<Item> item = new LinkedList<>();

        item.add(new Item(1, 5, 4));
        item.add(new Item(2, 10, 8));
        item.add(new Item(3, 3, 14));
        item.add(new Item(4, 1, 7));
        item.add(new Item(5, 9, 9));
        item.add(new Item(6, 13, 10));

        System.out.println("Общий список предметов: " );
        for (Item i : item) {
            System.out.println(i.getName() + "\t " + i.getWeight() + "\t " + i.getCost());
        }

        Backpack backpack = new Backpack(14);
        backpack.CreateSet(item);

        LinkedList<Item> create = backpack.GetSet();

        if (create == null) {
            System.out.println("Варианты отсутствуют");
        } else {
            item.clear();
            System.out.println("Набор для рюкзака: ");

            for (Item i : create) {
                System.out.println(i.getName());
            }
        }

    }

}

