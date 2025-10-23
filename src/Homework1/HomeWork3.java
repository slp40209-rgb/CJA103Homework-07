package Homework1;

import java.util.Scanner;
import java.util.Random;
public class HomeWork3 {
	//	請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形,如圖示結果:
//	(提示:Scanner,三角形成立條件,判斷式if else)
//	(進階功能:加入直角三角形的判斷)
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入第一個數字:");
		int a = sc.nextInt();
		
		System.out.print("請輸入第二個數字:");
		int b = sc.nextInt();
		
		System.out.print("請輸入第三個數字");
		int c = sc.nextInt();
		
		if (a + b > c && a + c > b && b + c > a) {
			if (a == b && b == c) {
				System.out.print("這是正三角形");
			}
				if (a == b || b == c) {
					System.out.print("這是等腰三角形");
				}
				
				else {
					System.out.print("不是三角形");
				}
				
				sc.close();
		}
		
		
	}
	
	
//	
//	請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//	對則顯示正確訊息,如圖示結果:
	 public static void NUM(String[] args) {
		 int number = (int)(Math.random()*10)+1;
		 Scanner sc2 = new Scanner(System.in);
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
	            sc2.close();
	            }
		 
	 }
//	阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//	厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數,
	@SuppressWarnings("resource")
	public static void sum(String args[]) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("阿文請輸入你討厭的數字(1~9):");
		int hate = sc1.nextInt(4);
		if (hate < 1|| hate>9) {
			System.out.print("請輸入1~9的數字。");
			return;
		}
		int count =1;
    	for(int g= 1; g<= 49; g++) {
    		
    		String hateStr =String.valueOf(hate);
    		if (!String.valueOf(g).contains(hateStr)) {
                System.out.printf("%2d ", g);
                count++;
    	}
    	}System.out.println("\n總共有 " + count + " 個號碼可以選。");
		
    	sc1.close();
		
	}
}
