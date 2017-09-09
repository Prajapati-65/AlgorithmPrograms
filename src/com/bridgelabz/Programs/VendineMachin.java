package com.bridgelabz.Programs;

import com.bridgelabz.Utility.Utility;

/**
 * @author OmPrajapati
 *
 */
public class VendineMachin {

	public static void main(String[] args) {

		Utility utility = new Utility();
		System.out.print("Enter the Amount:");
		int money = utility.inputInteger();
		int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };
		utility.calculate(money, notes);
	}
}
