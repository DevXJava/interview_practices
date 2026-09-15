package com.interview.all;

public class Testcrymsonlogic1 {

	public static void findDuplicatesOccurance(String string) {		
    char[] ch = string.toCharArray();
    for (int i = 0; i < ch.length; i++) {
        boolean alreadyVisited = false;
        // Check whether this character appeared earlier
        for (int k = 0; k < i; k++) {
            if (ch[k] == ch[i]) {
                alreadyVisited = true;
                break;
            
        }

        if (alreadyVisited) {
            continue;
        }

        int count = 1;
        for (int j = i + 1; j < ch.length; j++) {

            if (ch[i] == ch[j]) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println(ch[i] + " : " + count);
        }

	}

	public static void main(String[] args) {
		String string = new Testcrymsonlogic1().solution("codility");

		System.out.println(string);

	}

}
