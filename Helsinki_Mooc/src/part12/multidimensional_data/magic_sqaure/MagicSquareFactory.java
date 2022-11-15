package part12.multidimensional_data.magic_sqaure;

public class MagicSquareFactory {
	public MagicSquare createMagicSquare(int size) {
		MagicSquare square = new MagicSquare(size);
		
		int startingRow = 0;
		int startingCol = (int) Math.floor(size/2);
		square.placeValue(startingRow, startingCol, 1);
		for(int i =2; i <= size * size; i++) {
			startingRow -=1;
			startingCol +=1;
			if(startingRow <0) {
				startingRow = size -1;
			}
			if(startingCol > size -1) {
				startingCol =0;
			}
			
			if(square.readValue(startingRow, startingCol) == 0) {
				square.placeValue(startingRow, startingCol, i);
			}else {
				startingRow +=2;
				startingCol -=1;
				if(startingRow > size -1)
					startingRow -= size;
				if(startingCol <0)
					startingCol = size -1;
				square.placeValue(startingRow, startingCol, i);
			}
		}
		return square;
	}
}
