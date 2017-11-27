import java.util.*;

public class BankAccount {
	private String accountNumber;
	private Double checkingBalance = 0.00;
	private Double savingsBalance = 0.00;
	
	public static int numberOfAccounts = 0;
	public static Double totalMoneys = 0.00;
	
	public BankAccount() {
		this.accountNumber = setAccountNumber();
		numberOfAccounts++;
	}
	
	private String setAccountNumber() {
		String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z", "1","2","3","4","5","6","7","8","9","0"};
        ArrayList<String> alphaAsList = new ArrayList<String>(Arrays.asList(alpha));
        Random rand = new Random();
        String acctNum = "";
        for(int i = 0; i<10; i++){
            acctNum = acctNum.concat(alphaAsList.get(rand.nextInt(alphaAsList.size())));
        }
        System.out.println(acctNum);
        return acctNum;
	}
	
	public Double getCheckingBalance() {
		return this.checkingBalance;
	}
	
	public Double getSavingsBalance() {
		return this.savingsBalance;
	}
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	public void deposit(String accountType, double value) {
		if( accountType == "checking") {
			this.checkingBalance += value;
			totalMoneys += value;
		}
		else if(accountType == "savings") {
			this.savingsBalance += value;
			totalMoneys += value;
		}
	}
	
	
	public void withdraw(String accountType, double value) {
		if( accountType == "checking") {
			if(this.checkingBalance >= value) {
				this.checkingBalance -= value;
				totalMoneys -= value;
			}
			System.out.println("Insufficient Funds");
		}
		else if (accountType == "savings") {
			if(this.savingsBalance >= value) {
				this.savingsBalance -= value;
				totalMoneys -= value;
			}
		}
	}
	
	public Double totalBalance() {
		Double total = this.checkingBalance + this.savingsBalance;
		return total;
	}
	
}
