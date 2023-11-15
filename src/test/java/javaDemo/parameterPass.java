package javaDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class parameterPass {
	
	public void m1(int a) {
		
	}
	public void m2(int a,int b) {
		System.out.println(a);
		System.out.println(b);
	}
	public void m3(ArrayList<Integer>a) {
			System.out.println(a);
	}
	public void m4(Map<String,String>m) {					
			System.out.println(m);
		}
		
	public static void main(String[] args) {
		parameterPass p=new parameterPass();
		p.m1(10);
		p.m2(20,30);
		ArrayList<Integer>i=new ArrayList<Integer>();
		i.add(100);
		i.add(200);
		i.add(300);
		p.m3(i);
		Map<String,String>m=new HashMap<String,String>();
		/*m.put("Name","Kavin");		
		m.put("Name","Sharan");		// key value is same -->duplicate not allowed,last data only print
		m.put("Name","Venkat");*/
		m.put("Name","Kavin");		
		m.put("Nam","Sharan");		// key value is diff--> so all data printed
		m.put("Na","Venkat");
		p.m4(m);
	}

}
