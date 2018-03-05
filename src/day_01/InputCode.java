package day_01;

import java.util.Scanner;

/**
 * @author yyud
 * <br/>
 * 这是一个简单的利用Scanner对象方法接收控制台输入的测试类
 */

public class InputCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一串字符");
        String str = in.nextLine();
        System.out.println("你输入的字符如下：");
        System.out.println(str);
    }
}
