package in.barath.beans;

public class Atm {

	private IPrinter printer;
	
	public Atm() {
		System.out.println("Atm constructor");
	}
	
	public void setPrinter(IPrinter printer) {
		System.out.println("Setter has been created");
		this.printer=printer;
	}
	
	
	public void withdraw() {
		System.out.println("Withdraw successful...");
		printer.print();
	}
	
	
}
