package day_03;

/**
 *  运用归并或者快速排序算法实现对int类型的排序，然后运用多态和面向抽象编程的思想将其改写，使得：
 *  该类支持对任意自定义类型进行排序
 *
 */


abstract class Algorithm_001 {
    /**
     * 将有序两数列合并
     * @param a  需要排列的数组
     * @param low 初始下标
     * @param mid 中间下标
     * @param high 结束下标-------------------------------------------------------------------------------
     */
    public  static void merge(Algorithm_001[] a, int low, int mid, int high) {
        Algorithm_001 tem[] = new Algorithm_001[high - low + 1];//零时存放数组
        int lift = low;//左下标
        int rigth = mid+1;//右下标
        int m = 0;//零时数组下标起点
        //合并
        while (lift<=mid&&rigth<=high){       // 同 时  循环遍历数列左和数列右直到有一个数列遍历完毕停止
            if(a[lift].compare(a[rigth])){    //放入时排序
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
            a[k2 + low] = tem[k2];
        }
    }

    /**
     * 递归实现对数列无限拆分至剩下单个然后有序合并排列
     * @param a 数组
     * @param low 起始下标
     * @param high 中间下标
     */
    public  static void mergeSort(Algorithm_001[] a, int low, int high) {

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
/////////////////////////////////////////////////////////////////////////////////////////

    /**
     *  比较两个对象的大小
     * @param algorithm  比较的对象
     * @return  true/false
     */
    public  abstract boolean compare(Algorithm_001 algorithm);       //定义抽象方法比较两个对象大小


    /**
     * 调用 归并 方法排序
     * @param a 排序的数组
     *
     */

    public static  void sort(Algorithm_001[] a) {
        mergeSort(a,0,a.length-1);

    }
}



/**
 * 测试归并排序
 */

public class TestSort extends Algorithm_001{

    private int x ;
    public  TestSort(int x){
        this.x = x;
    }

    /**
     *  当前对象的x属性的值小于形参对象x属性值返回true否则返回false
     * @param algorithm  比较的对象
     * @return true/false
     */
    @Override
    public boolean compare(Algorithm_001 algorithm){
        if(this.getX()<((TestSort)algorithm).getX()) {
            return true;
        }else{
            return false;
        }
    }

    public int getX(){
        return this.x;
    }
    /**
     * 打印显示
     */

    public void display(){
        System.out.print(this.x+"  ");
    }

    public static void main(String[] args) {
        TestSort a[] = new TestSort[10]; ///声明TestSort 对象数组
        int x ;
        System.out.println("排序前：");
        for (int i = 0; i < 10; i++) {  //实例化对象数组中个成员对象
            x = (int)(Math.random()*50);
          //  System.out.print(x+"XX  ");
            a[i]   = new TestSort(i+x); //随机设定X属性值

            a[i].display();
        }
      //  Algorithm_001.sort(a);
        TestSort.sort(a);

        System.out.println();
        System.out.println("\n"+"排序后：");
        for (int i = 0; i < 10; i++) {
            a[i].display();
        }
    }
}


