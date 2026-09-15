package com.interview;

public class CharacterCompressor {
/*
	Given an array of characters chars, compress it using the following algorithm:

		Begin with an empty string s. For each group of consecutive repeating characters in chars:

		• If the group's length is 1, append the character to s.

		• Otherwise, append the character followed by the group's length.

		The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

		After you are done modifying the input array, return the new length of the array.

		You must write an algorithm that uses only constant extra space.

		 

		Example 1:

		Input: chars = ["a","a","b","b","c","c","c"]

		Output: ["a","2","b","2","c","3"]

		Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".


		Example 2:

		Input: chars = ["a"]

		Output: ["a"]

		Explanation: The only group is "a", which remains uncompressed since it's a single character.

		 

		Example 3:

		Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]

		Output:  ["a","b","1","2"].

		Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".


		Constraints:

		• 1 <= chars.length <= 2000

		• chars[i] is a lowercase English letter, uppercase English letter, digit, or symbol.
*/
     
	public int compress(char[] chars) {
        int write = 0;
        int read = 0;

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            // Count how many times currentChar repeats
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            // Write the character
            chars[write++] = currentChar;

            // If more than 1, convert count to characters and write them
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }

	public static void main(String[] args) {
		
		CharacterCompressor compressor = new CharacterCompressor();

        //char[] chars = {'a','a','b','b','c','c','c'};
        //char[] chars = {'a'};
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int len = compressor.compress(chars);

        // Print the compressed result
        System.out.println("Compressed Length: " + len);
        for (int i = 0; i < len; i++) {
            System.out.print(chars[i]);
        }
	}

}
