package day_02;

import java.util.Scanner;

public class NumberExchange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//创建扫描器
        System.out.println("请输入数字A");
        long a = in.nextLong();             //获取数值A
        System.out.println("请输入数字B");
        long b = in.nextLong();             //获取数值B
        a = a^b;
        b = b^a;
        a = a^b;
        System.out.println("交换位置后："+"\n"+"A:"+a+"\n"+"B:"+b);


    }
}
