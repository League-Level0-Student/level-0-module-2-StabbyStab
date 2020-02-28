package _06_lottery_numbers;

import java.awt.print.Printable;
import java.util.Random;

public class Lotterynum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int numtrue= 0;
		Random ran = new Random();
        num = ran.nextInt(6);
        num = num*10000;
        num2 = ran.nextInt(6);
        num2 = num2*1000;
        num3 = ran.nextInt(6);
        num3 = num3*100;
        num4 = ran.nextInt(6);  
        num4 = num4*10;
        num5 = ran.nextInt(6);
        num5 = num5*1;
        numtrue = num + num2 + num3 + num4 + num5;
		System.out.println(numtrue);
	}


}
