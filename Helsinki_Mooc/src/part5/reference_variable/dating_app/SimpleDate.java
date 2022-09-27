package part5.reference_variable.dating_app;

/* 날짜 : 2022.09.27
 * 이름 : 조수빈
 * 내용 : 객체를 반환하는 메서드 실습
 */
public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
            this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance() {
    	if(day == 30) {
    		day = 0;
    		month += 1;
    		
    		if(month == 12) {
    			month = 1;
    			year += 1;
    		}
    	}else {
    		day += 1;
    	}
    }
    
    public void advance(int howManyDays) {
    	if(day + howManyDays > 30) {
    		day = day + howManyDays - 30;
    		month += 1;
    		
    		if(month == 12) {
    			month = 1;
    			year += 1;
    		}
    	}else {
    		day += howManyDays;
    	}
    }
}
