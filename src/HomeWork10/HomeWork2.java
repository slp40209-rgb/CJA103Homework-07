package HomeWork10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        // 使用 while(true) 建立無窮迴圈，直到輸入正確並執行完畢才 break
        while (true) {
            System.out.print("請輸入一個任意數：");
            input = sc.next();

            // 1. 驗證是否為數字
            if (!input.matches("^-?\\d+(\\.\\d+)?$")) {
                System.out.println("數字格式不正確，請重新輸入！");
                continue; // 跳過本次迴圈，回到開頭讓使用者重新輸入
            }

            double num = Double.parseDouble(input);

            System.out.println("請選擇要顯示的表示方法：");
            System.out.println("(1) 千分位 (2) 百分比 (3) 科學記號");
            
            // 處理選擇選項的防呆
            if (!sc.hasNextInt()) {
                System.out.println("選項格式不正確，請重新開始！");
                sc.next(); // 清除掉錯誤的輸入
                continue;
            }
            
            int choice = sc.nextInt();
            DecimalFormat df;

            if (choice == 1) {
                df = new DecimalFormat("#,###.###");
                System.out.println("千分位表示為：" + df.format(num));
                break; // 成功執行，跳出迴圈結束程式
            } else if (choice == 2) {
                df = new DecimalFormat("#%");
                System.out.println("百分比表示為：" + df.format(num));
                break; // 成功執行，跳出迴圈結束程式
            } else if (choice == 3) {
                df = new DecimalFormat("0.###E0");
                System.out.println("科學記號表示為：" + df.format(num));
                break; // 成功執行，跳出迴圈結束程式
            } else {
                System.out.println("無此選項，請重新輸入數字與選擇！");
                // 不 break，會回到迴圈開頭
            }
        }
        
        System.out.println("程式結束。");
        sc.close();
    }
}
