package part4.objects_in_a_list.items;

/* 날짜 : 2022.08.28
 * 이름 : 조수빈
 * 내용 : ArrayList 입출력 연습
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Item> item = new ArrayList<>();
		
		while(true) {
			System.out.println("Enter a name: ");
			String nameInput = sc.nextLine();
			if(nameInput.isEmpty()) {
				break;
			}
			
			item.add(new Item(nameInput));
		}
		
		for(Item itemVar: item) {
			System.out.println(itemVar);
		}
	}
}
