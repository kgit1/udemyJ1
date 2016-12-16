package udemyJ46SerealizingArrays;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class UJ47MainRead {

	public static void main(String[] args) {

		try (FileInputStream fi = new FileInputStream("test.ser")) {
			ObjectInputStream is = new ObjectInputStream(fi);

			Person[] person = (Person[]) is.readObject();
			@SuppressWarnings("unchecked")
			ArrayList<Person> p1 = (ArrayList<Person>) is.readObject();
			@SuppressWarnings("unchecked")
			ArrayList<Person> p2 = (ArrayList<Person>) is.readObject();

			for (Person person2 : person) {
				System.out.println(person2);
			}
			System.out.println("================");
			for (int i = 0; i < person.length; i++) {
				System.out.println(person[i]);
			}

			System.out.println("------AraayLists----");
			for (Person person2 : p1) {
				System.out.println(person2);
			}
			System.out.println("================");
			for (Person person2 : p2) {
				System.out.println(person2);
			}

			System.out.println();
			System.out.println("++++++++++++++");
			int num = is.readInt();
			for (int i = 0; i < num; i++) {
				Person person2 = (Person) is.readObject();
				System.out.println(person2);
			}

			is.close();

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
