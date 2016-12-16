package udemyJString;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainTest {

	public static void main(String[] args) {
		String str = new String("qqqqwweeeeeeeeerrrttttttttttyyyuuiiiiiiiiiiiiooooiiuyttttttttttrewqwertewrtrew");
		// duplicateRemover(str);
		System.out.println(duplicateRemover(str));
		System.out.println(duplicateRemover1(str));
		System.out.println(duplicateRemover2(str));

	}

	public static String duplicateRemover(String str) {
		char[] c = str.toCharArray();
		int counter = 0;
		for (int i = 1; i < c.length - counter; i++) {
			// System.out.println(c);
			// System.out.println(c.length);
			for (int j = i + 1; j < c.length - counter; j++) {
				if (c[i] == c[j] && c[i] != '8') {
					// System.out.println("---c[i] = " + c[i] + i + " c[j] = " +
					// c[j] + j);
					// c[j]='8';
					for (int k = j; k < c.length - 1 - counter; k++) {
						// System.out.println("c[k] = " + c[k] + " c[k + 1] = "
						// + c[k + 1]);
						c[k] = c[k + 1];
					}
					// System.out.println(c);
					// System.out.println(counter);
					if (i != 0) {
						i--;
					}
					// i--;
					counter++;
				}
			}
		}
		String s = new String(c);
		// System.out.println(s);
		if (s.charAt(0) == s.charAt(1)) {
			// System.out.println("here");
			return s.substring(1, s.length() - counter);
		}
		return s.substring(s.length() - counter);
	}

	public static String duplicateRemover1(String str) {
		char[] c = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < c.length; i++) {
			if (sb.indexOf(Character.toString(c[i])) < 0) {
				sb.append(Character.toString(c[i]));
			}
		}
		return sb.toString();
	}
	
	public static String duplicateRemover2(String str){
		
		Set <Character >unduplicate = new LinkedHashSet<>();
		for(int i =0;i<str.length();i++){
			unduplicate.add(str.charAt(i));
		}
		StringBuilder sb = new StringBuilder();
		for (Character c : unduplicate) {
			sb.append(c);
		}		
		return sb.toString();
	}

}
