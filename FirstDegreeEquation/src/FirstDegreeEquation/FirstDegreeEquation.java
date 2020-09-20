package FirstDegreeEquation;

import java.util.Scanner;

public class FirstDegreeEquation {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner obj = new Scanner(System.in);
		System.out.println("Hay nhap so a trong phuong trinh ax+b = c");
		a = obj.nextInt();
		System.out.println("Hay nhap so b trong phuong trinh ax+b = c");
		b= obj.nextInt();
		System.out.println("Hay nhap so c trong phuong trinh ax+b = c");
		c= obj.nextInt();
		System.out.println("Ta co phuong trinh la "+ a +"x + "+b+" = 0" );
		System.out.println("Nghiem cua phuong trinh la "+ (float) (c-b)/a);
		
	}
}
