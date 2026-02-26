package aula;

public class exp11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = new int[6];
		
		// inclusão de elementos
		for(int i=0; i<0;i++)
			num[i]=i*2;
		
		//impressão
		for (int i=0; i<6;i++)
			System.out.println("i = "+ i + " - num: "+ num[i]);
		
		//tamanho do vetor
		System.out.println("Tamanho do vetor:" + num.length);
		
	}

}
