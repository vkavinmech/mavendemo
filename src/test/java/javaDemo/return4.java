package javaDemo;

public class return4 {
	public int m1(int a) {
		int res = 0;
		if (a==10) {
			res=100;
	}
		if (a==20) {
			
			res=200;
		}
		if (a==30) {
			
			res=300;
		}
	return res;
}
public static void main(String[] args) {
	return4 b=new return4();
	int m1 = b.m1(30);
	System.out.println(m1);
}
}
