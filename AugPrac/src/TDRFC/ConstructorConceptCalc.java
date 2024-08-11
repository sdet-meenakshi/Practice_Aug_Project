package TDRFC;

public class ConstructorConceptCalc {
	public ConstructorConceptCalc(int a, int b) {
		this(2,3,4);
		int c=a+b;
		System.out.println(c);
	}
    public ConstructorConceptCalc(int a, int b, int c) {
		int j=a-b;
		System.out.println(j);
	}
    public ConstructorConceptCalc(int a,int b, int c, int d) {
    	int h=a*b;
		System.out.println(h);
}

	public static void main(String[] args) {
		ConstructorConceptCalc ab= new ConstructorConceptCalc(5,6);
		ConstructorConceptCalc a= new ConstructorConceptCalc(5,6,4,5);

	}

}
