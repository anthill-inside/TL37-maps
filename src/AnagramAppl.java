import java.util.HashMap;
import java.util.Map;

public class AnagramAppl {

	public static void main(String[] args) {
		String word = "electricity";

		System.out.println("++++True++++");
		System.out.println(isAnagram(word, "electric"));
		System.out.println(isAnagram(word, "city"));
		System.out.println(isAnagram(word, "tric"));
		System.out.println(isAnagram(word, "tet"));
		System.out.println(isAnagram(word, "let"));
		System.out.println(isAnagram(word, "tree"));
		System.out.println(isAnagram(word, "critic"));
		System.out.println("++++False++++");
		System.out.println(isAnagram(word, "ellect"));
		System.out.println(isAnagram(word, "tot"));
		System.out.println(isAnagram(word, "select"));
		System.out.println(isAnagram(word, "tet e"));
		System.out.println(isAnagram(word, "teeet"));
		System.out.println(isAnagram(word, " tet"));
		System.out.println(isAnagram(word, "1tet"));
		

	}

	public static boolean isAnagram(String w1, String w2){
		if(w1==null||w2==null)return false;

		Map<Character, Integer> w1Frequencies = new HashMap<>();
		for (Character c : w1.toCharArray()) {
			w1Frequencies.put(c, w1Frequencies.getOrDefault(c, 0) + 1);
		}


		for(Character c :w2.toCharArray()){
			w1Frequencies.put(c,w1Frequencies.getOrDefault(c,0)-1);
			if(w1Frequencies.get(c)<0) return false;
		}


		return true;

	}

}
