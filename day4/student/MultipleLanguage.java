package student;

public abstract class MultipleLanguage implements Language, TestTool{
	public void python() {
		System.out.println("python language");
	}
	public abstract void ruby();

}
