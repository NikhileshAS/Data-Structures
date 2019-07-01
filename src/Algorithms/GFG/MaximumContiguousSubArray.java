package Algorithms.GFG;

public class MaximumContiguousSubArray {
	
	public static void main(String[] args) {
		int a[] = {-2, -3, 4, -1, -2, 1, 5, -3}; 
		int l = 0, r= a.length-1;
		int sum = 0;
		for(int i=0; i<a.length;i++) sum += a[i];
		while(l<r) {
			if(sum-a[l] > sum) l++;
			else if(sum-a[r] > sum) r--;
			else break;
		}
			
		System.out.println(sum);
		for(int i=l; i<=r; i++) System.out.print(a[i]+" ");
	}
}
