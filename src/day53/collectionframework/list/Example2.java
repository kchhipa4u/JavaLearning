package day53.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		
		for(int i=1; i <=10; i++ )
		{
			nums.add(i);
		}
		
		System.out.println(nums);
		
	}
}
