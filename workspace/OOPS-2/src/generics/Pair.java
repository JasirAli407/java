package generics;

public class Pair<T, S> {

	private T first;
	private S second;

	public Pair() {
	}

	public Pair(T first, S second) {
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return this.first;
	}

	public T setFirst(T first) {
		return this.first = first;
	}

	public S getSecond() {
		return this.second;
	}

	public S setSecond(S second) {
		return this.second = second;
	}

}
