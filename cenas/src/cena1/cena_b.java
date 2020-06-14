package cena1;

public class cena_b {
	
	private static int somaDosValoresEntre1eMenor(int a, int b) {
		int res = 0;
		int c = 0;
		if(a<b) {
			c = a;
		}
		else
			c = b;
		
		for(int i = 0; i<=c; i++) {
			res = res + i;
		}
		return res;
	}
	
	private static int contaDivisoresDeNemV(int[] v, int n) {
		int count = 0;
		for(int i = 0; i<v.length; i++) {
			if(v[i]%n==0) {
				count++;
			}
		}
		return count;
	}
	
	private static boolean verificaInferiorAaNaDiagonalDaMatriz(int[][] m, int a) {
		for(int i = 0; i<m.length;i++) {
			for(int j =0; j<m[i].length;j++) {
				if(m[i][j]<a) {
					return true;
				}
			}
		}
		return false;
	}
	
	private static int produtoDosDiferentesDeANasLinhasPares(int[][] m, int a) {
		int res = 1;
		for(int i = 0; i<m.length;i++) {
			for(int j =0; j<m[i].length;j++) {
				if(i%2 == 0 && m[i][j] != a) {
					res = m[i][j] * res;
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		int a = 
		somaDosValoresEntre1eMenor(4, 9);
		System.out.println(a);
	}

}
