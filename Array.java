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


    }
    
}
