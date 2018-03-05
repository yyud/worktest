package com.yyud.utl.sout;

import java.util.Comparator;

/**
 * 用户自定义比较类
 */
public abstract class UserComparator<T> implements Comparator<T> {

    abstract public int compare(T o1, T o2) ;
}
