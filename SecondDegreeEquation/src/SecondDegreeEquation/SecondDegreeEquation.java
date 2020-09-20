package SecondDegreeEquation;

import java.util.Scanner;

public class SecondDegreeEquation {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner obj = new Scanner(System.in);
		System.out.println("Hay nhap so a trong phuong trinh ax^2 + b = c");
		a = obj.nextInt();
		System.out.println("Hay nhap so b trong phuong trinh ax^2 + b = c");
		b= obj.nextInt();
		System.out.println("Hay nhap so c trong phuong trinh ax^2 + b = c");
		c= obj.nextInt();
		System.out.println("Ta co phuong trinh la "+ a +"x^2 + "+b+" = "+c );
		if (Math.pow(b,2) - 4*a*c == 0) {
			System.out.println("Phuong trinh co 1 nghiem kep la: "+(-b/(2*a))+" va "+b/(2*a));
		}
		if (Math.pow(b,2) - 4*a*c < 0) {
			System.out.println("Phuong trinh vo nghiem");
		}
		if (Math.pow(b,2) - 4*a*c > 0) {
			double f = (-b+Math.sqrt(Math.pow(b,2) - 4*a*c))/2*a;
			double g = (-b-Math.sqrt(Math.pow(b,2) - 4*a*c))/2*a;
			System.out.println("Phuong trinh co 2 nghiem kep la: "+f+" va "+g);
		}
	}
}
