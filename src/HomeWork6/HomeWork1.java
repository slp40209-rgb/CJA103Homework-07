package HomeWork6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork1 {

//	請設計三個類別Calculator.java,CalException.java與CalTest.java,在Calculator.java裡有個自訂
//	方法為powerXY(int x, int y),功能是會計算x的y次方並回傳結果。 CalTest.java執行後,使用者可
//	以輸入x與y的值,請加入例外處理機制,讓程式能解決以下狀況:
//	1. x與y同時為0,(產生自訂的CalException例外物件)
//	2. y為負值,而導致x的y次方結果不為整數
//	3. x與y皆正確情況下,會顯示運算後結果
	
	
//	請輸入x的值：0			請輸入x的值：2				請輸入x的值：abc
//	請輸入y的值：0			請輸入y的值：-1				輸入格式不正確
//	0的0次方沒有意義！		次方為負值，結果回傳不為整數！	請輸入x的值：2
//	請輸入x的值：2			請輸入x的值：2				請輸入y的值：4
//	請輸入y的值：4			請輸入y的值：4				2的4次方等於16
//	2的4次方等於16			2的4次方等於16
	
	
	

	
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        while (true) {
            try {
                System.out.println("請輸入x的值：");
                int x = sc.nextInt();

                System.out.println("請輸入y的值：");
                int y = sc.nextInt();

                cal.powerXY(x, y);
                break; 

            } catch (CalException e) {
                // 捕捉自訂例外 (0,0 或 負次方)
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                
                System.out.println("輸入格式不正確");
                sc.next(); 
            }
        }
        sc.close();
    }
}

