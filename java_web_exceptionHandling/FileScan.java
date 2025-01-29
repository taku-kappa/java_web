// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.Scanner;
import java.io.*;
import java.util.*;

public class FileScan {
    // 「0から99までファイルに書き込む」
    public static void main(String[] args) throws IOException {

        File file = new File("articles.txt");

        // ファイル書き込み
        FileWriter filewriter = new FileWriter(file);
        // ここに、0から99まで1行ずつ書き込むコードを記述する
        for (int i = 0; i <= 99; i++) {
            filewriter.write(i + "\n");
        } 


        filewriter.close();

        // ファイル読み込み
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            System.out.println(line);
        }
        scan.close();
    }
    
}
