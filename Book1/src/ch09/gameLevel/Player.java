package ch09.gameLevel;

/* 날짜 : 2022.09.01
 * 이름 : 조수빈
 * 내용 : 추상 클래스 활용 예제
 */
public class Player {
	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
