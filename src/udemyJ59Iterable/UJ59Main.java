package udemyJ59Iterable;

public class UJ59Main {

	public static void main(String[] args) {
		UrlLib urlLib = new UrlLib();
		for (String html : urlLib) {
			System.out.println(html.length());
			System.out.println(html);
		}
	}

}
