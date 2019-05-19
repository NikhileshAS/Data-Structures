/**
 * 
 */
package Stack.Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author NikhileshSubramanian
 *
 */
public class Expressions {

	/**
	 * @param args
	 */
	
	
	int priority(char operator) {
		switch(operator) {
			case '+':
			case '-':return 1;
			case '*':
			case '/':return 2;
			case '^':return 3;
			default:return -1;
		}
	}
	
	int operation(int a, int b, char o) {
		switch(o) {
			case '+': return a + b;
			case '-':return a - b;
			case '*': return a * b;
			case '/': 
				if(b==0) {
					throw new UnsupportedOperationException();
				}
				return a / b;
			default: return -1;
		}
	}
	boolean isPrior(char operand1, char operand2) {
		if(operand2 == '(' || operand2 == ')') return false;
		if((operand1 == '*' || operand1 == '/') && (operand2 == '+' || operand2 == '-')) return false;
		return true;		
	}
	public String infixToPostfix(String expression) {
		String result = new String();
		Stack<Character> stack = new Stack<Character>();
		for(char i: expression.toCharArray()) {
			if(Character.isLetterOrDigit(i)) result += i;
			else if(i == '(') stack.push(i);
			else if(i == ')') {
				while(!stack.isEmpty() && stack.peek()!= '(') result += stack.pop();
				stack.pop();
			}
			else {
				while(!stack.isEmpty() && priority(i) <= priority(stack.peek())) result += stack.pop();
				stack.push(i);
			}
		}
		while(!stack.isEmpty()) result += stack.pop();
		return result;
	}
	
	public int evaluate(String expression) {
		Stack<Integer> valuesStack = new Stack<Integer>();
		Stack<Character> operationStack = new Stack<Character>();
		for(int i=0;i<expression.length();i++) {
//			System.out.println("Value Stack -- " + valuesStack + " Operation Stack -- " + operationStack);
			if(expression.charAt(i) == ' ') continue;
			if(expression.charAt(i) >= '0' && expression.charAt(i) <= '9') {
				StringBuffer sb = new StringBuffer();
				while(expression.charAt(i) >= '0' && expression.charAt(i) <= '9' && i < expression.length()) sb.append(expression.charAt(i++));
				valuesStack.push(Integer.parseInt(sb.toString()));	
			}
			if(expression.charAt(i) == '(') operationStack.push(expression.charAt(i));
			if(expression.charAt(i) == ')') {
				while(operationStack.peek() != '(') valuesStack.push(operation(valuesStack.pop(), valuesStack.pop(), operationStack.pop()));
				operationStack.pop();
			}
			if(expression.charAt(i) == '+' || expression.charAt(i) == '*' || expression.charAt(i) == '-' || expression.charAt(i) == '/') {
				while(!operationStack.isEmpty() && isPrior(expression.charAt(i), operationStack.peek())) valuesStack.push(operation(valuesStack.pop(), valuesStack.pop(), operationStack.pop()));
				operationStack.push(expression.charAt(i));
			}
		}
		while(!operationStack.isEmpty()) valuesStack.push(operation(valuesStack.pop(), valuesStack.pop(), operationStack.pop()));
		return valuesStack.pop();
	}
	
	public boolean paranthesisCheck(String expression) {
		Map<Character, Character> paranthesisMap = new HashMap<Character, Character>();
		paranthesisMap.put('(', ')');
		paranthesisMap.put('{', '}');
		paranthesisMap.put('[', ']');
		paranthesisMap.put('<', '>');
		char expectedClose = 'a';
		Stack<Character> paranthesisStack = new Stack<Character>();
		for(int i=0;i<expression.length();i++) {
			System.out.println(paranthesisStack);
			if(paranthesisMap.containsValue(expression.charAt(i))) {
				if(expression.charAt(i) != expectedClose) return false;
				paranthesisStack.pop();
				if(!paranthesisStack.isEmpty())
					expectedClose = paranthesisMap.get(paranthesisStack.peek());
			}
			else if(paranthesisMap.containsKey(expression.charAt(i))) {
				paranthesisStack.push(expression.charAt(i));
				expectedClose = paranthesisMap.get(expression.charAt(i));
			}
		}
		return paranthesisStack.isEmpty();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Expressions exp = new Expressions();
		System.out.println(exp.infixToPostfix("a+b*(c^d-e)^(f+g*h)-i"));
		System.out.println(exp.evaluate("100*(2+12)"));
		System.out.println(exp.paranthesisCheck("{[({(<[]>)})]}"));
	}

}
