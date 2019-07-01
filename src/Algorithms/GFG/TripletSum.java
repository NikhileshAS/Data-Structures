package Algorithms.GFG;

public class TripletSum {

	public static int partition(int[] array, int low, int high) {
	int i = low-1;
	for(int j = low; j < high; j++) {
		if(array[j] <= array[high]) {
			i++;
			int temp = array[j];
			array[j] = array[i];
			array[i] = temp;
		}
	}
	int temp = array[i+1];
	array[i+1] = array[high];
	array[high] = temp;
	return i+1;
	
	}
	public static void sort(int[] array, int low, int high) {
		if(low < high) {
			int pivot = partition(array, low, high);
			sort(array, low, pivot-1);
			sort(array, pivot+1, high);
		}
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {6,34,6,98,36,9,73,1,62};
		int target = 43;
		int ans1 = 0, ans2 = 0 , ans3 = 0;
		sort(a, 0, a.length-1);
		
		for(int i=0;i<a.length-1; i++) {
			int targetValue = 0;
			if(a[i] < target) targetValue = target - a[i];
			else break;
			int l = i+1, r = a.length-1;
			while(l < r) {
				if(a[l] + a[r] == targetValue) {
					ans1 = a[i];
					ans2 = a[l];
					ans3 = a[r];
					System.out.print(ans1+" "+ ans2+" "+ ans3);
					return;
				}
				else if(a[l] + a[r] < targetValue) l++;
				else r--;
			}
		}
		
		
	}

}
