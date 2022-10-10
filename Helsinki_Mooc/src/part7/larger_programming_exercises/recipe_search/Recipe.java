package part7.larger_programming_exercises.recipe_search;

import java.util.ArrayList;

/* 날짜 : 2022.10.10
 * 이름 : 조수빈
 * 내용 : 레시피 파일을 읽어 들이고, 이 파일에서 특정 레시피를 찾아 반환하는 프로그램 만들기
 */
public class Recipe {
	private ArrayList<String> recipe;
	private String name;
	private String time;
	
	public Recipe() {
		this.recipe = new ArrayList<>();
		this.name = "";
		this.time = "";
	}
	
	public ArrayList<String> getRecipe() {
		return recipe;
	}
	
	public String getName() {
		return name;
	}
	
	public int getTime() {
		return Integer.valueOf(time);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return name + ", cooking time: " + time;
	}
	
	public void addToRecipe(String row) {
		recipe.add(row);
	}
	
	public boolean doesContain(String name) {
		if(this.name.contains(name))
			return true;
		
		return false;
	}
}
