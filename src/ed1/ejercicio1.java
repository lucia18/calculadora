package ed1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número:");
		String n1=teclado.nextLine();
		System.out.println("Introduce otro número:");
		String n2=teclado.nextLine();
		String resultado;
		resultado=n1+n2;
=======

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
>>>>>>> 9d9816db69e56e2a523077e3f2d71f68968cfda0
	}

}
