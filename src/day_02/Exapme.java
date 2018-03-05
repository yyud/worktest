package day_02;

import java.util.Scanner;

/**
 * @author yyud
 * 测试移位运算
 */

public class Exapme {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);//创建扫描器
        System.out.println("请输入一个数字");
        long x = in.nextLong();//获取值
        System.out.println("您输入的数字是: "+x);
        System.out.println("该数字乘以2的结果是： "+(x<<1));
        System.out.println("该数字乘以4的结果是： "+(x<<2));
        System.out.println("该数字乘以8的结果是： "+(x<<3));
        System.out.println("该数字乘以16的结果是： "+(x<<4));

    }
}
