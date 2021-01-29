package com.interview;
import java.util.*;

public class ArrengeChar {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		StringBuilder num = new StringBuilder();
		StringBuilder s = new StringBuilder();
		
		
		//Arrays.sort(ch);
		
		for(int i = 0; i < ch.length; i++) {
			for(int j = 0; j < ch.length; j++) {
				if(ch[i] < ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] != ' ')
				if(ch[i] >= '0' && ch[i] <= '9')
					num.append(ch[i]);
				
		}
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] != ' ')
				if(ch[i] >= 'a' && ch[i] <= 'z')
					s.append(ch[i]);
					
		}
		
		s.append(num);
		System.out.println(s);
		
		sc.close();
		
	}

}
