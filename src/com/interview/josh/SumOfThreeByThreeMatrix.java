package com.interview.josh;

public class SumOfThreeByThreeMatrix {

	public static int[][] add(int A[][], int B[][], int size) {

		int i, j;
		int c[][] = new int[size][size];
		for (i = 0; i < size; i++) {
			for (j = 0; j < size; j++) {
				c[i][j] = A[i][j] + B[i][j];
			}
		}
		return c;
	}
	public static void printMatrix(int M[][], int rowSize, int columnSize) {

		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < columnSize; j++) {
				System.out.println(M[i][j] + " ");
			}
		}

	}
	public static void main(String[] args) {

	}

}
