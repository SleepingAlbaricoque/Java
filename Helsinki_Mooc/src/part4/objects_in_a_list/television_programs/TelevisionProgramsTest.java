package part4.objects_in_a_list.television_programs;

/* 날짜 : 2022.08.28
 * 이름 : 조수빈
 * 내용 : ArrayList 조건 따라 입출력 연습
 */
import java.util.ArrayList;
import java.util.Scanner;

public class TelevisionProgramsTest {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<TelevisionProgram> progList = new ArrayList<>();
	
	while(true) {
		System.out.print("Enter a name: ");
		String name = sc.nextLine();
		if (name.isEmpty()) {
			break;
		}
		
		System.out.print("Enter the duration: ");
		int duration = Integer.valueOf(sc.nextLine());
		
		progList.add(new TelevisionProgram(name, duration));
	}
	System.out.println("Program's maximum duration?: ");
	int max = Integer.valueOf(sc.nextInt());
	
	for(int i =0; i < progList.size(); i++) {
		TelevisionProgram prog = progList.get(i);
		if(prog.getDuration() <= max) {
			prog.showInfo();
		}
	}
	
	}
}
