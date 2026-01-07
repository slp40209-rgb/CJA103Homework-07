package HomeWork3;

import java.util.Scanner;

public class HomeWork1 {

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

}
