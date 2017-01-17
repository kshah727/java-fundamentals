package com.sqa.ks;

import com.sqa.ks.helpers.*;

public class HelloWorldApp {

	public static void favanimal() {
		String favoriteanimal = AppBasics.requestInfo("what is your favorite animal");
		System.out.println("Your favorite amimal is " + favoriteanimal);
	}

	public static void favColor() {
		String color = AppBasics.requestInfoFromUser("What is your favorite color?");
		System.out.println("Your favorite color is " + color + " ! Wow, mine too");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String appName = "Hello World";
		String userName = AppBasics.greetUserandGetName(appName);
		doSomething();
		favColor();
		AppBasics.farewellUser(userName, appName);
	}

	private static void doSomething() {
		System.out.println("Application is doing it's thing...");
	}
}