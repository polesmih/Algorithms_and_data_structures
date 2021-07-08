package lesson_5;

public class Pow {

    public static int recPow(int value, int powValue) {
        if (powValue == 1) {
            return value;
        }
        return recPow(value, powValue - 1) * value;
    }
}
