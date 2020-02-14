//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0
package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
		public static void main(String[] args) {
	// 1. Make a main method that includes all the steps below….
	Random randomMaker = new Random();
	int randomNumber = randomMaker.nextInt(4);
	System.out.println(randomNumber);
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("ASK A QUESTION!!!!NOW!!!! OR I'LL KILL U!!!");

	// 5. If the random number is 0

if (randomNumber == 0) {
	JOptionPane.showMessageDialog(null, "YES!!!");
} else if (randomNumber == 1) {
	JOptionPane.showMessageDialog(null, "no...srry."); }
	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2
  else if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "You think I magic or something just ask Google or something...Like a normal person."); }
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
  else {
	JOptionPane.showMessageDialog(null, "Just stop asking me usless questions I'm not magic...Just Stop...PlS!!!"); }
	// -- write your own answer

}
}
