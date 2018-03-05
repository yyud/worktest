package day_03;

/**
 * 回家
 * @author
 */
interface pelope{
    public void home();
}

public class BackHome_003 implements pelope{
    private int time;
    private jiaotong j;
    public BackHome_003(int time){
        this.time=time;
    }

    public int getTime(){
        return time;
    }
    public void home(){

        if(this.getTime()<=6){
            this.j = new s();
        }
        if(this.getTime()>6&&this.time<=7){
            this.j = new s2();
        }
        if(this.getTime()>7){
            this.j = new s3();
        }
        j.goHome();
    }

    public static void main(String[] args) {
        new BackHome_003(6).home();
    }

}

interface jiaotong{
    public void goHome();
}


class s implements jiaotong{
    public void goHome(){
        System.out.println("自行车");
    }
}

class s2 implements jiaotong{
    public void goHome(){
        System.out.println("公交车");
    }
}

class s3 implements jiaotong{
    public void goHome(){
        System.out.println("小汽车");
    }
}