package day_03;

/**
 * 1.新建一个记者类，记者去采访各行各业的人对他们职业的看法（至少三种，比如 Student、Teacher、Doctor）
 */

public class Test_001 {
    public static void main(String[] args) {
        CaiFang c = new CaiFang();
        c.say(new Student());
        c.say(new Teacher());
        c.say(new Doctor());
    }
}

class CaiFang{//
    public void say(Person person){
        person.caiFang();
    }
}

abstract class Person{
    public abstract void caiFang();
}

class Student extends Person{
    public void caiFang(){
        System.out.println("我是一個學生");
    }
}


class Teacher extends Person{
    public void caiFang(){
        System.out.println("我是一名老師");
    }
}

class Doctor extends Person{
    public void caiFang(){
        System.out.println("我是一名醫生");
    }
}