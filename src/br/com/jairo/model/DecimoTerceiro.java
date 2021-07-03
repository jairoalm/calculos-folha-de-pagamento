package br.com.jairo.model;

import java.util.Scanner;

public class DecimoTerceiro {
	private static Scanner s;
	
	public static void main (String [] args ){
		
		s = new Scanner (System.in);
		
		double salario = 0;
		double mestrabalhado = 0;
		double resultado;
		
		System.out.println("Informe o valor do salário : ");
		salario = s.nextInt();
		
	    System.out.println("Mês trabalhado : ");
	    mestrabalhado = s.nextInt();
	    
	    resultado = salario / 12 * mestrabalhado;
	    
	    System.out.println(resultado);
	}
	

}
