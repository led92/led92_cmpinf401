package lab2;

import javax.swing.JOptionPane;

public class Lab2_Problem3 {

	public static void main(String[] args) {
		
		String number = JOptionPane.showInputDialog("Enter number");
		
		int n = Integer.parseInt(number);
		
		double g = n / 1000;
		double b = (n % 1000 / 100);
		double s = (n % 100 / 10);
		double k = (n % 10);
		
JOptionPane.showMessageDialog(null,g + " grands " + b + " Benjamins " + s + " sawbucks " + k + " bucks");
		
	}

}
