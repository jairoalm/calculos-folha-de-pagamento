package br.com.jairo.model;
import java.util.Scanner;

public class HoraExtra {
	
	private static Scanner s;

	public static void main (String [] args){
		s = new Scanner(System.in);
		
		double valor1 = 0;
		double valor2 = 0;
		double valor3 = 0;
		double result1;
		double result2;
		double result3;
		double resultFinal = 0;			
		
		System.out.println("Informe o salário base ?");	
		valor1 = s.nextInt(); 
		System.out.println("Informe o valor da % ?");
		valor2 = s.nextInt();
		System.out.println("Informe o valor da hora ?");
		valor3 = s.nextInt();
		
		//Calculos hora extra
		result1 = valor1/200;		
		result2 = (result1 * valor2)/100;		
		result3 = result2 * 3 ;			
		resultFinal = result3 * valor3;
		
		//Resultado Final
		System.out.println("Valor das Horas extras = R$ " + resultFinal);
		
	}

}
