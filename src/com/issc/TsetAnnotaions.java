package com.issc;

import java.lang.reflect.Method;

public class TsetAnnotaions {
    public static void main (String[] args) throws Exception {
        //获取类对象
       Class aclass = Class.forName("com.issc.Student");
       //创建类的对象
       Student student = (Student) aclass.newInstance();
       //获取类对象注解
       AnnotationsTest annotationsTest = (AnnotationsTest) aclass.getAnnotation(AnnotationsTest.class);
       if(annotationsTest!=null){
           //通过反射获取类的对象的方法
           Method nameMethod = aclass.getMethod("setName",String.class);
           Method ageMethod = aclass.getMethod("setAge",int.class);
           //调用该方法完成赋值操作
           nameMethod.invoke(student,annotationsTest.name());
           ageMethod.invoke(student,annotationsTest.age());
           //打印输出
           System.out.println(student.getAge());
       }
    }
}
