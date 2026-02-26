package aula2;

public class TestePessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pessoas p1 = new pessoas();
		p1.nome = "Stephanie";
		p1.idade = 17;
		p1.renda = 5000;
		System.out.println("Nome: "+p1.nome);
		System.out.println("Idade: "+p1.idade);
		System.out.println("Renda: "+p1.renda);
		pessoas p2 = new pessoas();
		p2.nome = "Eric";
		System.out.println("Nome 2: "+p2.nome);
	}

}
