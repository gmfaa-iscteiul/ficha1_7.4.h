package cena1;

public class TestaAraras {

	public static void main(String[] args) {

		Arara arara1 = new Arara("Azul", 10, 1.7);
		Arara arara2 = new Arara("Amarela", 8, 2.1);
		Arara arara3 = new Arara("Verde", 12, 1.8);
		Arara arara4 = new Arara("Violeta", 0.2);

		System.out.println("A arara " + arara1.getCor() + " tem " + arara1.getAnos() 
				+ " anos e pesa " + arara1.getPeso() + " kg.");
		System.out.print("A arara " + arara1 + " e mais ");
		if (arara1.eMaisNovaQue(arara3))
			System.out.print("nova");
		else
			System.out.print("velha");
		System.out.println(" que a arara " + arara3 + ".");
		System.out.println("A arara " + arara4.getCor() + " nasceu com " + arara4.getPeso() + " Kg.");
		if (arara3.temPesoSuperiorA(arara2))
			System.out.println("A arara " + arara3 + " pesa mais que a " + arara2 + ".");
		else
			System.out.println("A arara " + arara3 + " nao pesa mais que a " + arara2 + ".");
		System.out.println("Houve um engano no peso da arara2... tem menos 0.5 kg...");
		arara2.diminuiPeso(0.5);
		System.out.println(arara2);
		arara4.setAnos(1);
		arara4.setPeso(0.7);
		System.out.println("Parabéns para a arara " + arara4.getCor() + ", que completou " + arara4.getAnos() + " ano de idade!");
		arara4.mostraArara();
	}
	
		/*** Output deste programa de teste ***
		A arara Azul tem 10 anos e pesa 1.7 kg.
		A arara Azul(10 anos, 1.7 kg) e mais nova que a arara Verde(12 anos, 1.8 kg).
		A arara Violeta nasceu com 0.2 Kg.
		A arara Verde(12 anos, 1.8 kg) nao pesa mais que a Amarela(8 anos, 2.1 kg).
		Houve um engano no peso da arara2... tem menos 0.5 kg...
		Amarela(8 anos, 1.6 kg)
		Parabéns para a arara Violeta, que completou 1 ano de idade!
		Violeta(1 ano, 0.7 kg)
		***/
}













