public class Car3 {
    // メンバ変数
    private int no;
    private int speed;


    // コンストラクタ
    public Car3() {
        no = 0;
    }

    public Car3(int n) {
        no = n;
    }


    // メソッド
    public void run(int s) {
        speed = s;
    }

    public void brake() {
        speed = 0;
    }

    public void brake(int s) {
        speed = speed - s;
    }

    public void display() {
        System.out.println("ナンバー" + no + "の速度は" + speed + "です");
    }
    
}
