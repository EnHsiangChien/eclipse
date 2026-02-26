package aula;

import java.util.Scanner;

public class SomaTresNumeros {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		double num1 = scanner.nextDouble();
		System.out.println("Digite o segundo número:");
		double num2 = scanner.nextDouble();
		System.out.println("Digite o terceiro número:");
		double num3 = scanner.nextDouble();
		double resultado = somaTresNumeros(num1,num2,num3);
		System.out.println("A soma dos três numeros é :" + resultado);
	}
	public static double somaTresNumeros(double num1, double num2, double num3) {
		return num1 + num2 + num3; }
}
