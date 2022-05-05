package entrada_processamento_de_dados;

import java.util.Scanner;

public class ex25w {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int a,b,s;
	    b=1;
		Scanner i = new Scanner(System.in);
		System.out.print("Digite um número positivo:");
		a = i.nextInt();
;     
		while (a<=0) {
			System.out.print("Digite um número positivo:");
			a = i.nextInt();
			
		}
		while (b<=10) {
		s = b*a;
		System.out.printf("\n%d =%d x %d",s,b,a);
		b++;
		}
	}

}
