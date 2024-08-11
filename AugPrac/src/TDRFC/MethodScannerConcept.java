package TDRFC;

import java.util.Scanner;

public class MethodScannerConcept {
	

	public void sum(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void sub(int a, int b) {
		int c=a-b;
		System.out.println(c);
	}
	public void mul(int a, int b) {
		int c=a*b;
		System.out.println(c);
	}
	public void div(int a, int b) {
		int c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Scanner ob= new Scanner(System.in);
		System.out.println("Enter new number a");
		int num= ob.nextInt();
		System.out.println("Enter new number b");
		int numm= ob.nextInt();
		System.out.println("Total");
		MethodScannerConcept ds=new MethodScannerConcept();
		ds.sum(num, numm);
		ds.sub(num, numm);
		ds.div(6, 3);
		ds.mul(num, numm);
	}

}
