package led92_MenuManager;
/**
 * Class Menu
 * author : Lyndsey Dippold
 * created: 10/14/2022
 */

public class Menu {

		private String name;
		private Entree entree;
		private Dessert dessert;
		private Salad salad;
		private Side side;
		
		public Menu(String name) {
			this.name = name;
			this.entree = null;
			this.dessert = null;
			this.salad = null;
			this.side = null; 
		}
		public Menu(String name, Entree entree, Side side) {
			this.name = name;
			this.entree = entree;
			this.side = side;
			this.dessert = null;
			this.salad = null;
		}
		public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert){
			this.name = name;
			this.entree = entree;
			this.side = side;
			this.salad = salad;
			this.dessert = dessert;
		}
		
		public int totalCalories() {
			int calories = 0;
			if(entree != null) {
				calories += entree.getCalories();
			}
			if(side != null) {
				calories += side.getCalories();
			}
			if(salad != null) {
				calories += salad.getCalories();
			}
			if(dessert != null) {
				calories += dessert.getCalories();
			}
			
			return calories;
		}
		
		public String description() {
			String description = "";
			if(entree == null) {
				description = description + "Entree: N/A \n";
			} else {
				description =  description + "Entree: " + entree.getDescription() + "\n";
			}
			
			if(side == null) {
				description = description + "Side: N/A \n";
			} else {
				description = description + "Side: " + side.getDescription() + "\n";
			}
			if(salad == null) {
				description = description + "Salad: N/A \n";
			} else {
				description = description + "Salad: " + salad.getDescription() + "\n";
			}
			if(dessert == null) {
				description = description + "Dessert: N/A \n";
			} else {
				description = description + "Dessert: " + dessert.getDescription() + "\n";
			}
			
			return description;
		}

}
	

