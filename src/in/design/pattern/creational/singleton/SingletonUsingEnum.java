package in.design.pattern.creational.singleton;

public class SingletonUsingEnum {
	
	public static void main(String[] args) {
		SingletonUsingEnumRegistery enumRegistery = SingletonUsingEnumRegistery.INSTANCE;
		System.out.println(enumRegistery.getValue());
	}
}

enum SingletonUsingEnumRegistery {
	INSTANCE;
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}