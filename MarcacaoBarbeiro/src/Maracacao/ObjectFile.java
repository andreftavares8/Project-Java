package Maracacao;

import java.io.*;

public class ObjectFile {
	
	static String file = null;
			
	public ObjectFile(String filename) {
		file = filename;
	}

	// Write objects
	public void writeObjectFile(Object objectList) {
		try {
			FileOutputStream fout = new FileOutputStream(file);
			ObjectOutputStream oout = new ObjectOutputStream( fout );
			oout.writeObject(objectList);
			oout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Read objects
	public static Object readObjectFile() {
		Object allEntry = new Object();
		try {
			FileInputStream fin = new FileInputStream(file);
			ObjectInputStream oin = new ObjectInputStream( fin );
			allEntry = oin.readObject();
			oin.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return allEntry;
	}
}
