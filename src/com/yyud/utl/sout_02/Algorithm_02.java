package com.yyud.utl.sout_02;


import com.yyud.utl.sout.UserComparator;

/**
 * 快速排序
 */
public class Algorithm_02 {

    public static<T extends UserComparator> void qkuSrot(T[] a, int s, int e) {  //快速排序算法
        int start = s;        //左指针
        int end = e;          //右指针
        T mark = a[s];     //确定快速排序的中间值 key
        T temp = null;            // 数据两两交换的临时变量

        while (start < end) {
            while (start < end && (a[end].compare(a[end], mark) == -1 || a[end].compare(a[end], mark) == 0)) //调用重写的sort方法判断大小
                end--;

            if (a[end].compare(a[end], mark) == 1) {  //两两交换
                temp = a[start];
                a[start] = a[end];
                a[end] = (T) temp;
            }
            while (start < end && (a[start].compare(a[start], mark) == 1 || a[start].compare(a[start], mark) == 0))//调用重写的sort方法判断大小
                start++;

            if (a[start].compare(a[start], mark) == -1) {  //两两交换
                temp = a[start];
                a[start] = a[end];
                a[end] =  temp;
            }

        }
        if (start > s) {
            qkuSrot(a, s, start - 1);  //递归  左半边再进行快速排序
        }
        if (end < e) {
            qkuSrot(a, end + 1, e);  //递归  右半边再进行快速排序
        }
    }
}
