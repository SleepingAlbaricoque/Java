package part12.multidimensional_data.magic_sqaure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class MagicSquare {
	private int[][] square;
	
	public MagicSquare(int size) {
		if(size < 2) {
			size =2;
		}
		this.square = new int[size][size];
	}
	
	public ArrayList<Integer> sumsOfRows(){
		ArrayList<Integer> sums = new ArrayList<>();
		
		for(int[] x : square) {
			int sum =0;
			for(int y : x) {
				sum += y;
			}
			sums.add(sum);
		}
		return sums;
	}
	
	public ArrayList<Integer> sumsOfColumns(){
		ArrayList<Integer> sums = new ArrayList<>();
		
		for(int col =0; col < this.square.length; col++) {
			int sum =0;
			for(int row =0; row < this.square.length; row++) {
				sum += square[row][col];
			}
			sums.add(sum);
		}
		return sums;
	}
	
	public ArrayList<Integer> sumsOfDiagonals(){
		ArrayList<Integer> sums = new ArrayList<>();
		
		int leftsum =0;
		int rightsum =0;
		
		for(int row =0; row <this.square.length; row++) {
			for(int col =0; col < this.square.length; col++) {
				if(row == col)
					leftsum += square[row][col];
				if(row + col == this.square.length -1)
					rightsum += square[row][col];
			}
		}
		sums.add(leftsum);
		sums.add(rightsum);
		return sums;
	}
	
	 public boolean isMagicSquare() {
	        return sumsAreSame() && allNumbersDifferent();
	    }

	    public ArrayList<Integer> giveAllNumbers() {
	        ArrayList<Integer> numbers = new ArrayList<>();
	        for (int row = 0; row < square.length; row++) {
	            for (int col = 0; col < square[row].length; col++) {
	                numbers.add(square[row][col]);
	            }
	        }

	        return numbers;
	    }

	    public boolean allNumbersDifferent() {
	        ArrayList<Integer> numbers = giveAllNumbers();

	        Collections.sort(numbers);
	        for (int i = 1; i < numbers.size(); i++) {
	            if (numbers.get(i - 1) == numbers.get(i)) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public boolean sumsAreSame() {
	        ArrayList<Integer> sums = new ArrayList<>();
	        sums.addAll(sumsOfRows());
	        sums.addAll(sumsOfColumns());
	        sums.addAll(sumsOfDiagonals());

	        if (sums.size() < 3) {
	            return false;
	        }

	        for (int i = 1; i < sums.size(); i++) {
	            if (!Objects.equals(sums.get(i - 1), sums.get(i))) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public int readValue(int x, int y) {
	        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
	            return - 1;
	        }

	        return this.square[x][y];
	    }

	    public void placeValue(int x, int y, int value) {
	        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
	            return;
	        }

	        this.square[x][y] = value;
	    }

	    public int getWidth() {
	        return this.square.length;
	    }

	    public int getHeight() {
	        return this.square.length;
	    }

	    @Override
	    public String toString() {
	        StringBuilder result = new StringBuilder();
	        for (int row = 0; row < square.length; row++) {
	            for (int col = 0; col < square[row].length; col++) {
	                result.append(square[row][col]).append("\t");
	            }

	            result.append("\n");
	        }

	        return result.toString();
	    }
}
