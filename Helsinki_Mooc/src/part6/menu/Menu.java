package part6.menu;

import java.util.ArrayList;

/* 날짜 : 2022.09.28
 * 이름 : 조수빈
 * 내용 : list를 멤버 변수로 갖는 클래스 생성 실습
 */
public class Menu {
	
	private ArrayList<String> meals;
	
	public Menu() {
		this.meals = new ArrayList<>();
	}
	
	public void addMeal(String meal) {
		
		if(!this.meals.contains(meal))
			this.meals.add(meal);
	}
	
	public void printMeals() {
		for(String meal : this.meals) {
			System.out.println(meal);
		}
	}
	
	public void clearMenu() {
		for(int i = 0; i < this.meals.size(); i++) {
			this.meals.remove(i--); // 일단 remove(0)으로 시행되고 i--가 되어서 i=-1로 넘겨줌
		}
		
		/* for(int i = this.meals.size() -1; i>=0; i--) {
				this.meals.remove(i)
			}
		*/	
		
		// this.meals.clear() 메서드를 사용하면 보다 간단함
	}
	
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.addMeal("Tofu ratatouille");
		menu.addMeal("Chilli Coconut Chicken");
		menu.addMeal("Chilli Coconut Chicken");
		menu.addMeal("Meatballs with mustard sauce");

		menu.printMeals();
		menu.clearMenu();

		System.out.println();
		menu.addMeal("Tomato and mozzarella salad");
		menu.printMeals();
	}
}
