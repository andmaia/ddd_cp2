package entrada_processamento_de_dados;

import java.util.Scanner;

public class ex25f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um n�mero positivo:");
		int a =teclado.nextInt();
        for (int i=a ;i<0;) {
        System.out.print("Digite um n�mero positivo:");
         a =teclado.nextInt();
        }
        for (int s=1;s<11;s++) {
        int times = a*s;
        System.out.println(a+" x "+s+" = "+times);
        }
        }
	}


