package in.design.pattern.structural.bridge;

public interface LinkedList<T> {
	void addFirst(T element);

	T removeFirst();

	void addLast(T element);

	T reomveLast();

	int getSize();

	T removeLast();
}
