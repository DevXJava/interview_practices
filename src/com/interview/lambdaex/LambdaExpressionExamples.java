package com.interview.lambdaex;

interface Drawable{
	public void draw();
}
@FunctionalInterface
interface Drawables{
	void paint();
	
}
@FunctionalInterface
interface Stringstest {
	String strings();
}
@FunctionalInterface
interface strs{
	public String hello(String str);
}

public class LambdaExpressionExamples {

	public static void main(String[] args) {
		// without lambda expression 
		int width = 10;
		Drawable drawable = new Drawable() { //anonymous object
			@Override
			public void draw() {
			System.out.println("drawable  width --"+width);		
			}
		};
		drawable.draw();
		// with lambda expression 
		 
		Drawables drawables = () -> { // giving definitions 
			System.out.println(" drawables with lambdas --"+width);
		};
		drawables.paint();
		
		Stringstest stringstest = ()->{
			return "testing strings ";
		};
		System.out.println(stringstest.strings());
		
		strs strs = (str)->{
			return "hello   " +str;
		};
		
		System.out.println(strs.hello("Hello Devendra Rahangdale"));
		// we can declare using bracket also
		strs strsbarcket =str->{
			return "hello   " +str;
		};
		System.out.println(strsbarcket.hello("Hello Devendra Rahangdale"));
		
		
	}
}
