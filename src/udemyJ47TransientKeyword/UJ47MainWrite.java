package udemyJ47TransientKeyword;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class UJ47MainWrite {

	public static void main(String[] args) {
		System.out.println("Writing objects...");

		

		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test1.ser"))) {
			
			Person person1 = new Person(22,"Bob");
			Person.setCounter(223);
			Person person2 = new Person(62,"Sue");
			
			os.writeObject(person1);
			os.writeObject(person2);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
