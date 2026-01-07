package HomeWork10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        
        while (true) {
            System.out.print("請輸入一個任意數：");
            input = sc.next();

            
            if (!input.matches("^-?\\d+(\\.\\d+)?$")) {
                System.out.println("數字格式不正確，請重新輸入！");
                continue; 
            }

            double num = Double.parseDouble(input);

            System.out.println("請選擇要顯示的表示方法：");
            System.out.println("(1) 千分位 (2) 百分比 (3) 科學記號");
            
            
            if (!sc.hasNextInt()) {
                System.out.println("選項格式不正確，請重新開始！");
                sc.next(); 
                continue;
            }
            
            int choice = sc.nextInt();
            DecimalFormat df;

            if (choice == 1) {
                df = new DecimalFormat("#,###.###");
                System.out.println("千分位表示為：" + df.format(num));
                break; 
            } else if (choice == 2) {
                df = new DecimalFormat("#%");
                System.out.println("百分比表示為：" + df.format(num));
                break; 
            } else if (choice == 3) {
                df = new DecimalFormat("0.###E0");
                System.out.println("科學記號表示為：" + df.format(num));
                break; 
            } else {
                System.out.println("無此選項，請重新輸入數字與選擇！");
                
            }
        }
        
        System.out.println("程式結束。");
        sc.close();
    }
}
