
public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount();
		System.out.println(b.getAccountNumber());
		b.deposit("checking", 1000);
		b.deposit("checking", 500);
		System.out.println(b.getCheckingBalance());
		b.deposit("savings", 10);
		b.deposit("savings", 5);
		System.out.println(b.getSavingsBalance());
		System.out.println(b.totalBalance());
	}

}
