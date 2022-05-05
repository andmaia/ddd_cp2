package entrada_processamento_de_dados;

import java.util.Scanner;

public class ex27f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		;	char a;
		     for (int n=1;n<21;n++) {
		    	 for (int i=1;i<11;i++) {
		    		 int s=n*i;
		    		 System.out.println(i+" x "+n+" = "+s);
		    	 }
		    	 System.out.print("Quer continuar ?");
		    	 a=teclado.next().charAt(0);
		    	 if (a =='n') {
		    		 break;
		    	 }
		     }

	}

}
