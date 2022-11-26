package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 1, 3, 2, 5};
				Map<Integer, Integer> occ=new LinkedHashMap<Integer, Integer>();
				for(int i=0; i<nums.length; i++) {
					if(occ.containsKey(nums[i])) {
						int value =occ.get(nums[i]);
						occ.put(nums[i], value+1);
					}
					else {
						occ.put(nums[i],1);
						
					}}
				System.out.println(occ);
		}

	}


