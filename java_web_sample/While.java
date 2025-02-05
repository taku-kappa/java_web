public class While {
    public static void main(String[] args) {
        // 「「ハロー、paizaラーニング」と10回表示する」
        int i = 1;
        while (i <= 10) {
            System.out.println("ハローpaizaラーニング");
            i = i += 1;

        }

        // 「数値を0から15まで表示する」
        int a = 0;
        while(a <= 15) {
            System.out.println(a);
            a += 1;
        }

        // 「1から10までの偶数を表示する」
        int even = 1;
        while(even <= 10) {
            if (even % 2 == 0) {
                System.out.println(even);
            } 
            even += 1;
        }

        // 「数値を10から1までカウントダウン表示する」
        int down = 10;
        while(down >= 1) {
            System.out.println(down);
            down -= 1;
        }

        // 「数値を20から10までカウントダウン表示する」
        int downs = 20;
        while(downs >= 10) {
            System.out.println(downs);
            downs -= 1;
        }

        // 「数値を20から10までの奇数を表示する」
        int downOdd = 20;
        while(downOdd >= 10) {
            if (downOdd % 2 == 1) {
                System.out.println(downOdd);
            } 
            downOdd -= 1;
        }
        
    }
    
}
