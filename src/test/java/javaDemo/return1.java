package javaDemo;

public class return1 {

		public int m1(int a) {
			if (a==10) {
				
			return 100;
	}
			return 0;
		}
		public static void main(String[] args) {
			return1 r=new return1();
			int m1 = r.m1(10);
			System.out.println(m1);
		}
}
