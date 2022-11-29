package led92_MenuManager;
/**
 * Class Dessert
 * author : Lyndsey Dippold
 * created: 10/14/2022
 */


public class Dessert {


	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	private String description;
	int calories;

	public Dessert(String name, String description, int calories) {

		this.name = name;
		this.description = description;
		this.calories = calories;

	}

}
