package student;

public class Automation extends MultipleLanguage {

	
	public void java() {
		
		System.out.println("java");
	}

	public void Selenium() {
		
		System.out.println("selenium");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby");
	}
	
	public static void main(String[] args) {
		
		Automation language= new Automation();
		language.java();
		language.python();
		language.ruby();
		language.Selenium();
	}

}


