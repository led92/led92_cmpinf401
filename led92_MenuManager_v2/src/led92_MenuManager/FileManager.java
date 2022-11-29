package led92_MenuManager;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class FileManager {

	public static ArrayList<Entree> readEntrees(String fileName) {
		ArrayList<Entree> entArr = new ArrayList<Entree>();

		File file = new File(fileName);
		try{
			Scanner scan = new Scanner(file);


			while(scan.hasNextLine()) {
				String str = scan.nextLine();
				String[] temp = str.split("@@");
				Entree ent = new Entree(temp[0], temp[1], Integer.parseInt(temp[2]));
				entArr.add(ent);
			}
			scan.close();
			return entArr;
		}
		catch(FileNotFoundException e) {
			return null;
		}

	}

	public static ArrayList<Side> readSides(String fileName) {
		ArrayList<Side> sideArr = new ArrayList<Side>();

		File file = new File(fileName);
		try{
			Scanner scan = new Scanner(file);


			while(scan.hasNextLine()) {
				String str = scan.nextLine();
				String[] temp = str.split("@@");
				Side side = new Side(temp[0], temp[1], Integer.parseInt(temp[2]));
				sideArr.add(side);
			}
			scan.close();
			return sideArr;
		}
		catch(FileNotFoundException e) {
			return null;
		}
	}

	public static ArrayList<Salad> readSalads(String fileName) {
		ArrayList<Salad> salArr = new ArrayList<Salad>();

		File file = new File(fileName);
		try{
			Scanner scan = new Scanner(file);


			while(scan.hasNextLine()) {
				String str = scan.nextLine();
				String[] temp = str.split("@@");
				Salad sal = new Salad(temp[0], temp[1], Integer.parseInt(temp[2]));
				salArr.add(sal);
			}
			scan.close();
			return salArr;
		}
		catch(FileNotFoundException e) {
			return null;
		}
	}

	public static ArrayList<Dessert> readDesserts(String fileName) {
		ArrayList<Dessert> desArr = new ArrayList<Dessert>();

		File file = new File(fileName);
		try{
			Scanner scan = new Scanner(file);


			while(scan.hasNextLine()) {
				String str = scan.nextLine();
				String[] temp = str.split("@@");
				Dessert des = new Dessert(temp[0], temp[1], Integer.parseInt(temp[2]));
				desArr.add(des);
			}
			scan.close();
			return desArr;
		}
		catch(FileNotFoundException e) {
			return null;
		}
	}
}