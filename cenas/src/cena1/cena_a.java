package cena1;

public class cena_a {

	//prova B
	private static int produtoDosValoresEntre1eMaior(int a, int b) {
		int c;
		if(a<b)
			c=b;
		else
			c=a;

		System.out.println("c= " + c);
		int res= 1;
		for(int i = 1; i<=c; i++) {
			res = i*res;
		}
		System.out.println("res = " + res);
		return res;
	}

	private static int contaNegativosDiferentesDeNemV(int[] v, int n) {

		int diff = 0;
		for(int i = 0; i<v.length;i++) {
			if(v[i] < 0)
				diff++;
			if(v[i] != n)
				diff++;
			if(v[i] < 0 && v[i] != n)
				diff++;
		}
		return diff;
	}

	private static boolean verificaANaDiagonalDaMatriz(int[][] m, int a) {
		for(int i = 0; i<m.length; i++) {
			for(int j = 0; j<m[i].length; j++) {
				if(i==j) {
					if(m[i][j]==a)
						return true;
				}
			}
		}
		return false;
	}

	private static int somaDosMultiplosDeANaPrimeiraColunaLinha(int[][] m, int a) {

		int res=0;
		for(int j = 0; j<m[0].length; j++) {
			if(m[0][j]%a==0)
				res=res+m[0][j];
		}
		return res;
	}
}

