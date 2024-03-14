package Bank;

public class Bank {
public static void main(String[] args) {
	ATM asal=new ATM("Asal" , "IR2882");
	ATM athena=new ATM("Athena" , "IR8320");
	asal.showmenu();
	athena.showmenu();
}
}
