package com.interview.josh;

@FunctionalInterface
interface Addable {
	abstract int add(int a, int b);
}

public class CreateFunctionalInterfaeAndApplyUsingLamdaExpression implements Addable {

	// implementing using lamda expression
	Addable ad2 = (int a, int b) -> {
		return (a + b);
	};

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {

	}

}
