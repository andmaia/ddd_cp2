package entrada_processamento_de_dados;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner t = new Scanner (System.in);
	String a;
    do {
    	System.out.println("Digite seu sexo:");
    	a = t.next();
    	
    }while(!a.equals("F") && !a.equals("M"));
	}

}
