package day_01;

public class ArrayTest {

    public void arrayPassTest(String s, String[] ss)
    {
        s = "bad";
        ss[0] = "bbb";
    }
    public static void main(String[] args)  {

        String s1 = new String("good");
        String[] ss1 = {"aaa"}; //string数组，只有一个元素

        ArrayTest test = new ArrayTest();
        test.arrayPassTest(s1, ss1);
        System.out.println(s1+ss1[0]);

    }
}
