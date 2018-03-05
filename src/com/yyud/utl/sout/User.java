package com.yyud.utl.sout;

import com.yyud.utl.sout_02.Algorithm_02;

/**
 * user测试类
 */
public class User<T extends User> extends UserComparator <T>{
    private String name;
    private int age;
    public User(String name,int age){
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }


    public static void main(String[] args) {
        User [] users = new User[10];
        for(int i =0;i<users.length;i++){
            users[i] = new User("i",i+(int)(Math.random()*20));
        }
        //Algorithm.sort(users);
        Algorithm_02 al = new <User>Algorithm_02();
        al.qkuSrot(users,0,users.length-1);
        for(int i =0;i<users.length;i++){
            users[i].display();
        }

    }

    @Override
    public int compare(T o1, T o2) {
        if (o1.getAge() > o2.getAge()) {
            return -1;
        } else if (o1.getAge() < o2.getAge()) {
            return 1;
        } else {
            //利用String自身的排序方法。
            //如果年龄相同就按名字进行排序
            return o1.getName().compareTo(o2.getName());
        }
    }

    private void display() {
        System.out.println("name:"+this.getName()+"  "+"age:"+this.age);
    }
}
