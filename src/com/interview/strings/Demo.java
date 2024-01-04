package com.interview.strings;

import java.util.Scanner;
/*
Question # 1
How to attempt?
Question :
Cut and Add
Harry and Potter took a word string. Harry chose a number M (less than the length of the
string) and Potter chose N (less than the length of the string). Harry will cut M alphabets
from the end of the string and then add it to the beginning and will give it to Potter. Then,
Potter will also cut N alphabets from the end of the string, add it to the beginning and ther
give to Harry. This process will continue till they get the original word string back.
For a given string and given values of M and N, find the number of turns in which they will
get the original word string back.
Input Specification:
input1: Original word string
Value of M​
  
 */
public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		int harryCuts = sc.nextInt();
		int	potterCuts = sc.nextInt();

		int iterations = 0;

		String afterCuts = str;

		while (true) {

			iterations++;

			if (shiftString(afterCuts, harryCuts + potterCuts).equals(str)) {

				iterations++;

				break;

			}

			else if (shiftString(afterCuts, harryCuts).equals(str)) {

				break;

			} else if (shiftString(afterCuts, potterCuts).equals(str)) {

				break;

			}

			afterCuts = shiftString(afterCuts, harryCuts + potterCuts);

			iterations++;

		}

		System.out.println(iterations);

	}

	public static String shiftString(String str, int shiftCount) {

		String result;

		result = str.substring(str.length() - shiftCount, str.length()) + str.substring(0, str.length() - shiftCount);
        
		System.out.println("result is :"+result);
		
		return result;

	}

}
