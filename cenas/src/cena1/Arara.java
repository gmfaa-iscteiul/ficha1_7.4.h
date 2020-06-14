package cena1;

//copia este
public class Arara {

	private String cor;
	private int anos;
	private double peso;
	
	public Arara ( String cor, int anos, double peso) {
		this.cor = cor;
		this.anos = anos;
		this.peso = peso;
	}
	
	public Arara ( String cor, double peso) {
		this.cor = cor;
		this.anos = 1;
		this.peso = peso;
	}
	
	public boolean eMaisNovaQue(Arara compara) {
		if(anos < compara.getAnos()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean temPesoSuperiorA(Arara compara) {
		if(peso > compara.getPeso()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void diminuiPeso(double perda) {
		this.peso = this.peso - perda;
	}
	
	public Arara mostraArara() {
		return this;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAnos() {
		return anos;
	}
	public void setAnos(int anos) {
		this.anos = anos;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
