import java.util.HashMap;
import java.util.Map;

public class Icecream {
	class Pair {
		Integer x;
		Integer y;
		Pair(Integer x, Integer y) {
			this.x = x;
			this.y = y;
		}
	}

	public Pair findPair(int[] elements, int sum) {
		Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
		for (Integer i = 0; i < elements.length; i++) {
			if (indexMap.containsKey(sum - elements[i])) {
				return new Pair(i, indexMap.get(sum - elements[i]));
			}
			indexMap.put(elements[i], i);
		}
		throw new RuntimeException("No two sum solution.");
	}

	public static void main(String args[]) {
		Icecream ice = new Icecream();
		Pair p = ice.findPair(new int[] { 3, 5, 6, 7, 4, 5 }, 20);
		System.out.println("index 1 =>" + p.x + " index 2 =>" + p.y);
	}
}
