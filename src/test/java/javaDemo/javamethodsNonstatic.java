package javaDemo;

public class javamethodsNonstatic {
	 int id=10;
	
	private void m1() {
		id=100;
		System.out.println(id);
	}
	private void m2() {
		System.out.println(id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javamethodsNonstatic j=new javamethodsNonstatic();
		j.m1();
		j.m2();
		javamethodsNonstatic jj=new javamethodsNonstatic();
		jj.m2();
		jj.m1();

	}

}
