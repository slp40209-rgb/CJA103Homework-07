package HomeWork9;

public class Account {

	
	    private int balance = 0; // 帳戶餘額

	    // 匯款方法 (媽媽使用)
	    public synchronized void deposit(int amount) {
	        // 如果餘額超過 3000，媽媽停止匯款並進入等待
	        while (balance > 3000) {
	            System.out.println("媽媽看到餘額在3000以上，暫停匯款 ");
	            System.out.println("熊大被老媽告知帳戶已經有錢");
	            
	            try {
	                wait();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        
	        balance += amount;
	        System.out.println("媽媽存入 " + amount + "，帳戶餘額：" + balance);
	        // 匯款後，通知正在等待提款的熊大
	        notifyAll();
	    }

	    // 提款方法 (熊大使用)
	    public synchronized void withdraw(int amount) {
	        // 如果餘額不足以支付提款金額，熊大進入等待
	        while (balance < amount) {
	            System.out.println("熊大看到帳戶沒錢，暫停提款 ");
	            System.out.println("媽媽被熊大要求匯款");
	            try {
	                wait();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	        balance -= amount;
	        System.out.println("熊大領了 " + amount + "，帳戶餘額：" + balance);

	        // 如果餘額低於 2000，通知媽媽該匯款了
	        if (balance <= 2000) {
	            System.out.println("熊大看到餘額低於2000，要求匯款");
	            notifyAll();
	        }
	    }
	}

