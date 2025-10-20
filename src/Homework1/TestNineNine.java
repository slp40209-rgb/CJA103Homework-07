package Homework1;

public class TestNineNine {

	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 9; i++) {
			int j = 1;
			while(j<=9) {
			System.out.print(i + "*" + j + "=" + i * j + "\t");
			j++;
			
			System.out.print("");
	}System.out.println();
	
	
		}
		System.out.println("--------");
		//for迴圈+do while迴圈
		for (i = 1; i <= 9; i++) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
		      j++;
		      System.out.print("");
		  } while ( j <= 9);
			System.out.println();
		}
		System.out.println("--------");
		i = 1;
		//while迴圈，do while 迴圈
		while(i <= 9){
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
		      j++;
		      System.out.print("");
		  } while ( j <= 9);
			System.out.println();
			i++;
		}
		
	}
}

		

	
      
	

	
