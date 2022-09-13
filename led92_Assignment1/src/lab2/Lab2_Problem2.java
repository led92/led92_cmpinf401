package lab2;

import javax.swing.JOptionPane;

public class Lab2_Problem2 {

	public static void main(String[] args) {
		
		String radius = JOptionPane.showInputDialog("Insert radius");
		double r = Integer.parseInt(radius);
		
		double p = ((Math.round((2 * Math.PI * r) * 100)/100));
		double a = ((Math.round((Math.PI * r * r)) * 100)/100);
		
		JOptionPane.showMessageDialog(null, "The circle with radius " + r + " has an area of " + a + " and a perimeter of " + p + ".");
	}

}
