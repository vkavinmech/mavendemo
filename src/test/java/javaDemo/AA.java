package javaDemo;

public class AA {
	public void demo() {
		System.out.println("demo executing");
	}
	public int test() {
		return 10;
	}

	public static void main(String[] args) {
		AA a=new AA();
		//demo();  non static method not directly called by static
		//System.out.println(a.demo());    dont print directly because void 
		a.demo();
		System.out.println(a.test());// print directly return type is int
		
	}
}
