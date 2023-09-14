package week1.day1;

public class vehicle {
	public void applygear() {
		System.out.println("applygear");
	}
	public void switchOnAc() {
		System.out.println("switchOnAc");
	}
    public void applyAcclerate() {
    	System.out.println("applyAcclerate");
    }
    public static void main(String[] args) {
    	vehicle swift = new vehicle();
    	swift.applygear();
    	swift.switchOnAc();
        swift.applyAcclerate();
    }
}

