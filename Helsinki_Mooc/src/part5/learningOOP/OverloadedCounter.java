package part5.learningOOP;

/* 날짜 : 2022.09.18
 * 이름 : 조수빈
 * 내용 : 메서드 오버로딩 실습
 */
class Counter{
	int startValue;
	
	public Counter(int startValue) {
		this.startValue = startValue;
	}
	
	public Counter() {
		this(0);
	}
	
	public int value() {
		return startValue;
	}
	
	public void increase() {
		startValue += 1;
	}
	
	public void increase(int increaseBy) {
		if(increaseBy >=0) {
			startValue += increaseBy;
		}
	}
	
	public void decrease() {
		startValue -= 1;
	}
	
	public void decrease(int decreaseBy) {
		if(decreaseBy >=0) {
			startValue -= decreaseBy;
		}
	}
	
	@Override
	public String toString() {
		return "" + startValue;
	}
}

public class OverloadedCounter {
	public static void main(String[] args) {
		
		Counter count = new Counter();
		
		count.increase(50);
		count.decrease(30);
		System.out.println(count);
	}
}
