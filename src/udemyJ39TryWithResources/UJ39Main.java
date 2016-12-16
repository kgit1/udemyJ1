package udemyJ39TryWithResources;
class Temp implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Closing..");
		throw new Exception("oh no");
		
	}
	
}
public class UJ39Main {

	public static void main(String[] args) {
//		File file = new File("text2.txt");
		try(Temp temp = new Temp()){
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
