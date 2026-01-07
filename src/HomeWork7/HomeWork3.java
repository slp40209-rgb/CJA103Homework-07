package HomeWork7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HomeWork3 {

//	請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用
//			append功能讓每次執行結果都能被保存起來)
	public static void main(String[] args) {
        
        String fileName = "Data.txt";

        
        
        try (FileWriter fw = new FileWriter(fileName, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(bw)) {

            System.out.println("開始產生亂數並寫入檔案...");

            
            for (int i = 0; i < 10; i++) {
                int randomNum = (int) (Math.random() * 1000) + 1;
                pw.println(randomNum); 
            }

            System.out.println("寫入完畢！請檢查 " + fileName);

        } catch (IOException e) {
            System.err.println("寫入檔案時發生錯誤：" + e.getMessage());
        }
    }
}
