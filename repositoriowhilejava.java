package Turma29;
   
  import java .util.Scanner;
  /*
   * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
   */
   
public class repositoriowhilejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int  x,numero, impar ,contpar=0, contimpar = 0;
		Scanner leia=new Scanner(System.in);
		
	      for(x=0; x<10;x ++) {
	    	  
		  System.out.println("digite um numero");
		  numero =leia.nextInt();
		  if(numero % 2==0) {
			  contpar++;
			  
		  }else {
			  contimpar++;
		  }
		  
		   System.out.println("o total de numeros pares:"+contpar);
		   System.out.println("o total de numero impares � :"+contimpar);
			  
		  }
		  
		 
         
		
	
		
		}
		
		
		
	}


