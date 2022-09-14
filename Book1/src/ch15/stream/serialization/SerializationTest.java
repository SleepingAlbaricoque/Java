package ch15.stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* 날짜 : 2022.09.14
 * 이름 : 조수빈
 * 내용 : 직렬화 실습하기
 */
class Person implements Serializable{
	private static final long serialVersionUID = 204086479656258039L;
	String name;
	transient String job;
	
	public Person() {}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + ", " + job;
	}
}

public class SerializationTest {
	public static void main(String[] args) throws ClassNotFoundException{
		Person personAhn = new Person("안재용", "대표이사");
		Person personKim = new Person("김철수", "상무이사");
		
		try(FileOutputStream fos = new FileOutputStream("serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(personAhn);
			oos.writeObject(personKim);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		try(FileInputStream fis = new FileInputStream("serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
