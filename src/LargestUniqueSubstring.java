import java.util.HashSet;

public class LargestUniqueSubstring {

	public static void main(String[] args) {
		
		String str = "aaabcbdeaf";
		
		findUnique(str);
	}
	
	static void findUnique(String str) {
		
		if(str == null || str.length() == 0) {
			throw new NullPointerException();
		}
		
		int result =0;
		int k =0;
		
		HashSet<Character> set = new HashSet<>();
		
		for(int i =0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(!set.contains(c)) {
				set.add(c);
				result = Math.max(result, set.size());
			}
			else {
				while(k<i) {
					if(str.charAt(i) == c) {
						k++;
						break;
					}else {
						set.remove(str.charAt(k));
						k++;
					}
				}
			}
		}
		System.out.println(set);
	}
}
