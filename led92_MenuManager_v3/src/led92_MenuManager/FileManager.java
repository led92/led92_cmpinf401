package led92_MenuManager;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class FileManager {

	public ArrayList<MenuItem> readItems(String fileName) {
		ArrayList<MenuItem> itemArr = new ArrayList<MenuItem>();
		
		File file = new File(fileName);
		try{
			Scanner scan = new Scanner(file);
		
		
		while(scan.hasNextLine()) {
			String str = scan.nextLine();
			String[] temp = str.split("@@");
			if(temp[1].equals("entree")) {
				Entree entree = new Entree(temp[0], temp[2], Integer.parseInt(temp[3]), Double.parseDouble(temp[4]));
				itemArr.add(entree);
			} else if(temp[1].equals("dessert")) {
				Dessert dessert = new Dessert(temp[0], temp[2], Integer.parseInt(temp[3]), Double.parseDouble(temp[4]));
				itemArr.add(dessert);
			} else if(temp[1].equals("side")) {
				Side side = new Side(temp[0], temp[2], Integer.parseInt(temp[3]), Double.parseDouble(temp[4]));
				itemArr.add(side);
			}  else if(temp[1].equals("salad")) {
				Salad salad = new Salad(temp[0], temp[2], Integer.parseInt(temp[3]), Double.parseDouble(temp[4]));
				itemArr.add(salad);
			}
			
		}
		scan.close();
		return itemArr;
		}
		catch(FileNotFoundException e) {
			return null;
		}
		
	}
	public static void writeMenu(String fileName, ArrayList<Menu> menus) {
	    try {
	        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

	        for (Menu menu : menus) {
	            
	            writer.write(menu.toString());
	            writer.newLine();

	            
	            for (MenuItem item : menu.getItems()) {
	                writer.write(item.getName());
	                writer.write(", ");
	                writer.write(item.getDescription());
	                writer.write(", ");
	                writer.write(Integer.toString(item.getCalories()));
	                writer.write(", ");
	                writer.write(Double.toString(item.getPrice()));
	                writer.newLine();
	            }

	            
	            writer.write("Total Calories: " + menu.totalCalories());
	            writer.newLine();
	            writer.write("Total Price: " + menu.totalPrice());
	            writer.newLine();
	        }

	        writer.close();
	    } catch (IOException e) {
	        System.out.println("Error writing to file " + fileName);
	    }
	}




			
}
