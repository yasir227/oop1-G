
public class Bicycle {
	
	public int gear;
	public int speed;
	
	public Bicycle() {
		System.out.println("P-DC");
	}
	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
		System.out.println("P-PC");
	}
	public void showinfo(String s){
	System.out.println(s+" Bike");
	System.out.println("Gear: "+gear);
	System.out.println("Speed: "+speed);
	}
}

