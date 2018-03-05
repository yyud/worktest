package day_01;

import java.util.Scanner;

/**
 * @author yyud
 * 字符异或运算
 */
public class Example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个英文字符串或解密字符串");
        String password = in.nextLine();
        char []array = password.toCharArray();
        for (int i =0;i<array.length;i++){
            array[i] = (char)(array[i]^20000);//字符异或运算
        }
        System.out.println("加密或解密的结果如下");
        System.out.println(array);
    }
}
