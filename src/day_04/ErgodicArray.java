package day_04;

public class ErgodicArray {
    public static void main(String[] args) {
        String[] animal = new String[5];
        String[] animal2 = {"猴子","老虎","狮子","老鹰","大象"};
        for (int i = 0; i < animal.length; i++) {
            animal[i] = "猴子"+i;
        }
        int index = 0;
        while (index<animal.length){
            System.out.println(animal[index]);
            System.out.println(animal2[index]);
            index++;
        }
    }
}
