package udemyJ46SerealizingArrays;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class UJ47MainWrite {

	public static void main(String[] args) {
		System.out.println("Writing objects...");
		
		Person[] person = {new Person(29,"Sue"),new Person(99,"Mike"),new Person(128,"Bob")};
		
//		ArrayList<Person> personArr = new ArrayList<>();
//		personArr = (ArrayList<Person>) (Arrays.asList(person));
		
		ArrayList<Person> personArr1 = new ArrayList<>(Arrays.asList(person));;
		
		ArrayList<Person> personArr2 = new ArrayList<>();
		personArr2.add(new Person(44,"O'Brien"));
		personArr2.add(new Person(23,"Kirk"));
		personArr2.add(new Person(8,"Shin"));
		personArr2.add(new Person(98,"Kiki"));
		personArr2.add(new Person(56,"Leon"));
		personArr2.add(new Person(11,"Abr"));
		
		try (FileOutputStream fs = new FileOutputStream("test.ser")) {
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			
			os.writeObject(person);
//			os.writeObject(personArr);
			os.writeObject(personArr1);
			os.writeObject(personArr2);
			
			//zapisivaem masiiv po elementno - zapisav sna4ala ego razmer,
			//a potom zakidivaya elementi v ya4eiki
			os.writeInt(personArr2.size());
			for(Person person2 : personArr2){
				os.writeObject(person2);
			}
			
			
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
