package part4.objects_in_a_list.personal_information;

/*
 * 날짜 : 2022.08.28
 * 이름 : 조수빈
 * 내용 : ArrayList 입출력 연습
 */
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<PersonalInformation> idList = new ArrayList<>();
		
		while(true) {
			System.out.print("Enter a first name: ");
			String firstName = sc.nextLine();
			if(firstName.isEmpty()) {
				break;
			}
			
			System.out.print("Enter a last name: ");
			String lastName = sc.nextLine();
			
			System.out.print("Enter an ID No.: ");
			String numID = sc.nextLine(); //int로 하려면 입력값에 integer.valueof()해줘야 함; 입력값은 숫자라도 무조건 string이기 때문
			
			idList.add(new PersonalInformation(firstName, lastName, numID));
		}
		
		for(PersonalInformation pi: idList) {
			pi.showInfo();
			
		}
	}
}
