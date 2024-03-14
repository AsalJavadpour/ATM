package Bank;
import java.util.Scanner;
import java.util.Date;
public class ATM {
int balance;
int prevTransaction;
String customerName;
String customerID;

ATM(String cname,String cid){
	customerName=cname;
	customerID=cid;
}
void deposit(int amount) {
	if(amount!=0 && amount>0) {
		balance=balance+amount;
		prevTransaction=amount;
	}
}
void withdraw(int amount) {
	if(amount!=0) {
		balance=balance-amount;
		prevTransaction=-amount;
	}
}
void getPrevTransaction() {
	if(prevTransaction>0) {
		System.out.println("Deposited: " + prevTransaction);
	}else if(prevTransaction<0) {
		System.out.println("Withdrawn: " + Math.abs(prevTransaction));
	}else {
		System.out.println("No Transaction Occured!");
	}
}
void showmenu() {
	char option='\0';
	Scanner Scanner=new Scanner(System.in);
	System.out.println("Welcome, " + customerName + "!");
	System.out.println("Your ID is: " + customerID );
	System.out.println();
	System.out.println("What would you like to do?");
	System.out.println();
	System.out.println("A. Check Your Balance");
	System.out.println("B. Make a Deposit");
	System.out.println("C. Make a withdraw");
	System.out.println("D. View Prev Transaction");
	System.out.println("E. Date");
	System.out.println("F. Exit");
	
	do {
		System.out.println();
		System.out.println("Please Enter an option: ");
		char option1=Scanner.next().charAt(0);
		option=Character.toUpperCase(option1);
		System.out.println();
		
		switch(option) {
		case 'A':
			System.out.println("===============");
			System.out.println("Balance = $" + balance);
			System.out.println("===============");
			break;
		case 'B':
			System.out.println("Enter an amount to deposit: ");
			int amount=Scanner.nextInt();
			deposit(amount);
			break;
		case 'c':
			System.out.println("Enter an amount to withdraw: ");
			int amount2=Scanner.nextInt();
			deposit(amount2);
			break;
		case 'D':
			System.out.println("==============");
			getPrevTransaction();
			System.out.println("==============");
			break;
		case 'E':
			System.out.println("==============");
			Date date=new Date();
			System.out.println(date.toString());
			System.out.println("==============");
			break;
		case 'F':
			System.out.println("==============");
			break;
			
			default:
				System.out.println("Error: Invalid Option , Please click on A,B,C,D,E");
				break;
		}
	}while(option!='F');
	System.out.println("Thank you for using our ATM Bank");
	
}
}
