package com.bridgelabz.Programs;

import com.bridgelabz.Utility.Utility;

/**
 * @author OmPrajapati
 *
 */
public class Anagram {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter frist String : ");
		String fristStr = utility.inputString();
		System.out.println("Enter second String : ");
		String secondStr = utility.inputString();
		fristStr = utility.removeSp(fristStr);
		secondStr = utility.removeSp(secondStr);
		fristStr = utility.toLower(fristStr);
		secondStr = utility.toLower(secondStr);
		fristStr = utility.sortString(fristStr);
		secondStr = utility.sortString(secondStr);
		boolean check = utility.chechStr(fristStr, secondStr);
		if (check) {
			System.out.println("Strings are Anagram ");
		} else {
			System.out.println("Strings are not Anagram");
		}

	}
}
