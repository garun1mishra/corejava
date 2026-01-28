package newupdate.garun;

import java.util.*;

/**
 * @ProgramExample: Input: arr[] = {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12} Output: 3
 *                  3 3 3 2 2 2 12 12 4 5 Explanation : No. Freq 2 : 3 3 : 4 4 :
 *                  1 5 : 1 12 : 2
 * 
 *                  Input: arr[] = {4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5}
 *                  Output: 2 2 2 2 1 1 3 3 4 4 5 6 7
 * 
 * 
 */

public class SortArrayAsNumberOfFrequency {
	public static void main(String a[]) {
		int[] array = { 4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5 };
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> outputArray = new ArrayList<>();
		for (int current : array) {
			int count = map.getOrDefault(current, 0);
			map.put(current, count + 1);
			outputArray.add(current);
		}
		SortComparator comp = new SortComparator(map);
		Collections.sort(outputArray, comp);
		for (Integer i : outputArray) {
			System.out.print(i + " ");
		}
	}
}

class SortComparator implements Comparator<Integer> {
	private final Map<Integer, Integer> freqMap;

	SortComparator(Map<Integer, Integer> tFreqMap) {
		this.freqMap = tFreqMap;
	}

	@Override
	public int compare(Integer k1, Integer k2) {
		int freqCompare = freqMap.get(k2).compareTo(freqMap.get(k1));
		int valueCompare = k1.compareTo(k2);
		return (freqCompare == 0) ? valueCompare : freqCompare;
	}
}
