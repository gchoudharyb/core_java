package in.design.pattern.creational.prototype;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		ConnectionClass connectionClass = new ConnectionClass(new StringBuffer("Helllo"));
		System.out.println(connectionClass);
		System.out.println(connectionClass.clone());
		System.out.println(connectionClass);
		System.out.println(connectionClass.clone().hashCode()==connectionClass.hashCode());
	}
}
