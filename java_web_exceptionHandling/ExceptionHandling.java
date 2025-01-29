import java.io.*;
import java.util.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        // 「例外処理を定義しよう」
        String[] enemies = {"スライム", "ドラゴン", "魔王" };

        int number = 3;
        try {
            System.out.println("勇者は敵に遭遇した");
            System.out.println("勇者は" + enemies[number] + "と戦った");
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("勇者は勝利した");
        }


        // 「例外メッセージを指定しよう」
        try {
            System.out.println("勇者は敵に遭遇した");
            System.out.println("勇者は" + enemies[number] + "と戦った");
        } catch (Exception e) {
            System.err.println("その敵は表示できません");
        } finally {
            System.out.println("勇者は勝利した");
        }


        // 「例外の種類を変更しよう」
        try {
            System.out.println("勇者は敵に遭遇した");
            System.out.println("勇者は" + enemies[number] + "と戦った");
        } catch (NumberFormatException e) {
            System.err.println("文字列を数値に変換できません。");
        } catch (ArithmeticException e) {
            System.err.println("その数値では、表示できません。");
        } catch (Exception e) {
            System.err.println("例外を捕捉しました。");
        } finally {
            System.out.println("勇者は勝利した");
        }


        // 「間違い探し（強制エラー）」
        System.out.println("Hello World");

        try {
            int answer = 100 / 0;
            System.out.println(answer);
            throw new ArithmeticException("強制エラー");
        } catch (ArithmeticException e) {
            System.err.println("0では割り算できません");
        } catch (Exception e) {
            System.err.println("例外が発生しました");
        } finally {
            System.out.println("Hello Java");
        }


        // 「0から99までファイルに書き込む」
        File file = new File("articles.txt");

        // ファイル書き込み
        try (FileWriter filewriter = new FileWriter(file)) {
            for (int i = 0; i < 100; i++){
                filewriter.write(i + "\n");
            }
        } catch (IOException e) {
            System.err.println("ファイル書き込みに失敗しました");
            e.printStackTrace();
        }

        // ファイル読み込み
        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("ファイル読み込みに失敗しました");
            e.printStackTrace();
        }
    
    }
    
}
