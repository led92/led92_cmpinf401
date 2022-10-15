package led92_MenuManager;
/**
 * Class MenuTest
 * author : Lyndsey Dippold
 * created: 10/14/2022
 */

public class MenuTest {

	public static void main(String[] args) {
		Entree pasta = new Entree("Pasta", "A plate of pasta", 300);
		Entree chicken = new Entree("Chicken", "A grilled chicken breast", 100);
		Side mashedPotatoes = new Side("Mashed Potatoes", "A Scoop of mashed potatoes", 200);
		Salad caesar = new Salad("Caesar Salad", "A caesar salad", 100);
		Salad garden = new Salad("Garden Salad", "Garden salad with italian dressing", 50);
		Dessert cheesecake = new Dessert("Cheesecake", "New York Style Cheesecake", 1000);
		
		Menu menu1 = new Menu("Menu 1", pasta, mashedPotatoes);
		Menu menu2 = new Menu("Full Menu", chicken, mashedPotatoes, caesar, cheesecake);
		
		System.out.println("Menu 1 Calories: " + menu1.totalCalories());
		System.out.println("Menu 1 Description: " + "\n" + menu1.description());
		System.out.println("Menu 2 Calories: " + menu2.totalCalories());
		System.out.println("Menu 2 Description: " + "\n" + menu2.description());
	}

}
