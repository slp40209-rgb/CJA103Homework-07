package Homework1;

public class Homework {

	public static void main(String[] args) {
		//請設計一隻Java程式,計算12,6這兩個數值的和與積
		int num1 = 6 , num2 = 12;
		System.out.println(num1 + num2);
		System.out.println(num1 * num2);
		//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int egg = 200 , dozen = 12;
		
		System.out.println("共"+ egg/dozen +"打" +egg % dozen +"顆");
		//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		
	    int X=256559,  minute =60, Hour =60*60, day = 24*60*60, z= X%(24*60*60);
		System.out.println(X/day);
		System.out.println(X/Hour);
		System.out.println((X-2*day-23*Hour)/minute);
		System.out.println((X/day)+ "天" +  (X/Hour-24*(X/day)) + "小時" +((X-2*day-23*Hour)/minute) + "分" +(minute-1) +"秒");
		//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI=3.1415,I = 5;
		System.out.println("圓面積="+ I*I*PI);
		System.out.println("圓周長="+ I*2*PI);
		//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
		double r= 0.02,a= 10,b= 1500000, c =1+r;
		double d = b*Math.pow(c,a);
		System.out.println("年金+利息共有"+ d);
		//請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
		System.out.println(5+5);//兩個都是整數，所以執行的是數值加分，直接加總得10
		System.out.println(5+'5');//'5'由於5在單引號裡面，所以是字元常數，可以去參照unicode編碼表裏面去對照，由於'5'在編碼表裡面呈現的是53的數字，所以相加會是58
		System.out.println(5+"5");//"5"由於5是在雙引號裡面，雙引號代表的是字串，然後字串遇到加號，讓加號代表的是串接功能，所以5+"5"會是直接顯示出來的串接數字=55
		
		
		
		
		
		
		
		
	}
}
