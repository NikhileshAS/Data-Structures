package Stack.Problems;

/*package whatever //do not write package name here */

import java.util.Scanner;
import java.util.Stack;


class PostfixEvaluation {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		    String input = sc.next();
		    Stack<Integer> stack = new Stack<Integer>();
		    for(int i=0; i<input.length(); i++){
		        if(Character.isDigit(input.charAt(i))){ 
		            stack.push(Integer.parseInt(String.valueOf(input.charAt(i))));
		        }
		        else{
		            int a = stack.pop();
		            int b = stack.pop();
		            switch(input.charAt(i)){
		                case '+':
		                    stack.push(a+b);
		                    break;
		                case '-':
		                    stack.push(b-a);
		                    break;
		                case '*':
		                    stack.push(a*b);
		                    break;
		                case '/':
		                    stack.push(b/a);
		                    break;
		            }
		        }
		    }
		    System.out.println(stack.pop());
		    t--;
		}
		sc.close();
	}
}
