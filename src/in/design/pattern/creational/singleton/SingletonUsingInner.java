package in.design.pattern.creational.singleton;

public class SingletonUsingInner {

	private SingletonUsingInner() {
		// TODO Auto-generated constructor stub
	}

	private static class SingletonUsingInnerFactory {
		static SingletonUsingInner INSTANCE = new SingletonUsingInner();

	}

	public static SingletonUsingInner geSingletonUsingInner() {
		return SingletonUsingInnerFactory.INSTANCE;
	}
}
