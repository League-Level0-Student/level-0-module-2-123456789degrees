package _01_random._6_lottery_numbers;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.JOptionPane;
public class Lotterynumbers {
	public static void main(String[] args) {
		String s = "";
		for (int i = 0; i < 6; i++) {
			int randomChoice = 0;
			Random ran = new Random();
			randomChoice = ran.nextInt(100);
			s += (randomChoice);
			s += " ";
		}
		JOptionPane.showMessageDialog(null, s);
	}
}
