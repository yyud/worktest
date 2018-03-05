package day_04;

public class YanghuiTriangle {
    public static void main(String[] args) {
        int x = 10;
        int[][] yanghui = new int[10][];
        for (int i = 0;i < x;i++){
            yanghui[i] = new int[i+1];//创建数组
            //赋值
            yanghui[i][0] = 1;//首列
            yanghui[i][i] = 1;//尾列
            for(int j = 1;j<i;j++){
                if (i > 1) {
                    yanghui[i][j] = yanghui[i-1][j-1] +yanghui[i-1][j];
                }
            }
        }

        for (int[] aYanghui : yanghui) {
            for (int anAYanghui : aYanghui) {
                System.out.print(anAYanghui + "  ");
            }
            System.out.println();
        }
    }
}
