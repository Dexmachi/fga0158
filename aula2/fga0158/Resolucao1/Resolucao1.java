/** 
 * Obs.: o trecho de código abaixo apresenta a estrutura básica para a resolução 
 * desse exercício. Altere os trechos destacados com as instruções em Java para 
 * resolução do exercício.
 */ 

package Resolucao1;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Resolucao1 {
	
	public static void main(String[] args) {

		//Declaracao de variáveis
		Scanner sc = new Scanner(System.in);
		String nome = sc.nextLine();

		//saída em modo texto
		System.out.println("Olá " + nome + ", Seja bem vindo!");

		//Saída em modo gráfico
		String quadradin = JOptionPane.showInputDialog("Qual o seu nome?: ");
		JOptionPane.showMessageDialog(null, "Olá " + nome + ", Seja bem vindo!");
	}
}
