package TDRFC;

public class MethodConcept {
	public void sum(int a, int b) {
		int c= a+b;
		System.out.println(c);
	}
	public void mul(int a, int b) {
		this.div(10, 20);
		int c=a*b;
		System.out.println(c);
	}
	public void sub(int a, int b) {
		int c= a-b;
		System.out.println(c);
	}
	public void div(int a, int b) {
		int c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
   MethodConcept ab=new MethodConcept();
   ab.sum(6, 7);
   ab.sub(3, 4);
   ab.mul(5, 6);
   ab.div(4, 2 );
	}

}
