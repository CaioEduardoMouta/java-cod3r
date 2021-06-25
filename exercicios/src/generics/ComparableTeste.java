package generics;

import java.util.TreeSet;

public class ComparableTeste {

	public static void main(String[] args) {
		TreeSet<Integer> nums = new TreeSet<>();
		
		nums.add(1);
		nums.add(20);
		nums.add(30);
		nums.add(4);
		nums.add(5);
		nums.add(9);
		nums.add(21);
		nums.add(43);
		nums.add(-12);
		
		for(Integer n:nums) {
			System.out.println(n);
		}
	}
}
