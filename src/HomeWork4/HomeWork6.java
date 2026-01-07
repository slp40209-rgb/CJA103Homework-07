package HomeWork4;

public class HomeWork6 {

//	班上有8位同學,他們進行了6次考試結果如下:
//			        1號   2號   3號    4號   5號   6號   7號   8號
//			1考	    10	  35    40   100    90    85    75    70
//			2考		37	  75    77    89    64    75    70    95
//			3考	   100	  70    79    90    75    70    79    90
//			4考		77	  95    70    89    60    75    85    89
//			5考		98	  70    89    90    75    90    89    90
//			6考		90	  80   100    75    50    20    99    75
//		請算出每位同學考最高分的次數(指全班最高分)
//		(提示:二維陣列)
//	
	public static void main(String[] args) {
		int[][] scores = {
	            {10, 35, 40, 100, 90, 85, 75, 70},   
	            {37, 75, 77, 89, 64, 75, 70, 95},    
	            {100, 70, 79, 90, 75, 70, 79, 90},   
	            {77, 95, 70, 89, 60, 75, 85, 89},    
	            {98, 70, 89, 90, 75, 90, 89, 90},    
	            {90, 80, 100, 75, 50, 20, 99, 75}    
	        };
		int ex = scores.length;
		int students = scores[0].length;
		int[] top = new int[students];
		for (int i = 0; i < ex; i++) {
			int maxScore = -1;
			
			for (int j = 0; j < students; j++) {
                if (scores[i][j] > maxScore) {
                    maxScore = scores[i][j];
		}

	}
			 for (int j = 0; j < students; j++) {
				 if (scores[i][j] == maxScore) {
					 top[j]++;
				 }
			 }
			 
		}
		for (int i = 0; i < students; i++) {
            System.out.println("同學 " + (i + 1) + " 拿到最高分次數: " + top[i]);
        }
	}
	
	
}
