package TDRFC;

public class Constructor1 {
	public Constructor1() {
		System.out.println("Default constructor");
		
	}
	public Constructor1(int a, int b) {
		System.out.println("Two parameterize constructor");
		
	}

	public Constructor1(int a, int b, int c) {
		System.out.println("Three Parameterize constructor");
		
	}
	
	


	public static void main(String[] args) {
		Constructor1 ob = new Constructor1();
		Constructor1 op= new Constructor1(5,6);
		Constructor1 od = new Constructor1(5,6,9);

	}

}
// So in constructor we need to create object 