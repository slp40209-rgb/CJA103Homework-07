package HomeWork5;

public class Work3 {

	


//		利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//		可以找出二維陣列的最大值並回傳,如圖:
//		int[][] inArray = {
//				{1, 6, 3},
//				{9, 5, 2}
//		};
//		double[][] doubleArray = {
//				{1.2, 3.5, 2.2},
//				{7.4, 2.1, 8.4}
//		};
//		Work03 w = new Work03();
//		System.out.println(w.maxElement(inArray));
//		System.out.println(w.maxElement(doubleArray));
		
		
		 int maxElement(int a[][]) {
			int max = a[0][0];
			for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a[i].length; j++) {
	                if (a[i][j] > max) {
	                    max = a[i][j];
	                    
		}
	            }
			}return max;
	}
		 
		 double maxElement(double x[][]) {
		        double max = x[0][0];
		        for (int i = 0; i < x.length; i++) {
		            for (int j = 0; j < x[i].length; j++) {
		                if (x[i][j] > max) {
		                    max = x[i][j];
		                }
		            }
		        }
		        return max;
	}
		 
		 
		 public static  void main(String[] args) {
		        int[][] inArray = {
		            {1, 6, 3},
		            {9, 5, 2}
		        };

		        double[][] doubleArray = {
		            {1.2, 3.5, 2.2},
		            {7.4, 2.1, 8.4}
		        };

		        Work3 w = new Work3();
		        System.out.println(w.maxElement(inArray));    // 輸出: 9
		        System.out.println(w.maxElement(doubleArray)); // 輸出: 8.4
		    }
	}


