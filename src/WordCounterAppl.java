import java.util.*;
import java.util.Map.Entry;

public class WordCounterAppl {

	public static void main(String[] args) {
		String str = "jhgjghj tyrh sdsd, tyrh egdf jhgjghj erewf sdsd egdf yuiyuu tyrh";
		displayWordCount(str);

	}

	private static void displayWordCount(String str) {
		String[] words = str.split("[^A-Za-z]+");// "\\P{L}+"
		Map<String, Integer> res = new HashMap<>();
		for (String w : words) {
			if (w.isEmpty())
				continue;
			res.put(w, res.getOrDefault(w, 0) + 1);
		}
		System.out.println(res);

		List<Map.Entry<String, Integer>> list = new ArrayList<>(res.entrySet());
		list.sort(new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				int res = Integer.compare(o2.getValue(), o1.getValue());
				return res != 0 ? res : o1.getKey().compareTo(o2.getKey());
			}
		});
		for (Entry<String, Integer> e : list) {
			System.out.printf("%s -> %d\n", e.getKey(), e.getValue());
		}
	}

}
