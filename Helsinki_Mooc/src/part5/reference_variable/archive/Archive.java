package part5.reference_variable.archive;

/* 날짜 : 2022.09.27
 * 이름 : 조수빈
 * 내용 : List에서 equals, contains 메서드를 사용하여 요소 비교 실습하기
 */
public class Archive {
	String identifier;
	String name;
	
	public Archive(String identifier, String name) {
		this.identifier = identifier;
		this.name = name;
	}
	
	public boolean equals(Object compared) {
		if(this == compared)
			return true;
		
		if(!(compared instanceof Archive))
			return false;
		
		Archive archive = (Archive) compared;
		
		if(this.identifier.equals(archive.identifier)||
			this.name.equals(archive.name))
			return true;
		
		return false;
		
	}
	
	@Override
	public String toString() {
		return identifier + ": " + name;
	}
}
