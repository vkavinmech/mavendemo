package javaDemo;

import java.util.ArrayList;
import java.util.List;

public class return5 {
	
	public List<Integer> m1() {
		int a=10,b=20,c=30;
		List<Integer> l=new ArrayList<Integer>();
		l.add(a);
		l.add(b);
		l.add(c);
		return l;
		// return a,b,c;	wrong syntax
	}
	public static void main(String[] args) {
		return5 r=new return5();
		List<Integer> m1 = r.m1();
		System.out.println(m1);
	}
	
}
