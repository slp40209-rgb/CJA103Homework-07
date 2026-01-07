package HomeWork9;

public class HomeWork1 {

//	開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//	競賽過程。
//	• 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//	Sleep時間由亂數產生500~3000之間的毫秒數,如圖所示
//	• 參考範例:CounterRunnable.java
//	• 需留意主執行緒執行順序
	
	

	// 2. 主程式類別
	
	    public static void main(String[] args) {
	        System.out.println("----- 大胃王比賽開始 -----");

	        // 建立兩個 Runnable 實作物件
	        BigEater man = new BigEater("饅頭人");
	        BigEater james = new BigEater("詹姆士");

	        // 建立執行緒並啟動
	        Thread t1 = new Thread(man);
	        Thread t2 = new Thread(james);

	        t1.start();
	        t2.start();

	        // 留意主執行緒順序：確保主執行緒等到兩位參賽者都吃完
	        try {
	            t1.join();
	            t2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("----- 比賽結束！ -----");
	    }
	}


