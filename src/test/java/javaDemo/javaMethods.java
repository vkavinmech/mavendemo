package javaDemo;

public class javaMethods {
	
		static int id=10;
		
		private void m1() {
			id=100;
			System.out.println(id);
		}
		private void m2() {
			System.out.println(id);
		}
		public static void main(String[] args) {
			javaMethods j=new javaMethods();
			j.m1();
			j.m2();
			javaMethods jj=new javaMethods();
			j.m2();
			j.m1();
		}
	}