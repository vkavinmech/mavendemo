package javaDemo;

public class return2 {
	public int m1(int a) {
		if (a==10) {
			
		return 100;
		}
		else {
			
		return 0;
		}
	}
	public static void main(String[] args) {
		return2 r=new return2();
		int m1 = r.m1(10);
		System.out.println(m1);
	}
}
