package Turma29;
/*
 * Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 

 */

import java.util.Scanner;
public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[]numero = {1,0,5,-2,-5,7};
      int soma;
      
      soma = numero[0] +numero[1] + numero[5];
      System.out.println(" a soma dos numero é:"+soma);
      
      numero[4]=100;
      
      for(int i=0;i<6;i++);
      {
    	  System.out.println("numero ="+numero);
      }
      
	}

}
