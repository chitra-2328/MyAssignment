package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;


public class UniqueCharacters {

	public static void main(String[] args) {
		String companyName = "google";
		char[] charArray= companyName.toCharArray();
		Set<Character> uniqueset= new LinkedHashSet<Character>();
		for(int i=0; i< charArray.length;i++) {
			uniqueset.add(charArray[i]);
		}
		System.out.println(uniqueset);
			
		}


	}

