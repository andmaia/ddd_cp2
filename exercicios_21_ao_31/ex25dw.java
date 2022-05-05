package entrada_processamento_de_dados;

import java.util.Scanner;

public class ex25dw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a,b,s;
    b=1;
    Scanner t = new Scanner (System.in);
    System.out.print("Digite um número positivo");
    a = t.nextInt();
		
	do {
		
		System.out.print("Digite um número positivo:");
		a = t.nextInt();
	
	}while(a<=0);
	do {
		
		s = b*a;
		System.out.printf("\n%d =%d x %d",s,b,a);
		b++;
	}while(b<=10);

	}
}
