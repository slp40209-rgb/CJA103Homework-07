package HomeWork9;

public class  Son extends Thread {
    private Account account;

    public Son(Account account) {
        this.account = account;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            account.withdraw(1000);
        }
    }
}
