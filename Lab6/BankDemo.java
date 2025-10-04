package lab06;

	import java.util.InputMismatchException; 
	import java.util.Scanner; 

	public class BankDemo {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	 Scanner scanner = new Scanner(System.in);
	 Account account = new Account("Ayush",135000,9000.0);
	 while (true) {
		 System.out.println("Banking System Menu");
		 System.out.println("1 Deposit");
		 System.out.println("2 Withdraw");
		 System.out.println("3 Show Balance");
		 System.out.println("4 Exit");
		 System.out.print("Choose an option: ");
		 try {
		 int choice = scanner.nextInt();
		 switch (choice) {
		 case 1:
		 System.out.print("Enter amount to deposit: ");
		 double depositAmount = scanner.nextDouble();
		 account.deposit(depositAmount);
		 break;
		 case 2:
		 System.out.print("Enter amount to withdraw: ");
		 double withdrawAmount = scanner.nextDouble();
		 account.withdraw(withdrawAmount);
		 break;
		 case 3:
		System.out.println("Balane:");
		 account.showBalance();
		 break;
		 case 4:
			 System.out.println("Exit");
			 scanner.close();
			 return;
			 default:
			 System.out.println("Invalid choice. Try again.");
			 }
			 } catch (InputMismatchException e) {
			 System.out.println("Invalid input! Please enter numbers only.");
			 scanner.nextLine(); // clear the buffer
			 } catch (ArithmeticException e) {
			 System.out.println("Error:" + e.getMessage());
			 } catch (InsufficientBalanceException e) {
			 System.out.println("Error:" + e.getMessage());
			 }
			 }
			 }
			}
	 

			 	 	      
