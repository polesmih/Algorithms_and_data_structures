package lesson_5;

public class Item {
    private int name;
    private int weight;
    private int cost;

    public Item(int name, int weight, int cost) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public int getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

//    public void setName(int name) {
//        this.name = name;
//    }
//
//    public void setWeight(int weight) {
//        this.weight = weight;
//    }
//
//    public void setCost(int cost) {
//        this.cost = cost;
//    }


}
