package javaDemo;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class returnKeyword {
	
	private int m1() {
		return 100;
	}
	private ArrayList<String> m2(){
		ArrayList<String>s=new ArrayList<String>();
		s.add("Kavin");
		s.add("Sharan");
		s.add("Venkat");
		return s;
	}
	private Set<Integer>m3(){
		Set<Integer>s=new LinkedHashSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		return s;	
	}
	public static void main(String[] args) {
		returnKeyword r=new returnKeyword();
		System.out.println(r.m1());
		//int m1 = r.m1();
		//System.out.println(m1);
		
		System.out.println(r.m2());
		//ArrayList<String> m2 = r.m2();
		//System.out.println(m2);
		
		System.out.println(r.m3());
		//Set<Integer> m3 = r.m3();
		//System.out.println(m3);
	}

}
