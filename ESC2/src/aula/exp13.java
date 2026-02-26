package aula;

import java.util.ArrayList;
import java.util.Scanner;

public class exp13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		System.out.println("Digite números inteiros para calcular a média.");
		System.out.println("Digite um número negativo para parar a entrada.");
		int numero;
		while (true) {
			System.out.println("Digite um número: ");
			numero = input.nextInt();
			if (numero < 0 ) {
				break;//Sai do loop se o numero for negativo
			}
			numeros.add(numero);// Adicione o numero a lista
		}
		//isEmpity() da calsse arraylist para verificar se a lista esta vazia
		if(numeros.isEmpty()) {
			System.out.println("Nenhuma número foi inserido.");
		}else {
            int soma =0;
            for (int n : numeros) {
                soma += n;
            }
            double media = (double) soma / numeros.size();
            System.out.println("A media dos numeros inseridos e:" + media);
            }
	}

}
