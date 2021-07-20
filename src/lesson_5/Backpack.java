package lesson_5;

import java.util.LinkedList;

public class Backpack {

    private LinkedList<Item> setItems = new LinkedList<Item>();

    private int maxWeight;
    private int setCost;

    public Backpack (int maxW) {
        maxWeight = maxW;
    }

    private int WeightCount(LinkedList<Item> items) {
        int sumW = 0;
        for (Item i : items) {
            sumW += i.getWeight();
        }
        return sumW;
    }

    private int CostCount(LinkedList<Item> items) {
        int sumC = 0;
        for (Item i : items) {
            sumC += i.getCost();
        }
        return sumC;
    }

    private void CheckSet (LinkedList<Item> items) {
        if (setItems == null) {
            if (WeightCount(items) <= maxWeight) {
                setItems = items;
                setCost = CostCount(items);
            }
        } else {
            if (WeightCount(items) <= maxWeight && CostCount(items) > setCost) {
                setItems = items;
                setCost = CostCount(items);
            }
        }
    }

    public void CreateSet (LinkedList<Item> items) {
        if (items.size() > 0) {
            CheckSet(items);

            for (int i = 0; i < items.size(); i++) {
                LinkedList<Item> newSet = new LinkedList<>(items);
                newSet.remove(i);
                CreateSet(newSet);
            }
        }

    }

    public LinkedList<Item> GetSet() {
        return setItems;
    }

}
