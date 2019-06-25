package Algorithms.GFG;
import java.util.*;
public class EliminateCharacters {

public static String result(String s1, String s2){
        
        int count[] = new int[256];
        String ans = "";
        
        for(int i=0; i<s2.length(); i++){
            count[s2.charAt(i)]++;
        }
        
        for(int i=0; i<s1.length(); i++){
            if(count[s1.charAt(i)] == 0) ans += s1.charAt(i);
        }
        
        return ans;
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
		    String s1 = sc.next();
		    String s2 = sc.next();
		    System.out.println(EliminateCharacters.result(s1, s2));
		}
}
}
