package day_01;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author yyud
 * <br/>
 * 输出重定向测试
 */

public class RedirectOutputStream {
    public static void main(String[] args) {
        try {
            PrintStream out = System.out;
            PrintStream ps = new PrintStream("./test.txt");
            System.setOut(ps);
            String name = "杨辉";
            System.out.println("姓名："+name);
            int age  = 20;
            System.out.println("年龄："+age);
            System.out.println("您的姓名是"+name+"您的年龄是"+age);
            System.setOut(out);
            System.out.println("程序结束！");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
