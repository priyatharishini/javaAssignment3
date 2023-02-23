package week3day2;

public class Automation extends MultipleLanguage implements Language,TestTool{

	public static void main(String[] args) {
		Automation au=new Automation();
		au.java();
		au.python();
		au.Ruby();
		au.selnium();
	}

	public void selnium() {
		System.out.println("Automation using in selnium");
	}

	public void java() {
		System.out.println("java is oops concepts");
		
	}

	@Override
	public void Ruby() {
		System.out.println("Ruby is a scripting language designed by Yukihiro Matsumoto");
		
	}

}
