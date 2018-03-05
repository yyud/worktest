package day_02;

public class Test {
    public static void main(String[] args) {
        String a = "ab";
        String bb = "b";
        String b = "a" + bb;
        System.out.println(a == b);
        b = "a" + "b";
        System.out.println(a == b);
    }
}
