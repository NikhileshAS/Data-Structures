package Algorithms.GFG;

public class MatrixMultiplication {
    static int N = 2; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat1[][] = { 
				{1, 1},
				{2,2}
				}; 

		int mat2[][] = { 
				{1, 1},
				{2,2}
				};; 

		int res[][] = new int[N][N] ; 
		int i, j; 
		for(i=0; i<N; i++) {
			for(j=0; j<N; j++){
				for(int k=0; k<N; k++) {
					res[i][j] += mat1[i][k] * mat2[k][j];
				}
			}
		}
		for(i=0; i<N; i++) {
			for(j=0; j<N; j++) System.out.print(res[i][j]+" ");
			System.out.println();
		}
	}

}
