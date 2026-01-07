package HomeWork4;

import java.util.Scanner;

public class HomeWork5 {

//	請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//	例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//
//	(提示1:Scanner,陣列)
//	(提示2:需將閏年條件加入)
//	(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
	public static void main(String args[]) {
		Scanner sc3 = new Scanner(System.in);
		System.out.print("請輸入年月日： ");
		int year = sc3.nextInt();   
        int month = sc3.nextInt();  
        int day = sc3.nextInt();
        boolean t = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int[] d = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(t) {
            d[1] = 29;
        } if(month < 1 || month > 12) {
                System.out.println("錯誤: 月份應該在 1~12 之間");
                sc3.close();
                return;
            }
        if(day < 1 || day > d[month-1]) {
            System.out.println("錯誤: 該月份沒有 " + day + " 號");
            sc3.close();
            return;
        }int y = 0;
        for(int i = 0; i < month - 1; i++) {
             y+= d[i];
        }y += day;

        System.out.println("輸入的日期為該年第 " + y + " 天");

        sc3.close();
    }
        
        
	
	
	
	
//	班上有8位同學,他們進行了6次考試結果如下:
//
//		請算出每位同學考最高分的次數(指全班最高分)
//		(提示:二維陣列)
//	
}
