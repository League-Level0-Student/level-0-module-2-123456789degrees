package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String args[]) {
		String age = JOptionPane.showInputDialog("Enter your age: ");
		int age2 = Integer.parseInt(age);
		if (age2 >= 18) {
			String opinion = JOptionPane.showInputDialog(null, "Who do you think the next president should be? ");
		}
		else {
			JOptionPane.showMessageDialog(null,"Nobody cares what you think");
		}
	}
}
