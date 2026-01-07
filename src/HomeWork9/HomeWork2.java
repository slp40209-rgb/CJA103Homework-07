package HomeWork9;

public class HomeWork2 {

	public static void main(String[] args) {
        Account account = new Account();
        Mom mom = new Mom(account);
        Son son = new Son(account);

        mom.start();
        son.start();
    }
}
