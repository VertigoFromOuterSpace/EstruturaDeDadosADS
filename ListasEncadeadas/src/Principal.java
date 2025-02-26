import java.util.Scanner;

public class Principal {
	public static void main (String[] args) {
		//Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		Lista objLista = new Lista();
		int opcao = 0;
		
		//Menu de opção
		while(opcao != 4) {
			System.out.println("+================+");
			System.out.println("| Menu de opções |");
			System.out.println("|   1 - inserir  |");
			System.out.println("|   2 - remover  |");
			System.out.println("|   3 - imprimir |");
			System.out.println("|   4 - sair     |");
			System.out.println("+================+");
			System.out.println("Digite sua opção: ");
			opcao = leitor.nextInt();
			
			if (opcao == 1) {
				System.out.print("Digite um número: ");
				objLista.inserir(leitor.nextInt());
			} else if (opcao == 2) {
				System.out.print("Digite um número: ");
				objLista.remover(leitor.nextInt());
			} else if (opcao == 3) {
				objLista.imprimir();
			} 
		}
		leitor.close();
	}
}
