package Fpocket;
// задание 1
public class FirstClass {
    public static void main(String[] args) { //задание 2

        byte byte1 = 5;
        short shot1 = 69;
        int int1 = 228;
        long long1 = 1337;
        float float1 = 5.5f;
        double double1 = -5.5;

        char char1 = 'a';

        boolean bl1 = false;
        boolean bl2 = true;

        String string1 = "5";


    }

    public static float aboba1(float a, float b, float c, float d) {
        return a * (b + (c / d)); // задание 3

    }

    public static void aboba2(String Тимур) { //задание 7
        System.out.println("Привет," + Тимур + "!");
        return;
    }

    public static boolean amogus1(int a, int b) { //задание 4
        int c = a + b;
        if (10 <= c & c <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void amogus2(double a) { //задание 5
        if (a < 0) {
            System.out.println("отрицательное");
        } else {
            System.out.println("положительное");
        }
        return;
    }

    public static boolean oleja1(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
}