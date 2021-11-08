package com.qa.helloworld;

public class HelloWorld {

	public static void main(String[] args) {

		helloWorld();
		helloWorld2();
		helloWorld3("Random message");
		helloWorld4("Hello", "Harry!");
		helloWorld5(1, 10, 100);
		helloWorld6();
		System.out.println(helloWorld7());
		System.out.println(helloWorld8("Print this"));
		System.out.println(helloWorld9());
		method1();
	}

	private static void helloWorld() {
		System.out.println("HELLO WORLD!");

	}

	private static void helloWorld2() {
		System.out.println("HELLO");

	}

	public static void helloWorld3(String message) {
		System.out.println(message);

	}

	public static void helloWorld4(String message, String message2) {
		System.out.println(message + " " + message2);

	}

	public static void helloWorld5(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);

	}

	public static void helloWorld6() {
		String greet = "Hello friend";
		System.out.println(greet);

	}

	public static String helloWorld7() {
		return "Return";

	}

	public static String helloWorld8(String message1) {
		return message1;

	}

	public static int helloWorld9() {
		return 128;

	}

	public static void method1() {
		for (int i = 0; i <= 10; i++) {
			int number = 20;
			number += i;
			System.out.println(number);
		}
	}

}
