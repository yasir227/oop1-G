
public class Account {
	private int accountNo;
	private double balance;
	public static int nooftransection;
	
	public Account(int a, double b) {
		accountNo = a;
		balance = b;
		nooftransection = 1;
	}
	public void showinfo() {
		System.out.println("AccNo: " + accountNo);
		System.out.println("Balance: " + balance);
		System.out.println("Transection: " + nooftransection);
	}
	public void changeValue(int n) {
		nooftransection++;

}
}
