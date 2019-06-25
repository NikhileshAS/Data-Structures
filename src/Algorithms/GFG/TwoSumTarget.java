package Algorithms.GFG;
import java.util.*;
public class TwoSumTarget {
	public static boolean isSecondValuePresent(int[] input, int target, int currentIndex){
		for(int i=0; i<input.length;i++){
            if(i == currentIndex) i++;
            if(input[i] == target) return true;
        };
        return false;
    }
    public static boolean isTargetAchievable(int[] input, int target){
        for(int i=0; i<input.length; i++){
            if(input[i] <= target){
//            	System.out.println("input[i] "+input[i]+" target "+target);
                if(TwoSumTarget.isSecondValuePresent(input, target-input[i], i)){
                    return true;
                }
            }
        }
        return false;
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0 ;i<t; i++){
		    int size = sc.nextInt();
		    int target = sc.nextInt();
		    int input[] = new int[size];
		    for(int j=0; j<size; j++) input[j] = sc.nextInt();
		    System.out.println(TwoSumTarget.isTargetAchievable(input, target)?"Yes":"No");
		}
		sc.close();
		}
	}


