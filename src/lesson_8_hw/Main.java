package lesson_8_hw;

public class Main {
    public static void main(String[] args) {

        ChainingHashMap<Integer, String> chm = new ChainingHashMap<>(16);
        chm.put(1, "one");
        chm.put(222, "222e");
        chm.put(4545, "4545e");

        System.out.println(chm);
        chm.delete(222);
        System.out.println(chm);


    }
}
