package udemyJ47TransientKeyword;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class UJ47MainRead {

	public static void main(String[] args) {

		try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("test1.ser"))) {

			Person person1 = (Person) is.readObject();
			Person person2 = (Person) is.readObject();
			System.out.println(person1);
			System.out.println(person2);
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
