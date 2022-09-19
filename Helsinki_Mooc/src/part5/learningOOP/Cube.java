package part5.learningOOP;

/* 날짜 : 2022.09.18
 * 이름 : 조수빈
 * 내용 : Cube 클래스 만들기 실습
 */
class Cube {
	int edgeLength;
	
	public Cube(int edgeLength) {
		this.edgeLength = edgeLength;
	}
	
	public int volume() {
		return edgeLength * edgeLength * edgeLength;
	}
	
	public String toString() {
		return "The length of the edge is " + edgeLength + " and the volume " + volume();
	}
}
