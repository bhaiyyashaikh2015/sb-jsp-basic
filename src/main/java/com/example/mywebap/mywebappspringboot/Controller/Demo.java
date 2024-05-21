package com.example.mywebap.mywebappspringboot.Controller;

public class Demo {
	
	public static void show() {
		System.out.println("Inside show()");
		throw new RuntimeException();
	}

	public static void main(String[] args) {
//		try {
//			throw new RuntimeException();
//		}catch(Exception e) {
//			System.out.println("Exception occured");
//			e.printStackTrace();
//		}
		
//		show();
		
		try {
			show();
		}
		catch(RuntimeException e) {
			System.out.println("Exception1 occured");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		}

	}

}
