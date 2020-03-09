
public class MainDemo {

	public static void main(String[] args) {


		Account a1 = new Account(100, 1000.0);
		Account a2 = new Account(200, 2000.0);
		a1.showinfo();
		Account.nooftransection = 3;
		a2.showinfo();
		a1.changeValue(10);
		a2.showinfo();

	}

}
