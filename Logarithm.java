
package led92_lab4;

import javax.swing.JOptionPane;

public class Logarithm {

	public static void main(String[] args) {
		
		String base = JOptionPane.showInputDialog("Enter base value:");
		String value = JOptionPane.showInputDialog("Enter x value:");
	 
		double b = Double.parseDouble(base);
		double x = Double.parseDouble(value);
		
		while (b < 1) {
		b = Double.parseDouble(JOptionPane.showInputDialog("Enter a base value that is greater than 1:")); 
		}
		 

		while (x < 0) {
		x = Double.parseDouble(JOptionPane.showInputDialog("Enter an x value that is greater than 0:"));
		}
		
		
		int count = 0;
		
		double temp_x = x;
		
		while (temp_x >= b) {
			temp_x = temp_x/b;
			count = count + 1;
		}
	

		System.out.println ("For base value " + b + " and x value " + x + ", the logarithm is equal to " + count + ".");
	
	 
	}
	}
	