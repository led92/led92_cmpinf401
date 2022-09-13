package lab2;

import javax.swing.JOptionPane;

public class Lab2_Problem1 {

	public static void main(String[] args) {
		
		String num1 = JOptionPane.showInputDialog("Side a");
		String num2 = JOptionPane.showInputDialog("Side b");

		int x = Integer.parseInt(num1);
		int y = Integer.parseInt(num2);
		
		double a  = Math.pow(x,2);
		double b  = Math.pow(y,2);
		double c = Math.sqrt(a + b); 
		
		double r = Math.round(c * 100);
		double f = (r / 100);
		
		JOptionPane.showMessageDialog(null, "The hypotenuse is " + f);
		
	}

}
