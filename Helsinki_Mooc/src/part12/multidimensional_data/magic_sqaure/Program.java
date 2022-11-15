package part12.multidimensional_data.magic_sqaure;

public class Program {
	public static void main(String[] args) {
		MagicSquareFactory square = new MagicSquareFactory();
		MagicSquare ms = square.createMagicSquare(3);
		System.out.println(ms);
		System.out.println(ms.sumsAreSame());
	}
	
}
