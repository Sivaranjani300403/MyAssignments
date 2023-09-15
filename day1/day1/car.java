package day1;


public class car {
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
	    	car swift = new car();
	    	swift.applygear();
	    	swift.switchOnAc();
	        swift.applyAcclerate();
	    }
	}

