package part8.hash_map1.i_owe_you;

import java.util.HashMap;

/* 날짜 : 2022.10.13
 * 이름 : 조수빈
 * 내용 : primitive-Wrapper 타입 변환 실습하기
 */
public class IOU {
	HashMap<String, Double> creditors;
	
	public IOU() {
		this.creditors = new HashMap<>();
	}
	
	public void setSum(String toWhom, double amount) {
		creditors.put(toWhom, amount);
	}
	
	public double howMuchDoIOweTo(String toWhom) {
		return creditors.getOrDefault(toWhom, 0.0);
	}
	
	public static void main(String[] args) {
		IOU mattsIOU = new IOU();
		mattsIOU.setSum("Arthur", 51.5);
		mattsIOU.setSum("Michael", 30);

		System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
		System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
	}
}
