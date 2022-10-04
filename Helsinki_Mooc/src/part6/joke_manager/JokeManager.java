package part6.joke_manager;

import java.util.ArrayList;

/* 날짜 : 2022.10.04
 * 이름 : 조수빈
 * 내용 : User Interface와 프로그램 로직 분리 실습
 */
public class JokeManager {
	ArrayList<String> jokes;
	
	public JokeManager() {
		this.jokes = new ArrayList<>();
	}
	
	public ArrayList<String> getJokes() {
		return jokes;
	}
	
	public void addJoke(String joke) {
		jokes.add(joke);
	}
	
	public String drawJoke() {
		int random = (int) Math.floor(Math.random() * jokes.size());
		
		if(jokes.isEmpty())
			return "Jokes are in short supply.";
		else
			return jokes.get(random);
	}
	
	public void printJokes() {
		for(String joke : jokes)
			System.out.println(joke);
	}
	
	public static void main(String[] args) {
		JokeManager manager = new JokeManager();
		manager.addJoke("What is red and smells of blue paint? - Red paint.");
		manager.addJoke("What is blue and smells of red paint? - Blue paint.");

		System.out.println("Drawing jokes:");
		for (int i = 0; i < 5; i++) {
		    System.out.println(manager.drawJoke());
		}

		System.out.println("");
		System.out.println("Printing jokes:");
		manager.printJokes();
	}
}
