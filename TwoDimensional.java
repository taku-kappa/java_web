import java.util.*;
public class TwoDimensional {
    public static void main(String[] args) {
        
        // 「2次元配列を作成してみよう」
        String[] item1 = {"木の棒", "こん棒"};
        String[] item2 = {"おにぎり", "おにぎり"};
        String[] item3 = {"毒消し", "薬草"};

        // item1 ~ 3を、basket配列に代入してください。
        String[][] basket = {item1, item2, item3};

        System.out.println(basket[0][0]);
        System.out.println(basket[0][1]);
        System.out.println(basket[1][0]);
        System.out.println(basket[1][1]);
        System.out.println(basket[2][0]);
        System.out.println(basket[2][1]);


        // 「2次元配列の全体出力方法」
        System.out.println(Arrays.deepToString(basket));


        // 「配列の中身を出力してみよう」
        String[][] array = {{"勇者", "忍者"}, {"武士", "戦士"}, {"僧侶", "魔法使い"}};

        // この下で、arrayの全ての要素を出力してみよう
        // System.out.println(array[0][0]);
        for (int i = 0; i <= 2; i++) {
            for (int q = 0; q <= 1; q++) {
                System.out.println(array[i][q]);
            } 
        } 


        // basket[1].length;
        String[][] baskets = {{"木の棒", "こん棒"}, {"おにぎり", "おにぎり"}, {"毒消し", "薬草"}};

        // ここに、要素を更新するコードを記述する
        baskets[0][1] = "石斧";


        System.out.println(baskets[0][0]);
        System.out.println(baskets[0][1]);
        System.out.println(baskets[1][0]);
        System.out.println(baskets[1][1]);
        System.out.println(baskets[2][0]);
        System.out.println(baskets[2][1]);


        // 「2次元配列の要素の個数を出力する」
        System.out.println(baskets[1].length);


        // 「ループで2次元配列を出力してみよう」
        String[][] arrays = {{"勇者", "忍者"}, {"武士", "戦士"}, {"僧侶", "魔法使い"}};

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.println(arrays[i][j]);
            } 
        } 


        // 「拡張forで2次元配列を出力してみよう」
        for (String[] team : arrays) {
            for (String player : team) {
                // この下で、arrayの要素を出力してみよう
                System.out.println(player);

            }
        }


        // 「2次元配列をnewで作成しよう」
        int[][] ar = new int[2][3];

        for (int[] item : ar) {
            for (int num : item) {
                System.out.print(num);
            }
            System.out.println("");
        }


        // 「2次元配列の初期値を指定しよう」
        int[][] ars = new int[2][3];

        for (int i = 0; i < ars.length; i++) {
            for (int j = 0;  j < ars[i].length; j++) {
                //この下で、初期値を指定する
                ars[i][j] = 1;

                System.out.print(ars[i][j]);
            }
            System.out.println("");
        }


        // 「ドットで文字を出力しよう」
        int[][] letterA =
            {{0,0,1,1,0,0},
             {0,1,0,0,1,0},
             {1,0,0,0,0,1},
             {1,1,1,1,1,1},
             {1,0,0,0,0,1},
             {1,0,0,0,0,1}};

        // ここに、ドットを表示するコードを記述する
        for (int[] n : letterA) {
            for (int a : n) {
                if (a == 1) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            } 
            System.out.println("");
        } 


        // 「模様を出力してみよう」
        String[][] areaMap = new String[5][10];
        // この下で、2次元配列の初期値を設定する
        areaMap[0][0] = "+";
        areaMap[0][9] = "+";
        areaMap[4][0] = "+";
        areaMap[4][9] = "+";

        for (int p = 0; p < areaMap.length; p++) {
            for (int l = 0; l < areaMap[p].length; l++) {
                if (areaMap[p][l] == null) {
                    areaMap[p][l] = ".";
                }
                System.out.print(areaMap[p][l]);
            }
            System.out.println("");
        }

    }
    
}
