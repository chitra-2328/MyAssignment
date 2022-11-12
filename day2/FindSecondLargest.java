package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] values = new int [6];
		values[0]=3;//2
		values[1]=2;//3
		values[2]=11;//4
		values[3]=4;//6
		values[4]=6;//7
		values[5]=7;//11
		int size =values.length;
        Arrays.sort(values);
        int secondvalue=values[size-2];
       System.out.println(+secondvalue);
       
	}
}
