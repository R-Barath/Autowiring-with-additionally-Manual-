package in.barath.beans;

public class SonyPrinter implements IPrinter {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("SonyPrinter is printing...");
	}
	
	public SonyPrinter() {
		System.out.println("Sony printer constructor");
	}

	
}
