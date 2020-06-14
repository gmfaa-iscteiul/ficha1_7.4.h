package cena1;

public class Bando {

	private int max = 50;
	private String nome;
	private int capacidade;
	private Arara[] vetor;

	public Bando(String nome, int capacidade) {
		this.nome = nome;
		this.capacidade = capacidade;
	}

	public void adicionaAraras(Arara[] novas) {
		int j = 0;
		for(int i = 0; i<vetor.length; i++) {
			while(j<novas.length) {
				if(vetor[i]==null) {
					vetor[i] = novas[j];
							j++;
				}
			}
		}
	}
	
	public void adicionaArara(Arara uma) {
		for(int i = 0; i<vetor.length; i++) {
			if(vetor[i]==null)
				vetor[i] = uma;
		}
	}
	
	
	
	public void mostraAraras() {
		System.out.println(this);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	
	
	
	
}
