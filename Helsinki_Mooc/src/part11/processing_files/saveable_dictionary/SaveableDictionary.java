package part11.processing_files.saveable_dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {
	private Map<String, String> dictionary;
	private String file;
	
	public SaveableDictionary() {
		dictionary = new HashMap<>();
	}
	
	public SaveableDictionary(String file) {
		this();
		this.file = file;
	}
	
	public boolean load() {
		try(Scanner sc = new Scanner(Paths.get(file))){
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] parts = line.split(":");
				
				dictionary.put(parts[0], parts[1]);
			}
			return true;
			
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean save() {
		try {
		PrintWriter writer = new PrintWriter(file);
		
		Map<String, String> alreadySaved = new HashMap<>();
		dictionary.keySet().stream().forEach(word -> {
			if(alreadySaved.containsKey(word)) {
				return;
			}
			
			String pair = word + ":" + dictionary.get(word);
			writer.println(pair);
			
			alreadySaved.put(word, dictionary.get(word));
		});
		writer.close();
		return true;
		
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public void add(String words, String translation) {
		if(!dictionary.containsKey(words))
			dictionary.put(words, translation);
	}
	
	public String translate(String word) {
		if(dictionary.containsKey(word))
			return dictionary.get(word);
		else if(dictionary.containsValue(word)) {
			String result = "";
			
			for(java.util.Map.Entry<String, String> entry : dictionary.entrySet()) {
				if(entry.getValue().equals(word))
					result = entry.getKey();
			}
			return result;
		}
		else
			return null;
	}
	
	public void delete(String word) {
		if(dictionary.containsKey(word))
			dictionary.remove(word);
		else {
			if(dictionary.containsValue(word)) {
				String result = "";
				
				for(java.util.Map.Entry<String, String> entry : dictionary.entrySet()) {
					if(entry.getValue().equals(word))
						result = entry.getKey();
				}
				
				dictionary.remove(result, word);
				
			}
		}
	}
	
	public static void main(String[] args) {
		SaveableDictionary dictionary = new SaveableDictionary("words.txt");
		boolean wasSuccessful = dictionary.load();

		if (wasSuccessful) {
		    System.out.println("Successfully loaded the dictionary from file");
		}

		System.out.println(dictionary.translate("apina"));
		System.out.println(dictionary.translate("ohjelmointi"));
		System.out.println(dictionary.translate("alla oleva"));
		
		dictionary.add("hej", "hi");
		dictionary.add("hallo", "hello");
		dictionary.add("hej", "hola");
		
		dictionary.save();
	}
}
