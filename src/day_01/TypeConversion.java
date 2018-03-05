package day_01;

/**
 * @author yyud
 * 基本数据的转化问题测试
 */
public class TypeConversion {
    public static void main(String[] args) {
        byte b = 127;
        char c = 'W';
        short s = 1234;
        int i = 111222;
        long l = 121212121L;
        float f = 222.22222F;
        double d = 111.111;
        //低类型转向高类型
        System.out.println("累加byte ==>"+b);
        System.out.println("累加char ==>"+(b+c));
        System.out.println("累加short ==>"+(b+c+s));
        System.out.println("累加int ==>"+(b+c+s+i));
        System.out.println("累加long ==>"+(b+c+s+i+l));
        System.out.println("float ==>"+(b+c+s+i+l+f));
        System.out.println("累加double ==>"+(b+c+s+i+l+f+d));

        //long 强制转换int
        System.out.println("把long类型转换为int类型"+(int)b);
        //高类型转低类型丢数据
        System.out.println("long类型转换为short类型丢失数据"+(short)b);
        //实数变整数丢小数
        System.out.println("float类型转化int类型: "+(int)f);
        //整数转化字符
        System.out.println("int类型数据转换为char类型"+(char)i);
    }
}
