package ch15.stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("data.txt");
			DataOutputStream dos = new DataOutputStream(fos)){
			dos.writeByte(11);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("Test");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		try(FileInputStream fis = new FileInputStream("data.txt");
			DataInputStream dis = new DataInputStream(fis)){ // read() should be executed in the exact same order write() was executed in 
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
