public class Method {
    public static void main(String[] args) {
        sayHello();


        // 「掛け算メソッドを作成してみよう」
        System.out.println(multi(3, 4));
        System.out.println(multi(5, 7));
        System.out.println(multi(12, 34));


        // 「九九の表を作成してみよう」
        for (int a = 1; a <= 9; a++) {
            for (int num = 1; num <= 9; num++) {
                System.out.print(multi(a, num));
                if (num < 9) {
                    System.out.print(", ");
                } else {
                    System.out.println("");
                }
            }
        } 


        // 「間違い探し」
        String text = "paiza";
        sayHi(text);


        // 「RPGの攻撃シーン」
        String[] team = {"勇者", "戦士", "魔法使い"};
        int enemy_hp = 300;
        for (String person : team) {
            // 以下の行を、敵の体力を減少させるコードに書き換える
            enemy_hp = enemy_hp - attack(person);
            System.out.println("敵のHPは残り" + enemy_hp + "です");
        }


        // 「間違い探し - RPGの攻撃シーン」
        String[] enemies = {"スライム", "モンスター", "ドラゴン"};
        String player1 = "勇者";

        for (String enemy : enemies) {
            System.out.println(player1 + "は" + enemy + "を攻撃した");
        }

        System.out.println(player1 + "はすべての敵を倒した");

    }



    public static void sayHello() {
        System.out.println("hello paiza");
        }
    

    // 「掛け算メソッドを作成してみよう」,「九九の表を作成してみよう」
    public static int multi(int x, int y) {
        return x * y;
    }


    // 「間違い探し」
    public static void sayHi(String msg) {
        System.out.println("Hi " + msg);
        
    }


    // 「RPGの攻撃シーン」
    public static int attack(String player) {
        System.out.println(player + "はスライムを攻撃した");
        int hit = (int) (Math.random() * 10 + 1) * 10;
        System.out.println(hit + "のダメージを与えた");
        return hit;
    }

}
