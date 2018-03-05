package com.yyud.utl.arraylisttest;

import java.lang.reflect.Array;

/**
 * @author yyud
 * @param <E> 存入对象类型
 */

public class ArrayListTest<E> {
    private  static int defaultSize = 10;
    private int size;
    private E[] list;
    public ArrayListTest(){
        this.size = 0;
        this.list = null;
    }

    /**
     * 添加数据
     * @param e 添加对象
     */
    public void add(E e){
        if(list==null){//初始化数组
            if(e == null){

            }
            list =(E[])Array.newInstance(getObjectClass(e),defaultSize);
            size = 0;
        }
        if(size==defaultSize){//超出容量扩容
            list = clone(e);
        }else{
             list[size++] = e;
        }

    }

    /**
     * 数组扩容
     * @param e 原数组对象
     * @return 扩容后数组
     */
    private E[] clone(E e){
        defaultSize *= 2;
        E[] listTo =(E[])Array.newInstance(getObjectClass(e),defaultSize);
        for (int i = 0; i < size; i++) {
            listTo[i] = list[i];
        }
        return listTo;
    }

    /**
     * 修改设置数据
     * @param e 存入对象
     * @return
     */
    public void set(int i,E e){
        if(list==null){//初始化数组
            list =(E[])Array.newInstance(getObjectClass(e),defaultSize);
            while(size < i){
                list[size++] = null;
            }
        }
        list[i]  = e;
    }

    /**
     * 获取元素
     * @param i 数组下标值
     * @return 存储的对象
     */
    public E get(int i){
        if(list == null){
            System.out.println("数组 为空请先添加数据");
            System.exit(0);
        }
        return list[i];
    }

    /**
     * 获取存入对象个数
     * @return
     */
    public int size(){
        return size;
    }

    /**
     * 获取对象类型
     * @param e
     * @return
     */
    private Class getObjectClass(E e){
        Class<?> aclass  = e.getClass();
        return aclass;
    }

    /*private E[] getListArray(E e) {
        Class<E> aclass = getObjectClass(e);
        try {
            E EObject = aclass.newInstance();
            String str = aclass.getName();
            Class<E> s = aclass.getResource(str);
        } catch (InstantiationException | IllegalAccessException e1) {
            e1.printStackTrace();
        }
        return
    }*/

}
