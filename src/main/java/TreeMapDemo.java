import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String, String> scores = new TreeMap<String, String>();//sorted ,put, get
		scores.put("Ridhi", "95");
		scores.put("Isha", "86");
		System.out.println(scores);
		
		Map<String, String> scores1 = new HashMap<String, String>(); //not sorted
		scores1.put("Ridhi", "95");
		scores1.put("Isha", "86");
		System.out.println(scores1);
	}
}
