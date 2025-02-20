public class Car2 {
    // メンバ変数
    int no;
    int speed;


    // コンストラクタ
    Car2() {
        no = 0;
    }

    Car2(int n) {
        no = n;
    }


    // メソッド
    void run(int s) {
        speed = s;
    }

    void brake() {
        speed = 0;
    }

    void brake(int s) {
        speed = speed - s;
    }

    void display() {
        System.out.println("ナンバー" + no + "の速度は" + speed + "です");
    }
    
}
