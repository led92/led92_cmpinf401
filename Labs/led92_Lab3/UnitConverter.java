package led92_Lab3;

import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		
		String userInput = JOptionPane.showInputDialog("Insert distance or weight:");
		
				int space = userInput.indexOf(" ");
				double value = Double.parseDouble(userInput.substring(0,userInput.indexOf(" ")));
				String unit = userInput.substring(space+1, userInput.length());
		
	double centimeters = 2.54;
	double inches = 0.394;
	double yards = 1.094;
	double meters = 0.9144;
	double ounces = 0.0353;
	double grams = 28.35;
	double pounds = 2.205;
	double kilograms = 0.454;
	
	String u = null;
	double v = 0;
				
		
		if (unit.equalsIgnoreCase("cm"))
		{
			v = value / centimeters;
			u = "in";
		}
		else if (unit.equalsIgnoreCase("in"))
		{
			v = value / inches;
			u = "cm";
		}
		else if (unit.equalsIgnoreCase("yd"))
		{
			v = value / yards;
			u = "m";
		}
		else if (unit.equalsIgnoreCase(("m")))
				{
			v = value / meters;
			u = "yd";
		}
		else if (unit.equalsIgnoreCase(("oz")))
				{
			v = value / ounces;
			u = "gm";
		}
		else if (unit.equalsIgnoreCase(("gm")))
				{
			v = value / grams;
			u = "oz";
		}
		else if (unit.equalsIgnoreCase(("lb")))
				{
			v = value / pounds;
			u = "kg";
		}
		else if (unit.equalsIgnoreCase(("kg")))
				{
			v = value / kilograms;
			u = "lb";
		}
		
		System.out.println (value + " " + unit + " = " + v + " " + u);
	}
	
	}
	


