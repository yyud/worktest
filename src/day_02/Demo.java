package day_02;

import java.util.Scanner;

/**
 * @author yyud
 * 判断年份是否为闰年
 */
public class Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个有效年份：");
        long year = in.nextLong();
        if(year%4==0&&year%100!=0||year%4==0){
            System.out.println("这一年是闰年");
        }else {
            System.out.println("这一年不是闰年");
        }
    }
}
