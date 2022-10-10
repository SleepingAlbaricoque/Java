package part7.larger_programming_exercises.recipe_search;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	private ArrayList<Recipe> recipeBook;
	private Scanner sc;
		
	public UserInterface() {
		this.recipeBook = new ArrayList<>();
		this.sc = new Scanner(System.in);
	}
	
	public void start() {
		System.out.print("File to read: ");
		
		String file = sc.nextLine();
		
		try(Scanner scanner = new Scanner(Paths.get(file))){
			
			while(scanner.hasNextLine()) {
				Recipe recipe = new Recipe();
				String name = scanner.nextLine();
				recipe.addToRecipe(name);
				recipe.setName(name);
				
				String time = scanner.nextLine();
				recipe.addToRecipe(time);
				recipe.setTime(time);
				
				while(scanner.hasNextLine()) {
					String row = scanner.nextLine();
				
					if(row != "") {
						recipe.addToRecipe(row);
					}else {
						break;
					}
				}
				recipeBook.add(recipe);
			}	
			
		} catch (Exception e) {
			System.out.println("File doesn't exist");
			return;
		}
		
		System.out.println("Commands: ");
		System.out.println("list - lists the recipes");
		System.out.println("stop - stops the program");
		System.out.println("find name - searches recipes by name");
		System.out.println("find cooking time - searches recipes by cooking time");
		System.out.println("find ingredient - searches recipes by ingredient");
		System.out.println();
		
		while(true) {
			System.out.print("Enter command: ");
			String command = sc.nextLine();
			switch (command) {
				case "list":
					for(Recipe recipe : recipeBook)
						System.out.println(recipe.toString());
					System.out.println();
					break;
					
				case "stop":
					return;
					
				case "find name":
					System.out.print("Searched word: ");
					String name = sc.nextLine();
					for(Recipe recipe : recipeBook) {
						if(recipe.doesContain(name))
							System.out.println(recipe);
					}
					System.out.println();
					break;
					
				case "find cooking time":
					System.out.print("Max cooking time: ");
					int cookingTime = Integer.valueOf(sc.nextLine());
					System.out.println();
					System.out.println("Recipes: ");
					for(Recipe recipe : recipeBook) {
						if(cookingTime >= recipe.getTime())
							System.out.println(recipe);
					}
					System.out.println();
					break;
					
				case "find ingredient":
					System.out.print("Ingredient: ");
					String ingredient = sc.nextLine();
					System.out.println();
					System.out.println("Recipes: ");
					for(Recipe recipe : recipeBook) {
						if(recipe.doesContain(ingredient))
							System.out.println(recipe);
					}
					System.out.println();
					break;
					
				default:
					System.out.println("Invalid command");
			}
		}
	}
}
