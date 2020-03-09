
public class MountainBike extends Bicycle {
	
public int seatheight;
	
	public MountainBike() {
		super(5, 50);
	}
	public MountainBike(int gear, int speed, int seatheight) {
		this.seatheight = seatheight;
		super.gear = gear;
		super.speed = speed;
		System.out.println("C-PC");
	}
	public void showbike(String s){
		super.showinfo(s);
		System.out.println("seatheight :"+seatheight);
	}
}


