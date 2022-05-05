package javaIntermediario;

import java.util.Scanner;

public class ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner ler = new Scanner(System.in) ;
     System.out.print("Digite um número positivo menor que cem: ");
     int num=ler.nextInt();
     int s=1;
     int b=1;
     
     
     for (int i=0;i<num;i++) {
    	 s=s+b;
    	 System.out.print(s);
    	 b=b+2;
     }
     
	}

}
