package TDRFC;

public class Solution2DetailedConceptCons {
	int a,b,c,d,e;
public void method1(int a1, int b1, int c1, int d1, int e1) {
	a=a1;
	b=b1;
	c=c1;
	d=d1;
	e=e1;
	
	
}
	public static void main(String[] args) {
		 
		Solution2DetailedConceptCons ob= new Solution2DetailedConceptCons();
		ob.method1(1, 2, 3, 4, 5);// 1 call for assign value
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.d);
		System.out.println(ob.e);
		
		// to print did 6 call
		/*
		 1ob- 6 call
		 for 10 ob=6*10=60
		 */
	}

}
