package com.yyud.utl.sout;

/**
 * 排序
 *
 */
public class Algorithm {

    /**归并排序
     * @param a
     * @param low
     * @param mid
     * @param high
     *
     */

    public  static<T extends UserComparator> void merge(T[] a, int low, int mid, int high) {
        Object tem[] = new Object [high - low + 1];//零时存放数组
        int lift = low;//左下标
        int rigth = mid+1;//右下标
        int m = 0;//零时数组下标起点
        //合并

        while (lift<=mid&&rigth<=high){       // 同 时  循环遍历数列左和数列右直到有一个数列遍历完毕停止
            if((a[lift].compare(a[lift],a[rigth]))==1){    //放入时排序
                tem[m++] = a[lift++];
            }else{
                tem[m++] = a[rigth++];
            }
        }

        //存入左剩下
        while (lift<=mid){                   //判断左剩下数列中的元素
            tem[m++] = a[lift++];
        }

        //存入右剩下
        while (rigth<=high){                 //判断右剩下数列中的元素
            tem[m++] = a[rigth++];
        }

        //将排序结果返回原数组
        for (int k2 = 0; k2 < tem.length; k2++) {
            a[k2 + low] =  (T)tem[k2];
        }
    }

    /**
     * 递归实现对数列无限拆分至剩下单个然后有序合并排列
     * @param a 数组
     * @param low 起始下标
     * @param high 中间下标
     */
    public  static<T extends UserComparator> void mergeSort(T [] a, int low, int high) {

        // int mid =  low + (high - low)/2;//中间下标
        int mid = (high + low)/2;//中间下标

        if (low < high) {//判断数列是否还可再拆分
            // 左边拆分
            mergeSort(a, low, mid);
            // 右边拆分
            mergeSort(a,mid + 1, high);
            // 左右归并
            merge(a, low, mid, high);
        }
    }
    /**
     * 调用 归并 方法排序
     * @param a 排序的数组
     *
     */

    public static <T extends UserComparator> void sort(T[] a) {
        mergeSort(a,0,a.length-1);

    }
}
