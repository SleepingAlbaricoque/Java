package ch12.generics;

public class GenericMethod {
	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		double left = ((Number)p1.getX()).doubleValue(); // number 클래스로 형 변환하지 않으면 p1의 X가 어떤 형이 확정되지 않은 상태라 doubleValue를 사용 할 수 없음
		double right = ((Number)p2.getX()).doubleValue(); // number 클래스로 형 변환하지 않으면 "doubleValue() method is undefined for the type V"라는 경고 띄움
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
	
	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(10, 10.0);
		
		double rect = GenericMethod.makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect + "입니다");
	}
}
