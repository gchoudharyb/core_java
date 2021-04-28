package in.design.pattern.creational.singleton;

public class SingletonUsingInnerTest {
	private SingletonUsingInnerTest() {
	}
	
	private static class SingletonUsingInnerTestFactort
	{
		private static  SingletonUsingInnerTest singletonUsingInnerTest = new SingletonUsingInnerTest();
		
		
	}
	public static SingletonUsingInnerTest getSingletonUsingInnerTest() 
	{
		return SingletonUsingInnerTestFactort.singletonUsingInnerTest;
	}
	public static void main(String[] args) {
		SingletonUsingInnerTest innerTest1=SingletonUsingInnerTest.getSingletonUsingInnerTest();
		SingletonUsingInnerTest innerTest2=SingletonUsingInnerTest.getSingletonUsingInnerTest();
		System.out.println(innerTest1==innerTest2);
	}
}
