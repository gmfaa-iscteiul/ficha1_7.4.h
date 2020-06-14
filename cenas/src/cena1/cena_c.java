package cena1;

public class cena_c {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static int somaDosDivisoresDeX(int x) {
		int result = 0;
		for(int i = 1; i<=x; i++) {
			if(i%x==0) {
				result=result+i;
			}
		}
		return result;
		
	}
	
	
	
	
	//existe numero inf a n na primeira ou na ultima
	
	
	
	public static boolean verificaValorInferiorEmColunas(int[][]matriz, int n) {
		
		
		
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j =0; j < matriz[i].length; j++) {
				if( ( i==0 || i ==(matriz.length-1) ) && matriz[i][j] < n ) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	
	//contar qntos valores inf a x OU sup a y fora da diagonal
	
	public static int contaValoresExtremosNaMatriz(int[][] m, int x, int y) {
		
		
		
		int resultado = 0;
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				if(i != j) {
					if( m[i][j] < x || m[i][j] > y) {
						resultado++;
					}
				}
			}
		}
		return resultado;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
