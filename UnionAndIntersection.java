package com.interview;
import java.util.*;

public class UnionAndIntersection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		//String union = union(s1, s2);
		String intersection =  intersection(s1, s2);
		
		if(intersection.equals("0"))
			System.out.println("No intersection elements in given string");
		else
			System.out.println("intersection = "+ intersection);
		//System.out.println("union = "+union);
		
		sc.close();
		
	}
	public static String intersection(String s1, String s2) {
		
		char[]ch1 = s1.toCharArray();
		char [] ch2 = s2.toCharArray();
		boolean isIntersection = false;
		StringBuilder result = new StringBuilder();
		
		for(int i = 0; i < ch1.length; i++) {
			for(int j = 0; j < ch2.length; j++) {
				if(ch1[i] == ch2[j]) {
					isIntersection = true;
				}
			}
			if(isIntersection == true)
				result.append(ch1[i]);
			isIntersection = false;
		}
		
		if(result.length() == 0)
			return "0";
		return result.toString();
	}
	
	public static String union(String s1, String s2) {
		
		char[]ch1 = s1.toCharArray();
		char [] ch2 = s2.toCharArray();
		int i = 0;
		StringBuilder result = new StringBuilder();
		
		char[] res = new char[ch1.length+ch2.length];
		
		for(char ch: ch1)
			res[i++] = ch;
		for(char ch: ch2)
			res[i++] = ch;
		
		for(i = 0; i < ch1.length; i++)
		{
			result.append(res[i]);
			for(int j = 0; j < ch2.length; j++) {
				if(ch1[]) {
					
				}
			}
		}
		
		System.out.println(res);
		
		return null;
	}

}
