public class For {
    public static void main(String[] args) {

        // 「「ハロー、paizaラーニング」を10回表示する」
        int i = 1;
        for (i = 1; i <= 10; i += 1) {
            System.out.println("ハローpaizaラーニング");
        } 

        // 「数値を0から15まで表示する」
        int up;
        for (up = 0; up <= 15; up += 1) {
            System.out.println(up);
        }

        // 「1月から12月まで表示する」
        int month;
        for (month = 1; month <= 12; month++) {
            System.out.println(month + "月");
        }

        // 「HTMLの箇条書き表示」
        System.out.println("<ul>");
        for (int pulDown = 1; pulDown <= 100; pulDown++) {
            System.out.println("<li>" + pulDown + "</li>");
        } 
        System.out.println("</ul>");

        // 「西暦年と昭和年の対応表を作ろう」
        int seireki = 0, shouwa = 0;
        
        for (seireki = 1926; seireki <= 1988; seireki++) {
            System.out.print("西暦" + seireki + "年は");
            shouwa = seireki - 1925;
            System.out.println("昭和" + shouwa + "年です");
        } 
    }
    
}
