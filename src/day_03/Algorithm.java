package day_03;

/**
 *  运用归并或者快速排序算法实现对int类型的排序，然后运用多态和面向抽象编程的思想将其改写，使得：
 *  该类支持对任意自定义类型进行排序
 *
 */

public class Algorithm {
    /**
     * 将有序两数列合并
     * @param a  需要排列的数组
     * @param low 初始下标
     * @param mid 中间下标
     * @param high 结束下标
     */
    public static void merge(int[] a, int low, int mid, int high) {
        int tem[] = new int[high - low + 1];//零时存放数组
        int lift = low;//左下标
        int rigth = mid+1;//右下标
        int m = 0;//零时数组下标起点
        //合并
        while (lift<=mid&&rigth<=high){         //升序
            if(a[lift]<a[rigth]){
                tem[m++] = a[lift++];
            }else{
                tem[m++] = a[rigth++];
            }
        }

        //存入左剩下
        while (lift<=mid){
            tem[m++] = a[lift++];
        }

        //存入右剩下
        while (rigth<=high){
            tem[m++] = a[rigth++];
        }

        //将排序结果返回原数组
        for (int k2 = 0; k2 < tem.length; k2++) {
            a[k2 + low] = tem[k2];
        }
    }

    /**
     * 递归实现对数列无限才分并有序排列并合并
     * @param a 数组
     * @param low 起始下标
     * @param high 中间下标
     */
    public static void mergeSort(int[] a, int low, int high) {
        int mid =   (low+high)/2;//中间下标

        if (low < high) {//判断数列是否还可再拆分
            // 左边拆分
            mergeSort(a, low, mid);
            // 右边拆分
            mergeSort(a,mid + 1, high);
            // 左右归并
            merge(a, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int a[] = { 51, 46, 20, 18, 65, 97, 82, 30, 77, 50 };
        mergeSort(a, 0, a.length - 1);
        System.out.println("排序后数列为");
        for (int i = 0 ; i<a.length;i++){
            System.out.print(a[i]+"  ");
        }
    }

}


