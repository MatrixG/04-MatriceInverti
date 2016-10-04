package pkgInvertiMatrice;

public class InvertiMatrice {

	private static final int N = 6;
	
	public static void main(String[] args) {
		
	int temp;
		
		int[][] matrix = new int[N][N];
		
		//matrix fill
		for (int row = 0; row < N; row++)
			for (int col = 0; col < N; col++){
				matrix[row][col] = (row * N) + col + 1;
			}
		
		//matrix print
		for (int row = 0; row < N; row++ ){
			for (int col = 0; col < N; col++){
				System.out.print(matrix[row][col] + " ");
			}
			System.out.print("\n");
		}
		
		// Mi sposto sulla matrice partendo dalle entrate sulla diagonale.
		// Uso due cicli for.
		// Il primo ciclo termina quando oltrepassa la metà della matrice. 
		// Il secondo ciclo termina quando raggiunge il valore sulla antidiagonale.
		// Uso la variabile 'antidiag' per scorrere la antidiagonale
		// Nel secondo ciclo inizializzo col = row per partire sempre 
		// 											sulla entrata della diagonale.
		// Uso una variabile temporanea 'temp' per il primo scambio.
		// Sposto a ritroso le celle seguendo 'lo spazio vuoto' nella matrice
		
		for (int row = 0, antidiag = N - 1; row <= N/2; row++, antidiag--){
			for (int col = row; col < antidiag; col++){
				
				temp = matrix[col][N - row - 1];
				
				matrix[col][N - row - 1] = matrix[row][col];
				
				matrix[row][col] = matrix[N - col - 1][row];
				
				matrix[N - col - 1][row] = matrix[N - row - 1][N - col - 1];
				
				matrix[N - row - 1][N - col - 1] = temp;
			}
		}
		
		//matrix print
		System.out.print("\n");
		for (int row = 0; row < N; row++ ){
			for (int col = 0; col < N; col++){
				System.out.print(matrix[row][col] + " ");
			}
			System.out.print("\n");	
		}
		
		
		
		
		/*
		//matrix transpose
		for (int row = 0; row < N; row++){
			for (int col = 0; col < row; col++){
				temp = matrix[row][col];
				matrix[row][col] = matrix[col][row];
				matrix[col][row] = temp;
			}
		}
		*/
		
		/*
		//matrix change column position
		for (int col = 0; col < N/2; col++){
			for (int row = 0; row < N; row++){
				temp = matrix[row][col];
				matrix[row][col] = matrix[row][N - col - 1];
				matrix[row][N - col -1] = temp;
			}
		}
		*/
	}
}
