public class Map {
    public static void main(String[] args) {
        
        // 「模様を出力してみよう」
        // String[][] areaMap = new String[5][10];

        // for (int i = 0; i < areaMap.length; i++) {
        //     for (int j = 0; j < areaMap[i].length; j++) {
        //         if (i % 2 == 0 && j % 2 == 0) {
        //             areaMap[i][j] = "+";
        //         } else {
        //             areaMap[i][j] = ".";
        //         }
                
        //         System.out.print(areaMap[i][j]);
        //     }
        //     System.out.println("");
        // }


        // 「2次元配列で画像を表示する」
        //画像URL用の配列
        String[] playerImages = {
            "https://paiza-webapp.s3.amazonaws.com/files/learning/rpg/Empty.png",
            "https://paiza-webapp.s3.amazonaws.com/files/learning/rpg/Dragon.png",
            "https://paiza-webapp.s3.amazonaws.com/files/learning/rpg/Crystal.png",
            "https://paiza-webapp.s3.amazonaws.com/files/learning/rpg/Hero.png",
            "https://paiza-webapp.s3.amazonaws.com/files/learning/rpg/Heroine.png"};

        //キャラクター配置用の配列
        int[][] characterMap = {{1,1,1,1,1},
                                {2,3,3,3,2},
                                {2,4,4,4,2}};

        System.out.println("<table>");
        for (int[] line: characterMap) {
            System.out.println("<tr>");
            for (int imageId: line) {
                System.out.print("<td><img src ='" + playerImages[imageId] + "'></td>");
            }
            System.out.println("</tr>");
        }
        System.out.println("</table>");
    }
    
}
