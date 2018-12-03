public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount AcctEddy = new BankAccount("Eddy", 475.00, 5.00);
				
		AcctEddy.withdraw(500); // transaction denied
		
		AcctEddy.withdraw(150);
		System.out.println(AcctEddy);
		
		AcctEddy.deposit(400);
		System.out.println(AcctEddy);	
	}

}