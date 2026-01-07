package HomeWork5;

public class HomeWork2 {

//	請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
//	本次亂數結果:
	public static void randAvg() {
		int sum = 0;
		
		System.out.println("本次亂數結果: ");
		
		
		
		for (int i = 1; i <= 10; i++) {
			
			int num = (int)(Math.random() * 101);
			sum += num;
            System.out.print(num);
            if (i < 10) System.out.print(", ");
        }
		double avg = sum / 10.0;
        System.out.printf("%n平均值: %.2f%n", avg);
    }

    public static void main(String[] args) {
        randAvg();
    }
		}
	

