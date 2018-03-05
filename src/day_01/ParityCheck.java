package day_01;

import java.util.Scanner;

/**
 * @author yyud
 * 三目运算符
 */
public class ParityCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int x = in.nextInt();
        System.out.println((x%2==0)?"这个数是偶数":"这个数是基数");
    }
}
