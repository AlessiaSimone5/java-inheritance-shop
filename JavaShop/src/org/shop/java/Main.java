package org.shop.java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Smartphone s = new Smartphone ("samsung", "Galaxy" , 55555, 230.0f, 22, 11111155555555555555d, 64);
		System.out.println(s);
		
		Televisori t = new Televisori ("Smart TV", "samsung", 66666, 500.0f, 22, "60X80", true);
		System.out.println(t);

		Cuffie c = new Cuffie ("Cuffiette", "Apple", 77777, 80.0f, 22, "black", false);
		System.out.println(c);

		s.setPrezzo(999.99f);
		System.out.println(s);
		
		t.setSmart(false);
		System.out.println(t);
		
		c.setWireless(true);
		System.out.println(c);
	}

}
