package led92_MenuManager;

import java.util.ArrayList;
import java.util.Random;

public class MenuManager {

	private ArrayList <Entree> entrees = new ArrayList <Entree> ();
	private ArrayList <Side> sides = new ArrayList <Side> ();
	private ArrayList <Salad> salads = new ArrayList <Salad> ();
	private ArrayList <Dessert> desserts = new ArrayList <Dessert> ();
	private ArrayList <MenuItem> items = new ArrayList <MenuItem> ();
	
	public MenuManager (String dishesFile) {
		FileManager read = new FileManager();
		items = read.readItems(dishesFile);
	
		for(MenuItem item : items) {
			if(item instanceof Entree) {
				entrees.add((Entree) item);
			} else if(item instanceof Side) {
				sides.add((Side) item);
			} else if(item instanceof Salad) {
				salads.add((Salad) item);
			} else if(item instanceof Dessert) {
				desserts.add((Dessert) item);
			}
		}
		}
	
	public ArrayList<MenuItem> getItems() {
		return items;
	}
	public void setItems(ArrayList<MenuItem> items) {
		this.items = items;
	}
	public Menu randomMenu(String name) {
		Random rand = new Random();
		return new Menu(name, entrees.get(rand.nextInt(entrees.size())), sides.get(rand.nextInt(sides.size())), salads.get(rand.nextInt(salads.size())), desserts.get(rand.nextInt(desserts.size())));
	}
	public Menu minCaloriesMenu (String name) {
	   
	    Entree minEntree = entrees.get(0);
	    for (Entree entree : entrees) {
	        if (entree.getCalories() < minEntree.getCalories()) {
	            minEntree = entree;
	        }
	    }

	   
	    Side minSide = sides.get(0);
	    for (Side side : sides) {
	        if (side.getCalories() < minSide.getCalories()) {
	            minSide = side;
	        }
	    }

	 
	    Salad minSalad = salads.get(0);
	    for (Salad salad : salads) {
	        if (salad.getCalories() < minSalad.getCalories()) {
	            minSalad = salad;
	        }
	    }

	   
	    Dessert minDessert = desserts.get(0);
	    for (Dessert dessert : desserts) {
	        if (dessert.getCalories() < minDessert.getCalories()) {
	            minDessert = dessert;
	        }
	    }

	    
	    return new Menu(name, minEntree, minSide, minSalad, minDessert);
	}

	public Menu maxCaloriesMenu (String name) {
	  
		Entree maxEntree = entrees.get(0);
	    for (Entree entree : entrees) {
	        if (entree.getCalories() > maxEntree.getCalories()) {
	            maxEntree = entree;
	        }
	    }

	   
	    Side maxSide = sides.get(0);
	    for (Side side : sides) {
	        if (side.getCalories() > maxSide.getCalories()) {
	            maxSide = side;
	        }
	    }

	 
	    Salad maxSalad = salads.get(0);
	    for (Salad salad : salads) {
	        if (salad.getCalories() > maxSalad.getCalories()) {
	            maxSalad = salad;
	        }
	    }

	   
	    Dessert maxDessert = desserts.get(0);
	    for (Dessert dessert : desserts) {
	        if (dessert.getCalories() > maxDessert.getCalories()) {
	            maxDessert = dessert;
	        }
	    }

	    
	    return new Menu(name, maxEntree, maxSide, maxSalad, maxDessert);
	}
	}



