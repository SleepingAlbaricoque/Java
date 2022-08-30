package part4.files_and_reading_data;

/* 날짜 : 2022.08.30
 * 이름 : 조수빈
 * 내용 : 불러온 텍스트 파일의 내용을 ArrayList에 저장하고, 사용자의 입력값이 해당 ArrayList에 존재하는지 확인하는 프로그램 만들기
 */
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromFile {

	public static void main(String[] args) {
		
		ArrayList<String> lines = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the file name with the ' .txt' format: ");
		String fileName = scanner.nextLine();
		
		try (Scanner sc = new Scanner(Paths.get(fileName))){
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				lines.add(line);
			}
			
			Scanner scTwo = new Scanner(System.in);
				System.out.println("Enter names, an emtpy line quits.");
				while(true) {
				String answer = scTwo.nextLine();
				if(answer.isEmpty()) {
					System.out.println("Thank you!");
					break;
				}
				
				boolean answerTrue = false;
				
				for(int i=0; i<lines.size(); i++) {
					if (answer.compareTo(lines.get(i)) == 0){
						System.out.println("The name is on the list.");
						answerTrue = true;
						break;
					}	
				}
				
				if(!answerTrue) {
					System.out.println("The name is not on the list.");
				}
				
			}
		}
		
		catch(Exception e) {
			System.out.println("Error: " +e.getMessage());
		}
	}
}