package javapractice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Removeduplicatechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Character> charc = new LinkedHashSet<Character>();
		String str = "Ramanji cat mat cat";
		String [] words = str.split("\\s+");

		System.out.println(words);
		for(int i=0;i<=str.length()-1;i++) {
			charc.add(str.charAt(i));
		}

		System.out.println(charc);
		StringBuilder sb = new StringBuilder();
		for(Character c :charc) {
			sb.append(c);
		}
		System.out.println(sb);
	}

}
