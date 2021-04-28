package in.design.pattern.structural.bridge;

public interface FifoCollection<T> {
	void offer(T element);

	T poll();
}
