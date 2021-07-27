import java.util.Random;

public class Encrypt {

	public static void main(String[] args) {
		int key = 123;
		Random r = new Random(key);
		String plaintext = "hellofromtheencryptedside";
		String encrypted = "";
		
		for(int i = 0; i < plaintext.length(); i++) {
			encrypted += cipher(plaintext.charAt(i), Math.abs(r.nextInt()) % 26);
			
		}
		
		System.out.println(encrypted);
	}
	
	public static char cipher(char c, int shift) {
		int x = c - 'a';
		
		x += shift;
		
		x %= 26;
		x += 'a';
		
		return (char) x;
	}

}
