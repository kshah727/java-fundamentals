/**
 * File Name: FundamentalsApp.java<br>
 * Shah, Krishna<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 16, 2017
 */
package com.sqa.ks;

import com.sqa.ks.helpers.*;

/**
 * FundamentalsApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Shah, Krishna
 * @version 1.0.0
 * @since 1.0
 */
public class FundamentalsApp {

	public static void main(String[] args) {
		String appName = "Java Fundamentals";
		String name = AppBasics.greetUserandGetName(appName);
		compareNumberto10();
		checkUserMonth();
		checkUserGrade();
		AppBasics.farewellUser(name, appName);
	}

	private static void checkUserGrade() {
		String input = AppBasics.requestInfoFromUser("What grade did you receive?");
		int userGrade = Integer.parseInt(input);
		if (userGrade >= 90) {
			System.out.println("A");
		} else if (userGrade >= 80) {
			System.out.println("B");
		} else if (userGrade >= 70) {
			System.out.println("C");
		} else if (userGrade >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

	private static void checkUserMonth() {
		String input = AppBasics.requestInfoFromUser("What month were you born type as 1-12?");
		int birthmonth = Integer.parseInt(input);
		switch (birthmonth) {
		case 1:
			System.out.println("You have chose the month of January");
			break;
		case 2:
			System.out.println("You have chose the month of February");
			break;
		case 3:
			System.out.println("You have chose the month of March");
			break;
		case 4:
			System.out.println("You have chose the month of April");
			break;
		case 5:
			System.out.println("You have chose the month of May");
			break;
		case 6:
			System.out.println("You have chose the month of June");
			break;
		case 7:
			System.out.println("You have chose the month of July");
			break;
		case 8:
			System.out.println("You have chose the month of August");
			break;
		case 9:
			System.out.println("You have chose the month of September");
			break;
		case 10:
			System.out.println("You have chose the month of October");
			break;
		case 11:
			System.out.println("You have chose the month of November");
			break;
		case 12:
			System.out.println("You have chose the month of December");
			break;
		default:
			System.out.println("You have not chosen a valid month");
			break;
		}
	}

	private static void compareNumberto10() {
		String input = AppBasics.requestInfoFromUser("Give me any number:");
		int userNumber = Integer.parseInt(input);
		if (userNumber > 10) {
			System.out.println("Number is greater than 10");
		} else if (userNumber < 10) {
			System.out.println("Number is less than 10");
		} else {
			System.out.println("Number is 10!");
		}
	}
}
