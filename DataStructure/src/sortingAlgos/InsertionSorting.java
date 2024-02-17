package sortingAlgos;

public class InsertionSorting {

	public void sorting(int[] arr) {
		int len = arr.length;
		for (int i = 1; i < len; i++) {
			int temp = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				j--;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {5,3,1,2,4};
		for ( int num : arr) {
			System.out.print(num+",");
		}
		InsertionSorting is = new InsertionSorting();
		is.sorting(arr);
		System.out.println();
		
		for(int num : arr) {
			System.out.print(num+" ");
		}
			
	}

}
