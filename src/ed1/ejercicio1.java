package ed1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		int resultado=0;
		Scanner teclado = new Scanner(System.in);
				
		System.out.println("introduce un numero:");
		num1=teclado.nextInt();
		
		
		System.out.println("introduce otro numero:");
		num2=teclado.nextInt();
		
		resultado=num1*num2;
		
		System.out.println("El resultado es " +resultado);
	}

}
