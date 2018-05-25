import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MedalTally {

	static Integer[][] medals = new Integer[3][3];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter medal tally: ");
		
		for(int i =0; i<3; i++) {
			for(int j =0; j<3; j++) {
				medals[i][j] = sc.nextInt();
			}
		}
		
		
		
		if(medals[0][0] == medals[1][0] || medals[0][0] == medals[2][0] || medals[1][0] == medals[2][0]) {
		
			Arrays.sort(medals, new Comparator<Integer[]>() {
				@Override
				public int compare(Integer[] o1, Integer[] o2) {
					// TODO Auto-generated method stub
					
					Integer silver1 = o1[1];
					Integer silver2 = o2[1];
					return silver1.compareTo(silver2);
				}
			});
			displayArray();
		}
		
		else if(medals[0][1] == medals[1][1] || medals[0][1] == medals[2][1] || medals[1][1] == medals[2][1]) {
			
			Arrays.sort(medals, new Comparator<Integer[]>() {
				@Override
				public int compare(Integer[] o1, Integer[] o2) {
					// TODO Auto-generated method stub
					
					Integer bronze1 = o1[2];
					Integer bronze2 = o2[2];
					
					return bronze1.compareTo(bronze2);
				}
			});
			displayArray();
		}
		
		else 
		{
			Arrays.sort(medals, new Comparator<Integer[]>() {
				
				@Override
				public int compare(Integer[] o1, Integer[] o2) {
					// TODO Auto-generated method stub
					
					Integer gold1 = o1[0];
					Integer gold2 = o2[0];
					return gold1.compareTo(gold2);
				}
			});
			displayArray();
		}
	}
	
	private static void displayArray() {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Gold\t\tSilver\t\tBronze");
		
		for(int i =0; i<medals.length; i++) {
			Integer[] medalTally = medals[i];
			System.out.println(medalTally[0] + "\t\t" + medalTally[1] + "\t\t" + medalTally[2]);
		}
		
		System.out.println("-------------------------------------------------------------------------");
	}

}
