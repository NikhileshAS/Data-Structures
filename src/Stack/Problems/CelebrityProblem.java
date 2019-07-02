package Stack.Problems;

import java.util.*;

class CelebrityProblem
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int N = sc.nextInt();
			int M[][] = new int[N][N];
			for(int i=0; i<N; i++)
			{
				for(int j=0; j<N; j++)
				{
					M[i][j] = sc.nextInt();
				}
			}
		System.out.println();
		System.out.print(new Celebrity().getId(M,N));
		t--;
		}
		sc.close();
	}
}

/*This is a function problem.You only need to complete the function given below*/

class Celebrity
{
    // The task is to complete this function
    
    int getId(int M[][], int n)
    {
        // Your code here
        Stack <Integer> stack = new Stack<Integer>();
        for(int i=0; i<n; i++){
            stack.push(i);
        }
        int a = 0, b = 0;
        while(stack.size() > 1){
            a = stack.pop();
            b = stack.pop();
            if(M[a][b] == 1) stack.push(b);
            else stack.push(a);
        }
        int c = stack.pop();
        System.out.println("c --> "+ c);
        for(int i=0; i<n; i++) if(i != c && ((M[c][i] == 1) || !(M[i][c] == 1))) return -1;
        return c;
    }
}

