package day_02;

import java.util.Scanner;

/**
 * @author
 * 用户登录验证
 */

public class CheckLogin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//创建扫描器
        System.out.println("请输入用户名");
        String name  =  in.nextLine();//接收用户名
        System.out.println("请输入密码");
        String password  = in.nextLine();
        if(!(name.equals("yanghui"))){
            System.out.println("您输入的的用户名不正确");
        }else if(!(password.equals("123456"))){
            System.out.println("您输入的密码不正确");
        }else {
            System.out.println("恭喜验证成功");
        }
    }
}
