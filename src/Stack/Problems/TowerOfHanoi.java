package Stack.Problems;

public class TowerOfHanoi {
	static void towerOfHanoi(int n, char from, char to,char aux) {
		if(n == 1) {
			System.out.println("Move disk 1 from rod " +  from + " to rod " + to); 
			return;
		}
		towerOfHanoi(n-1, from, aux, to);
        System.out.println("Move disk " + n + " from rod " +  from + " to rod " + to); 
		towerOfHanoi(n-1, aux, to, from);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		towerOfHanoi(3, 'A', 'C', 'B');
	}

}
