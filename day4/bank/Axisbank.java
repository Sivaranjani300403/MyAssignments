package bank;

public class Axisbank extends Bankinfo {
  public void deposit() {
	  System.out.println("90000");
  }
  
  public static void main(String[] args) {
	Axisbank ab=new Axisbank();
	ab.fixed();
	ab.deposit();
	ab.saving();
	}
}

