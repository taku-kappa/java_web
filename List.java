import java.util.*;

public class List {
    public static void main(String[] args) {
        
        // 「ArrayListに要素を追加してみよう」
        ArrayList<String> weapon = new ArrayList<String>();
        weapon.add("木の棒");
        weapon.add("鉄の剣");
        weapon.add("石斧");
        
        for (String item : weapon) {
            System.out.println(item);
        }


        // 「ArrayListの要素を上書きしてみよう」
        weapon.set(2, "石の槍");

        for (String item_1 : weapon) {
            System.out.println(item_1);
        }


        // 「ArrayListから要素を削除してみよう」
        weapon.remove(2);

        for (String item_2 : weapon) {
            System.out.println(item_2);
        }


        // 「ArrayListの要素数を出力してみよう」
        System.out.println(weapon.size());


        // 「文字列をカンマで分割してみよう」
        String team_str = "勇者,戦士,忍者,魔法使い";
        String[] team_array = team_str.split(",");
        for (String s : team_array ) {
            System.out.println(s);
        }


        // 「英文の単語数を数えよう」
        String str = "One cold rainy day when my father was a little boy he met an old alley cat on his street";
        int count = str.split(" ").length;
        System.out.println(count);


        // 「配列内のすべての要素を表示（配列状態で表示）」
        System.out.println(Arrays.toString(team_array));


        // 「おみくじを作ろう」
        String line = "大吉,中吉,吉,凶";
        String[] omikuji = line.split(",");
        int i = omikuji.length;
        // 配列の要素をランダムに選ぶ
        double rand = Math.random() * i;
        int num = (int)rand;
        // ランダムに選んだ配列の要素を出力
        System.out.println(omikuji[num]);


        // 「じゃんけんプログラムを作ろう」
        String lines = "グー,チョキ,パー";
        // カンマで分割して、配列に代入
        String[] array = lines.split(",");
        // 配列の要素をランダムに選ぶ
        int i_1 = array.length;
        double rand_1 = Math.random() * i_1;
        int num_1 = (int)rand_1;
        // ランダムに選んだ配列の要素を出力
        System.out.println(array[num_1]);

    }
    
}
