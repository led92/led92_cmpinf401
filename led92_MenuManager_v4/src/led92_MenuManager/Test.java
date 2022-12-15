package led92_MenuManager;

public class Test {

	public static void main(String[] args) {
		MenuManager manager = new MenuManager("data/dishes.txt");
		Menu randomMenu = manager.randomMenu("Random Menu");
		System.out.println("Name: " + randomMenu.toString());
		System.out.println("Description: " + "\n" + randomMenu.description());
		System.out.println("\nTotal Calories: " + randomMenu.totalCalories());
		System.out.println("Total Price: $" + randomMenu.totalPrice());
		System.out.println();

		Menu minCaloriesMenu = manager.minCaloriesMenu("Min Calories Menu");
		System.out.println("Name: " + minCaloriesMenu.toString());
		System.out.println("Description: " + "\n" + minCaloriesMenu.description());
		System.out.println("\nTotal Calories: " + minCaloriesMenu.totalCalories());
		System.out.println("Total Price: $" + minCaloriesMenu.totalPrice());
		System.out.println();

		Menu maxCaloriesMenu = manager.maxCaloriesMenu("Max Calories Menu");
		System.out.println("Name: " + maxCaloriesMenu.toString());
		System.out.println("Description: " + "\n" + maxCaloriesMenu.description());
		System.out.println();
		System.out.println("Total Calories: " + maxCaloriesMenu.totalCalories());
		System.out.println("Total Price: $" + maxCaloriesMenu.totalPrice());
	}
}