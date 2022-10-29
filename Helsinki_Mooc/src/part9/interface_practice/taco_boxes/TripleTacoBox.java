package part9.interface_practice.taco_boxes;

/* 날짜 : 2022.10.21
 * 이름 : 조수빈
 * 내용 : 인터페이스 구현 실습하기
 */
public class TripleTacoBox implements TacoBox{
	private int taco;
	
	public TripleTacoBox() {
		this.taco = 3;
	}

	@Override
	public int tacosRemaining() {
		return taco;
	}

	@Override
	public void eat() {
		if(taco >0)
			taco -= 1;
	}

}
