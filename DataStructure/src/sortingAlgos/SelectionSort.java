package sortingAlgos;

public class SelectionSort {
	public void sorting(int[] arr) {
		int len = arr.length;
		for(int i = 0; i<len-1; i++) {
			for(int j = i+1;j<len; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {5, 3, 2, 1,4};
		SelectionSort ss = new SelectionSort();
		ss.sorting(arr);
		for(int num : arr) {
			System.out.print(num + " ");
		}
 
	}

}
