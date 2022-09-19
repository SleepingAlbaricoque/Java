package part5.learningOOP;

/* 날짜 : 2022.09.18
 * 이름 : 조수빈
 * 내용 : OOP 프로그래밍 실습하기
 */
class ClockHand {
    private int value;
    private int limit;

    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    public void advance() {
        this.value = this.value + 1;

        if (this.value >= this.limit) {
            this.value = 0;
        }
    }

    public int value() {
        return this.value;
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }

        return "" + this.value;
    }
}

class Timer {
	private ClockHand centiSec;
	private ClockHand sec;
	
	public Timer() {
		this.centiSec = new ClockHand(100);
		this.sec = new ClockHand(60);
	}
	
	public void advance() {
		this.centiSec.advance();
		
		if(this.centiSec.value() == 0) {
			this.sec.advance();
		}
	}
	
	public String toString() {
		return sec + ":" + centiSec;
	}
}

public class OneMinute {
	public static void main(String[] args) {
		
		Timer timer = new Timer();
		
		while(true) {
			System.out.println(timer);
			timer.advance();
			
			try {
				Thread.sleep(10);
			} catch(Exception e) {
				
			}
		}
	}
}
