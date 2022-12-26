package week1.assignments;

public class Calculator {
	
	int a = 50;
	int b = 80;
	int c = 70;
	public void add1() {
		System.out.println(a+b);
	}

	public void add2() {
		System.out.println(a+b+c);
	}
	
	public void mul1() {
		System.out.println(a*b);
	}
	
	public double mul2(int a, double b) {
		return a*b;
	}
	
	public void sub1() {
		System.out.println(b-c);
	}
	
	public double sub2(double a, double b) {
		return a-b;
	}
	
	public void div1() {
		System.out.println(a/b);
	}
	
	public double div2(int a, double b) {
		return a/b;
	}
	
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add1();
		cal.add2();
		cal.mul1();
		System.out.println(cal.mul2(10, 10.001));
		cal.sub1();
		System.out.println(cal.sub2(30.456, 25.654));
		cal.div1();
		System.out.println(cal.div2(10, 2.5));
	}
}
