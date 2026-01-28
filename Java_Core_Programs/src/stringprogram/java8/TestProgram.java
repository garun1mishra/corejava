package stringprogram.java8;

public class TestProgram {

	public static void main(String[] args) {
		/**
		 * Input : {0,1,0,1,1,0,0,1,0,0} Output : 0000001111
		 */
		int a[] = { 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0 };
		int arr_size = a.length;
		int lo = 0;
		int hi = arr_size - 1;
		int mid = 0, temp = 0;
		// Iterate till all the elements	 are sorted
		while (mid <= hi) {
			switch (a[mid]) {
			// If the element is 0
			case 0: {
				temp = a[lo];
				a[lo] = a[mid];
				a[mid] = temp;
				lo++;
				mid++;
				break;
			}
			// If the element is 1
			case 1:
				mid++;
				break;
			}
		}
		
		for (int i = 0; i < arr_size; i++) System.out.print(a[i] + " "); System.out.println(""); }
}
