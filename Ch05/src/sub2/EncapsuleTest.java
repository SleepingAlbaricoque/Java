package sub2;

/* 날짜 : 2022.08.24
 * 이름 : 조수빈
 * 내용 : Java 캡슐화(정보은닉) 실습하기
 * 
 * 캡슐화(Encapsulation)
 * - 캡슐화는 객체의 속성(필드)을 외부에서 참조하지 못하도록 객체의 정보를 은닉하는 특성
 * - 클래스의 속성은 반드시 private 선언을 통해 캡슐화 해야한다
 * - 은닉된 정보의 안전한 참조를 위해 Getter, Setter를 정의할 수 있다(optional)
 */
public class EncapsuleTest {

	public static void main(String[] args) {
		
		// 객체 생성 및 초기화
		Car sonata = new Car("소나타","흰색", 0);
		
		// 초기화는 이제 할 필요 없음
		//sonata.name = "소나타";
		//sonata.color = "흰색";
		//sonata.speed = 0;
		
		
		// Setter를 통한 속성 변경 <- 정보 캡슐화로 여기서 직접 sonata.name = "은색"; 할 수 없음
		sonata.setColor("은색");
		System.out.println(sonata.getName());
		
		// 기능
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		// account
		Account kb = new Account("국민은행", "1", "김김김", 100000);
		
		kb.deposit(100000);
		kb.withdraw(50000);
		kb.show();
	}
}
