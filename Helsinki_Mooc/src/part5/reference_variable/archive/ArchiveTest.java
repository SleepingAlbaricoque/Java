package part5.reference_variable.archive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArchiveTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Archive> list = new ArrayList<>();
		
		while(true) {
		System.out.print("Identifier? (empty will stop)");
		String identifier = sc.nextLine();
		if(identifier.isEmpty())
			break;
		
		System.out.print("Name? (empty will stop)");
		String name = sc.nextLine();
		if(name.isEmpty())
			break;
		
		Archive archive = new Archive(identifier, name);
		if(!list.contains(archive))
			list.add(archive);
		}
		
		System.out.println("==items==");
		for(Archive archive: list) {
			System.out.println(archive);
		}
	}
}
