package br.com.jairo.model;
import java.util.Scanner;

public class TercoFerias {
	
	private static Scanner s;

	public static void main(String[] args) {

		s = new Scanner(System.in);

		double valor1 = 0;
		double result1;
		double porcentagem = 33.33;

		System.out.println("Informe o sal�rio bruto ?");
		valor1 = s.nextInt();
		
		//Calculo ter�a de f�rias
		result1 = valor1 * porcentagem;
		
		//Resultado final
		System.out.println("Valor das Horas extras = R$ " + result1);

	}

}
