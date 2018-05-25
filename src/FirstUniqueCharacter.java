
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		
		String str = "aabdcce";
		
		System.out.println(firstUnique(str));
	} 
	
	static char firstUnique(String str) {
		
		Map<Character, Integer> map = new LinkedHashMap<>(str.length());
		
		for(char c: str.toCharArray()) {
			map.put(c, map.containsKey(c) ? map.get(c) + 1:1);
		}
		
		for(Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		
		throw new RuntimeException("No result");
	}
	
	
	
}
