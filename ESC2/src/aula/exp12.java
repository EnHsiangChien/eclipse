package aula;

import java.util.Scanner;

public class exp12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner enter = new Scanner(System.in);
		double [] num = new double[5];
		double media, soma=0;
		for(int i=0; i<num.length;i++) {
			System.out.println("Digite o valor "+i+" : ");
			num[i]=enter.nextDouble();
			soma=soma+num[i];
		}
		media=soma/num.length;
		System.out.println("Média: "+ media);
	}

}
