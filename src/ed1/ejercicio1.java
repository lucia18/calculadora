package ed1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num1=0;
		int num2=0;
		int ope=0;//numero que nos dira que operacion hacemos
		System.out.println("Dame el primer n�mero:");
		num1=teclado.nextInt();
		System.out.println("Dame el segundo n�mero:");
		num2=teclado.nextInt();
		System.out.println("Que deseas hacer");
		System.out.println("1-Suma");
		System.out.println("2-Resta");
		System.out.println("3-Multiplicacion");
		System.out.println("4-Division");
		ope=teclado.nextInt();
		switch(ope){
		case 1: ope=num1+num2;
		System.out.println("El resultado de "+num1+ " + "+num2+" es ="+ope);
		break;
		case 2: ope=num1-num2;
		System.out.println("El resultado de "+num1+ " - "+num2+" es = "+ope);
		break;
		case 3: ope=num1*num2;
		System.out.println("El resultado de "+num1+ " x "+num2+" es = "+ope);
		break;
		case 4: ope=num1/num2;
		System.out.println("El resultado de "+num1+ " : "+num2+" es = "+ope);
		}

	}


}




