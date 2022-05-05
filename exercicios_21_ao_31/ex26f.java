package entrada_processamento_de_dados;

import java.util.Scanner;

public class ex26f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
	    System.out.print("Digite um número positivo:");
	    int n = teclado.nextInt();
	    while (n<=0) {
	    	System.out.print("Digite um número positivo;");
	    	 n = teclado.nextInt();
	    }
	    System.out.print("Digite o primeiro valor do intervalo  para executar a tabuada:");
	    int i=teclado.nextInt();
	    System.out.print("Digite o segundo valor do intervalo  para executar a tabuada:");
	    int f=teclado.nextInt();
	    for (int c=i;c>f;) {
	    	   System.out.print("Digite o segundo valor do intervalo  para executar a tabuada:");
	   	        f=teclado.nextInt();
	    }
	    for (int c=i-1;c<f;f--) {
	    	int s = n*f;
	    	System.out.println(f+" x "+n+" = "+s);
	    }
	    }
	}


