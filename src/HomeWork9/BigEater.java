package HomeWork9;

class BigEater implements Runnable {

	
	
	    private String name;

	    public BigEater(String name) {
	        this.name = name;
	    }

	    @Override
	    public void run() {
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(name + " 吃第 " + i + " 個饅頭");
	            
	            // 隨機產生 500 ~ 3000 毫秒
	            int sleepTime = (int) (Math.random() * 2501) + 500;
	            
	            try {
	                Thread.sleep(sleepTime);
	            } catch (InterruptedException e) {
	                // 當執行緒被中斷時的處理
	                e.printStackTrace();
	            }
	        }
	        System.out.println(name + " 吃完了！");
	    }
	}

