package entrada_processamento_de_dados;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner t = new Scanner (System.in);
    int a,b;
    System.out.println("Digite o primeiro n�mero:");
    a = t.nextInt();
    do {
    System.out.println("Digite um n�mero maior que o primeiro");
    b = t.nextInt();
    }while (a>=b);
	}

}
