import java.util.HashMap;
import java.util.Map.Entry;

public class RensouHairetu {
    public static void main(String[] args) {

        // 「ループでマップの値を出力しよう」
        HashMap<String, Integer> skills = new HashMap<String, Integer>();
        skills.put("攻撃力", 150);
        skills.put("防御力", 100);
        skills.put("魔法力", 200);
        skills.put("移動力", 380);

        for (Entry<String, Integer> entry : skills.entrySet()) {
            System.out.println(entry.getValue());
        } 


        // 「ループでマップのキーと値を出力しよう」
        for (Entry<String, Integer> entry : skills.entrySet()) {
            System.out.print(entry.getKey() + "は");
            System.out.println(entry.getValue() + "です");
        } 


        // 「ループで合計を計算しよう」
        HashMap<String, Integer> points = new HashMap<String, Integer>();
        points.put("国語", 51);
        points.put("算数", 35);
        points.put("英語", 52);
        points.put("理科", 19);
        
        int total = 0;

        for(Entry<String, Integer> entry : points.entrySet()) {
            total += entry.getValue();
        }
        
        System.out.println(total);
    }
    
}
