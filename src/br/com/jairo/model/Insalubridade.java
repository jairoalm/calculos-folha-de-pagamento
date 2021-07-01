package br.com.jairo.model;
import java.util.Scanner;

public class Insalubridade {	

	private static Scanner s;

	public static void main (String [] args){
		s = new Scanner(System.in);
		
		double valor1 = 0;
		double valor2 = 0;
		double porcentagem = 0.0 / 100.0;
		
		System.out.println("Informe o salário base ?");	
		valor1 = s.nextInt(); 
		System.out.println("Informe o valor da % ?");
		valor2 = s.nextInt();
		
		//Calcula da insalubridade
		porcentagem = valor1 / 100 * valor2;
		
		//Resultado final
		System.out.println(porcentagem);
		
	}

}
