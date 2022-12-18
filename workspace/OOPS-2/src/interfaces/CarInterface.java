package interfaces;

public interface CarInterface {

	//	double PI = 3.14;
	/*
	 * PI variable is already present in vehicle interface; and vehicle interface and car interface is
	 * implemented by car class; it will clash when try to call that will generate error
	 */

	int numGears();
}
