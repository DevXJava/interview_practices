package com.interview.javaconceptoftheday.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortSingleLineTextFile {

	public static void main(String[] args) {
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		// Create an ArrayList object to hold the lines of input file
		ArrayList<String> lines = new ArrayList<>();
		try {
			bufferedReader = new BufferedReader(
					new FileReader("D:\\stswrkspaces\\wrk_spc1\\interview_practices\\src\\input.txt"));
			String currentLine = bufferedReader.readLine();
			while (currentLine != null) {
				lines.add(currentLine);
				currentLine = bufferedReader.readLine();
			}
			// sorting the ArrayList
			Collections.sort(lines);
			// creating BufferedWriter object to write into output file
			bufferedWriter = new BufferedWriter(
					new FileWriter("D:\\stswrkspaces\\wrk_spc1\\interview_practices\\src\\inputSingle.txt"));

			for (String line : lines) {
				bufferedWriter.write(line);
				bufferedWriter.newLine();

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}

				if (bufferedWriter != null) {
					bufferedWriter.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
