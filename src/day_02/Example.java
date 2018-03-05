package day_02;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//创建扫描器
        System.out.println("请输入新员工姓名：");
        String name = in.nextLine();//接收用户名
        System.out.println("请输入应聘的编程语言：");
        String longuage = in.nextLine();//接收编程语言
        //switch判断分支
        switch (longuage.hashCode()) {
            case 123:
                System.out.println("HTML");
                break;
            case 321:
                System.out.println("javascript");
                break;
            case 2269730:
                System.out.println(name + "被分配到" + "java开发部门");
                break;
            case 2112:
                System.out.println(name + "被分配到" + "c语言开发部门");
                break;
            case -709190099:
            case 9745910:
                System.out.println(name + "被分配到" + "asp测试部门");
                break;
            default:
                System.out.println("公司暂不需要此语言开发人员");
        }
    }
}
