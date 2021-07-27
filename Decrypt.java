import java.util.Random;

public class Decrypt {
	
	public static void main(String[] args) {
		String cyphertext = "uhixanqcrpgimldeqrpkftzzr";
		
		int key = 123;
		Random r = new Random(key);
		
		String plaintext = "";
		
		for(int i = 0; i < cyphertext.length(); i++) {
			plaintext += decrypt(cyphertext.charAt(i), Math.abs(r.nextInt()) % 26);
			
		}
		
		System.out.println(plaintext);
	}
	
	public static char decrypt(char c, int shift) {
		int x = c - 'a';
		
		x -= shift;
		
		x = Math.floorMod(x, 26);
		x += 'a';
		
		return (char) x;
	}
	
}
