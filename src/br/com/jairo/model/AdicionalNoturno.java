package br.com.jairo.model;
import java.util.Scanner;

public class AdicionalNoturno {

	private static Scanner s;

	public static void main(String[] args) {

		s = new Scanner(System.in);
		
		//Variaveis
		double valor1 = 0;
		double valor2 = 0;
		double valor3 = 0;
		double result1;
		double result2;
		double result3;
		double resultFinal = 0.0;

		System.out.println("Informe o salário base ?");
		valor1 = s.nextInt();
		System.out.println("Informe o valor da % ?");
		valor2 = s.nextInt();
		System.out.println("Informe o valor da hora ?");
		valor3 = s.nextInt();
		
		//Calculos do adicional
		result1 = valor1 / 200;
		result2 = result1 / 100 * valor2;
		result3 = valor3 *60/52.5;
		resultFinal = result3 * result2;
		
		//Resultado final
		System.out.println("Valor das Horas extras = R$ " + resultFinal);

	}
}
