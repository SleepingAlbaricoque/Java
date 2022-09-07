package ch11.object;

/* 날짜 : 2022.09.07
 * 이름 : 조수빈
 * 내용 : clone() 메서드 실습
 */
class Point {
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x = " + x + "," + "y= " + y;
	}
}

class Circle implements Cloneable{
	Point point;
	int radius;
	
	Circle(int x, int y, int radius){
		this.radius = radius;
		point = new Point(x, y);
	}
	
	public String toString() {
		return "원점은 " + point + "이고, " + "반지름은 " + radius + "입니다";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class ObejctCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException{
		Circle circle = new Circle(10, 20, 30);
		Circle copyCircle = (Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copyCircle);
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
	}
}
