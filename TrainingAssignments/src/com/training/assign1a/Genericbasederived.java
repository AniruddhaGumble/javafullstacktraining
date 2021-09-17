package com.training.assign1a;

public class Genericbasederived {
	public static void main(String[] args) {
		Test2<Integer, String> t = new Test2<Integer, String>(111, "Aniruddha xyz abc");

		System.out.println(t.getOb());
		System.out.println(t.getOb2());
	}

}
