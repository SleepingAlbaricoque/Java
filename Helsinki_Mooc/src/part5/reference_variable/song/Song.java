package part5.reference_variable.song;

/* 날짜 : 2022.09.27
 * 이름 : 조수빈
 * 내용 : 객체 비교 equals 메서드 실습하기
 */
public class Song {
	String title;
	String singer;
	int year;
	
	public Song(String title, String singer, int year) {
		this.title = title;
		this.singer = singer;
		this.year = year;
	}
	
	public String getSinger() {
		return singer;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getYear() {
		return year;
	}
	
	public boolean equals(Object compared) {
		if(this == compared) {
			return true;
		}
		
		if(!(compared instanceof Song)) {
			return false;
		}
		
		Song comparedSong = (Song) compared;
		
		if(this.singer.equals(comparedSong.singer)&&
			this.title.equals(comparedSong.title)&&
			this.getYear() == comparedSong.getYear()) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
		Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
		
		if(jackSparrow.equals(anotherSparrow)) {
			System.out.println("Songs are equal");
		}
	}
}
