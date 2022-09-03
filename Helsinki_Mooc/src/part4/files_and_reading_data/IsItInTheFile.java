package part4.files_and_reading_data;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/* 날짜 : 2022.09.03
 * 이름 : 조수빈
 * 내용 : 파일 불러오기 및 검색 연습
 */
public class IsItInTheFile {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name of the file: ");
		String name = sc.nextLine();
		System.out.println("Search for: ");
		String search = sc.nextLine();
		
		try(Scanner scanner = new Scanner(Paths.get(name))){
			while(scanner.hasNextLine()) {
				list.add(scanner.nextLine());
			}
			
			if(list.contains(search)) {
				System.out.println("Found!");
			}else {
				System.out.println("Not found.");
			}	
		}	
		catch(Exception e) {
			System.out.println("Reading the file " + name + " failed.");
		}
		
	}
}
