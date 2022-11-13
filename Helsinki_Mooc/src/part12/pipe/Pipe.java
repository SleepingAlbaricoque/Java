package part12.pipe;

import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {
	private List<T> pipeList;
	
	public Pipe() {
		this.pipeList = new ArrayList<>();
	}
	
	public void putIntoPipe(T value) {
		pipeList.add(value);
	}
	
	public T takeFromPipe() {
		if(pipeList.isEmpty())
			return null;
		else {
			T value = pipeList.get(0);
			pipeList.remove(0);
			return value;
		}
	}
	
	public boolean isInPipe() {
		if(pipeList.isEmpty())
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		Pipe<String> pipe = new Pipe<>();
		pipe.putIntoPipe("dibi");
		pipe.putIntoPipe("dab");
		pipe.putIntoPipe("dab");
		pipe.putIntoPipe("daa");
		while(pipe.isInPipe()) {
		    System.out.println(pipe.takeFromPipe());
		}
		
		Pipe<Integer> numberPipe = new Pipe<>();
		numberPipe.putIntoPipe(1);
		numberPipe.putIntoPipe(2);
		numberPipe.putIntoPipe(3);

		int sum = 0;
		while(numberPipe.isInPipe()) {
		    sum = sum + numberPipe.takeFromPipe();
		}
		System.out.println(sum);
		System.out.println(numberPipe.takeFromPipe());
	}
}
