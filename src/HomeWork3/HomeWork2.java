package HomeWork3;

import java.util.Scanner;

public class HomeWork2 {

//	請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//	對則顯示正確訊息,如圖示結果:
	  
	public static void main(String[] args) {
		 Scanner sc2 = new Scanner(System.in);
		 int number = (int)(Math.random()*10)+1;
		 int guess = -1;
		 System.out.println("開始猜數字吧！");
		 while (true) {
			 
	            System.out.print("請輸入你的猜測：");
	            if (sc2.hasNextInt()) {
	            	 guess = sc2.nextInt();
	            if (number < 0 || number > 9) {
	                 System.out.println("請輸入0到9之間的數字！");
	                 continue;
	               
	            }
	            
         
		 if (guess == number) {
             System.out.println("恭喜你猜對了！答案是 " + number);
             break;
		 }
		 else {
             System.out.println("猜錯了，請再試一次！");
         }
		 
	   } else {
			    System.out.println("請輸入有效的整數！");
			    sc2.next();
		 }
	            
	            }sc2.close();
		 
	 } 
}
