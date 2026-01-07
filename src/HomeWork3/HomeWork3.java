package HomeWork3;

import java.util.Scanner;
import java.util.Random;
public class HomeWork3 {
	
//	阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//	厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數,
	@SuppressWarnings("resource")
	public static void main(String args[]) {
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
