package in.design.pattern.creational.singleton;

public class Main {
	public static void main(String[] args) {
		SingletonUsingInner singletonUsingInner1 = SingletonUsingInner.geSingletonUsingInner();
		SingletonUsingInner singletonUsingInner2 = SingletonUsingInner.geSingletonUsingInner();
		System.out.println(singletonUsingInner1 == singletonUsingInner2);
		System.out.println(singletonUsingInner1);
	}
}
