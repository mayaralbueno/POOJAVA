package Turma29;

import java.util.Scanner;

/*
 Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)
 */
public class exercicio5while {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int numero,soma=0;
		 
		 Scanner leia = new Scanner(System.in);
		 
		 System.out.println("digite um numero de 0 a 9:");
		 numero=leia.nextInt();
		 
		 do
		 { 
			  soma=soma+ numero;
			  System.out.println("digite um numero de 0 a 9:");
			  numero=leia.nextInt();

		 }
		  while(numero!=0);
		  System.out.println(" a soma dos numeros s�o:" + soma);
		 

	}

}
