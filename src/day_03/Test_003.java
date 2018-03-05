package day_03;

public class Test_003 {

    private int i=1;
    public Test_003(){
        System.out.println(getI());
    }
    public int getI() {
        return i;
    }
    public static void main(String[] args) {
        new B();
    }
}
class  B extends Test_003{
    private  int i=8;
    public int getI() {
        return i;
    }
}
