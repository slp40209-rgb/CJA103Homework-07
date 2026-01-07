package HomeWork9;

public class Mom extends Thread {
    private Account account;

    public Mom(Account account) {
        this.account = account;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            account.deposit(2000);
        }
    }
}
