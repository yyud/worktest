package com.yyud.utl.arraylisttest;

/**
 * 测试ArrayListTest类
 */
public class Student {
    private String name;
    public static void main(String[] args) {
        String[] names  = {"张三","李四","吴义勇","丁伟","唐建"};
        Student[] stus = new Student[names.length];
        ArrayListTest<Student> list = new ArrayListTest();
        //添加数据
        for (int i = 0; i <names.length ; i++) {
            stus[i] = new Student(names[i]);
            list.add(stus[i]);
        }
        //输出容量
        System.out.println(list.size());
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        //修改设置数据
        list.set(0,new Student("杨辉"));
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }

    public  Student(){}

    public Student(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
