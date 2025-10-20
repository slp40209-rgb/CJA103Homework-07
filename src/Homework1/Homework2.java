package Homework1;

public class Homework2 {
	public static  void main(String[] args) {
		//請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
		
		for(int i = 0; i <= 1000; i++)
		if(i % 2 == 0) {
			System.out.print(i+ " ");
		}
		    System.out.println("\n");
		// 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		int a = 1;  
		
        for (int count = 1; count <= 10; count++) {
        	a*=count;
        	
        }
        System.out.println(a);
        //請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
        
         int sum = 1;
        int t = 1;//還是要設定初始值
        while ( t <= 10) {
            sum *= t;
             t++;
	}       
        System.out.println(sum);
	
        //請設計一隻Java程式，輸出結果為以下:1 4 9 16 25 36 49 64 81 100
        
        for(int i = 1; i <= 10; i++){
        	
        	System.out.print(i*i);
        	if(i<10) {
        		System.out.print(" ");
        		
        	}System.out.print(" ");
        }
        	
        	//       	阿文很熱衷大樂透(1 ～49)，但他不喜歡有4的數字，不論是個位數或是十位數。
  //      	請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個
        	int count = 0 ;
        	for(int g= 1; g<= 49; g++) {
        		
        		int c= g/10;
        		int e= g%10;
        		if(c !=4 && e !=4) {
        			 System.out.print(g + " ");
                     count++;
                     
                    
        		}
        		
        		
        		
        	} System.out.println("\n總共有 " + count + " 個可以選擇的數字。");
        
        	
//        請設計一隻Java程式，輸出結果為以下：
//        1 2 3 4 5 6 7 8 9 10
//         1 2 3 4 5 6 7 8 9
//         1 2 3 4 5 6 7 8
//         1 2 3 4 5 6 7
//         1 2 3 4 5 6 
//        1 2 3 4 5
//         1 2 3 4 
//        1 2 3 
//        1 2 
//        1
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }System.out.println();
        }
			    
        
        //請設計一隻Java程式，輸出結果為以下
//        A
//        BB
//        CCC
//        DDDD
//        EEEEE
//        FFFFFF
        
        for (int i= 1; i <= 5; i++) {
        	char letter = (char)('A' + i - 1);//char是把數字轉成英文(用在編碼表裡)//i-1(是為了對照編碼表裡的'b'，'c'等等)
			for (int j= 1; j <= i; j++) {
				
				System.out.print(letter);/*不能加ln會變隔行*/
			}
			    System.out.println();
        		
        }
        	}
        		
        		        
        	
        	
        		
	
	}
