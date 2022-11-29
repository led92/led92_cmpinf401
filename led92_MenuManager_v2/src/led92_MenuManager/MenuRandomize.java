package led92_MenuManager;

import java.util.ArrayList;
import java.util.Random;

public class MenuRandomize {

	ArrayList<Entree> entrees;


	ArrayList<Side> sides;


	ArrayList<Salad> salads;


	ArrayList<Dessert> desserts;

	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) {
		entrees = FileManager.readEntrees(entreeFile);
		sides = FileManager.readSides(sideFile);
		salads = FileManager.readSalads(saladFile);
		desserts = FileManager.readDesserts(dessertFile);
	}

	public Menu randomMenu() {
		Random rand = new Random();
		return new Menu("menu", entrees.get(rand.nextInt(entrees.size())), sides.get(rand.nextInt(sides.size())), salads.get(rand.nextInt(salads.size())), desserts.get(rand.nextInt(desserts.size())));
	}



}
