package led92_lab5;

import java.util.Random;

public class Lab5 {

	public static void rollDice (int times, Random value) {
			
		int[] count = {0,0,0,0,0,0,0,0,0,0,0};
		double[] prob = {1.0/36,2.0/36,3.0/36,4.0/36,5.0/36,6.0/36,5.0/36,4.0/36,3.0/36,2.0/36,1.0/36};

		for(int i = 0;i<times;i++) {
			int roll1 = value.nextInt(6)+ 1;
			int roll2 = value.nextInt(6) + 1; 
			int sum = roll1 + roll2;
			
			count [sum - 2] += 1;
		}
		
		for (int i = 0;i<11;i++) {
			System.out.println((i + 2) + " was rolled " + count[i] + " times ");
			double percentage = (double) count [i] / times;
			System.out.println("percentage rolled " + percentage);
			System.out.println("percentage expected " + prob[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
	
			Random r = new Random();
			rollDice(100000,r);
	
		
	}

}
