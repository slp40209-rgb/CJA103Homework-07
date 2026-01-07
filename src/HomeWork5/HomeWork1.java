package HomeWork5;

import java.util.Scanner;

public class HomeWork1 {

//	請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如
//	圖:請輸入寬高
//		54
//		*****
//		*****
//		*****
//		*****
	public static void starSquare(int width, int height) {
		 for (int i = 0; i < height; i++) {
			 for (int j = 0; j < width; j++) {
				 System.out.print("*");
			 }System.out.println();
		 }
		 
			 
		 
	}

	public static void main(String[] args) {
		Scanner s4 = new Scanner(System.in);
		
		System.out.print("請輸入寬度：");
        int width = s4.nextInt();

        System.out.print("請輸入高度：");
        int height = s4.nextInt();

       
        System.out.println("輸出的星號長方形：");
        starSquare(width, height);

        s4.close();
		
	}
	


}
