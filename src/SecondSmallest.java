
public class SecondSmallest {

	public static void main(String[] args) {

		int[] arr = { 5,6,1,2,3,4};

		findSecondSmallest(arr);
	}

	static void findSecondSmallest(int[] arr){
		int first, second;

		int size = arr.length;

		first = second = Integer.MAX_VALUE;

		if (size < 2) {
			
			throw new NullPointerException("Invalid");
		}

		for (int i = 0; i < size; i++) {

			if (arr[i] < first) {
				second = first;
				first = arr[i];
			}

			else if (arr[i] < second && arr[i] != first) {
				second = arr[i];
			}

		}

		if (second == Integer.MAX_VALUE)
			System.out.println("No second lowest");
		else
			System.out.println(second);
	}
}
