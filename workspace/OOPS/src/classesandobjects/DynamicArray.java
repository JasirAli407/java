package classesandobjects;

public class DynamicArray {

	private int[] data;
	private int nextElementIndex;

	public DynamicArray() {
		data = new int[5];
		nextElementIndex = 0;
	}

	public int size() {
		return nextElementIndex;
	}

	public int get(int i) {
		if (i >= nextElementIndex) {
			return -1;
		}
		return data[i];
	}

	public boolean isEmpty() {
		return nextElementIndex == 0;
	}

	public void set(int i, int num) {
		if (i > nextElementIndex) {
			return;
		}
		data[i] = num;
	}

	private void doubleCapacity() {

		int[] temp = data;
		data = new int[temp.length * 2];

		for (int i = 0; i < temp.length; ++i) {
			data[i] = temp[i];

		}
	}

	public void addAtLastIndex(int num) {
		if (nextElementIndex == data.length) {
			doubleCapacity();
		}
		data[nextElementIndex] = num;
		nextElementIndex++;
	}

	public int removeLastIndex() {
		if (nextElementIndex == 0) {
			return -1;
		}
		int temp = data[nextElementIndex - 1];
		nextElementIndex--;
		return temp;
	}

}
