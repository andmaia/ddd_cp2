package javaIntermediario;

public class ex29DW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=0;
		int c;
		int i=0;
		do {
			System.out.println(a);
			c=a;
			a=a+b;
			b=c;
			i++;
			
		}while(i<30);

	}

}
