package javaDemo;

public class return3 {

	public int m1(int a) {
			if (a==10) {
				
			return 100;
		}
			if (a==20) {
				
				return 200;
			}
			if (a==30) {
				
				return 300;
			}
			
		return 0;
	}
	public static void main(String[] args) {
		return3 b=new return3();
		int m1 = b.m1(30);
		System.out.println(m1);
	}
}
