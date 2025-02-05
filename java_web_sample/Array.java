public class Array {
    public static void main(String[] args) {

        // 「配列の中身を出力してみよう」
        String[] array = {"戦士","侍","僧侶","魔法使い"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // 「指定の文字を配列にしてみよう」
        String item[] = {"ロングソード", "ブレードソード", "エクスカリバー"};
        System.out.println(item[0]);
        System.out.println(item[1]);
        System.out.println(item[2]);

        // 「変数で、配列に代入しよう」
        String player_1 = "勇者";
        String player_2 = "魔法使い";
        String player_3 = "戦士";
        // player_1 ~ 3を、配列に代入して、printlnメソッドで出力してください。
        String[] playerArray = {player_1, player_2, player_3}; 
        for (int i = 0; i < playerArray.length; i++) {
            System.out.println(playerArray[i]);
        }

        // 「配列から最初の要素を取り出してみよう」
        String[] team = {"勇者", "戦士", "侍", "忍者", "魔法使い"};
        System.out.println(team[0]);

        // 「配列から特定要素を取り出してみよう」
        String[] teams = {"勇者", "戦士", "侍", "忍者", "魔法使い"};
        System.out.println(teams[2]);

        // 「配列の中身を1行ずつ表示してみよう」
        String[] enemy = {"スライム", "モンスター", "ゾンビ", "ドラゴン", "魔王"};
        for (int i = 0; i < enemy.length; i++) {
            System.out.println(enemy[i] + "が現れた");
        } 

        // 「要素の合計を計算してみよう」
        int[] numbers = {12, 34, 56, 78, 90};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

        // 「配列の中身を1行ずつ表示してみよう2」
        String[] enemys = {"スライム", "モンスター", "ゾンビ", "ドラゴン", "魔王"};
        for (String enemy_1 : enemys) {
            System.out.println(enemy_1 + "が現れた");
        }

        // 「要素の合計を計算してみよう2」
        int numbers_1[] = {12, 34, 56, 78, 90};
        int sum_1 = 0;
        for (int i : numbers_1) {
            sum_1 += i;
        }
        System.out.println(sum_1);
        
    }
    
}
