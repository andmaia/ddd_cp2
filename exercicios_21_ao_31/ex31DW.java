package javaIntermediario;

import java.util.Scanner;

public class Ex31DW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler=new Scanner(System.in);
		 System.out.print("Digite um número positivo menor que cem: ");
	     int num=ler.nextInt();
	     int s=1;
	     int b=1;
	     int i=0;
	     
	     
	     do {
	    	 s=s+b;
	    	 System.out.println(s);
	    	 b=b+2;
	    	 i++;
	     }while(i<num);
	}

}
