package Principal; //Quest�o 01 T2

import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
	
	System.out.println("Vamos descobrir se um n�mero � par ou �mpar!");
	Scanner n1 = new Scanner(System.in);
	System.out.print("Digite um n�mero:");
	int num1 = n1.nextInt(); 
	
	if (num1 % 2 == 0) {
	System.out.println("O n�mero " + num1 + " � par.");
		}
	else { 
	System.out.println("O n�mero " + num1 + " � �mpar.");
	}
	

	}
}
