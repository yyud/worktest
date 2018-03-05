package day_02;

public class ProductPrice {
    public static void main(String[] args) {
        float money = 1100;
        String rebate = "";
        if (money > 200) {
            int grade = (int) money / 200;
            switch (grade) {
                case 1:
                    rebate = "九五折";
                    break;
                case 2:
                    rebate = "九折";
                    break;
                case 3:
                    rebate = "八五折";
                    break;
                case 4:
                    rebate = "八折";
                    break;
                case 5:
                    rebate = "七五折";
                    break;
                case 6:
                    rebate = "七三折";
                    break;
                case 7:
                    rebate = "七折";
                    break;
                case 8:
                    rebate = "六五折";
                    break;
                case 9:
                    rebate = "六三折";
                    break;
                case 10:
                    rebate = "六折";
                    break;
                default:
                    rebate = "5折";


            }
            System.out.println("您的消费总金额为："+money);
            System.out.println("您享受的优惠折扣是"+rebate);
        }
    }
}
