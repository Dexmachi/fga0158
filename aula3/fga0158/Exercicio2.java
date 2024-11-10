package fga0158;

import javax.swing.JOptionPane;

/**
 * "Pontapé" para o exercicio 2. 
 * IMPORTANTE: 
 *   - O esboço em estágio muito inicial está apresentado a seguir. Cabe a cada 
 *     aluno terminar o desenvolvimento do exercicio
 *   - Atente-se para o uso constante de funções e procedimentos nesse esboco. 
 *     Continue desenvolvendo, sempre que possível, através de funções. 
 * @author andre
 *
 */
public class Exercicio2 {

	/**
	 * Metodo MAIN: ponto de inicio da execucao do algoritmo.	
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Declaracao de variaveis
		 */
		int qtdeValores;
		int[] numeros;
		numeros = new int[qtdeValores];
		float media; 

		qtdeValores = lerInteiro("Informe o numero de valores a serem lidos"); 
		numeros = preencherVetor(qtdeValores);
		media = calcularMedia(numeros);
		qtdsParImp = qtds(numeros)

		JOptionPane.showInputDialog("a media de seus valores e de " + resposta + ", e tem " + pares + " numeros pares e " + impares + " numeros impares.");
		
	}


	
	
	private static float calcularMedia(int[] numeros) {
		for(int i=0; i<=numeros.length(); i++){
			int memorie = 0;
			memorie += vetor[i];
		}
		float divindendo = Interger.parseFloat(memorie);
		float dividindo = Interger.parseFloat(numeros.length());
		float resposta = dividendo/dividindo;
		//retorno da media
		return resposta;
	}


	
	private static int[] preencherVetor(int qtdeValores) {

		int vetor[];
		vetor = new int[qtdeValores];
		
		for(int i=0; i<qtdeValores; i++){
			vetor[i] = lerInteiro(i);
		}

		return vetor;
	}


	
	public int[] qtds(int[] numeros)
	{
		int pares = 0
		int impares = 0
		for(int i=0; i<numeros.length(); i++)
			{
				if(numeros[i]%2==0)
				{
					pares++;
				}
				else
				{
					impares++;
				}
			}
	}



	
	private static int lerInteiro(String mensagem) {
		String strNumero = JOptionPane.showInputDialog("Informe um valor inteiro para v[" + posicao + "]");
		int numero = Integer.parseInt(strNumero);  //<--- down-casting de String para int
		return numero;
	}
}
