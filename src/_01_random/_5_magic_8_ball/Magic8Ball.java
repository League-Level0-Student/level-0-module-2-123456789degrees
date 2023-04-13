//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	public static void main(String[] args) {
	// 1. Make a main method that includes all the steps below

	// 2. Get the user to enter a question for the 8 ball to answer
		String x = JOptionPane.showInputDialog("Enter a question for the 8 Ball to answer: ");

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3
		Random randomMaker = new Random();
		
		int ran = randomMaker.nextInt(4);
		
	
	// 4. If the random number is 0
		if (ran == 0) {
			JOptionPane.showMessageDialog(null, "Yeah, probably. ");
		}
		else if (ran == 1) {
			JOptionPane.showMessageDialog(null, "Outlook not so good. ");
		}
		else if (ran == 2) {
			JOptionPane.showMessageDialog(null, "Maybe ask Google?");
		}
		else {
			JOptionPane.showMessageDialog(null, "My mind is not concetrating right now. Pls try again.");
		}
	// -- tell the user "Yes"

	// 5. If the random number is 1

	// -- tell the user "No"

	// 6. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3

	// -- write your own answer
	}
}
