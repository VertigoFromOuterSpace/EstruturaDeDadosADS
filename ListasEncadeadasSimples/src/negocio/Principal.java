package negocio;

public class Principal {
	public static void main(String args[]) {
		// Declaração de variáveis
		Lista objLista = new Lista();
		
		// Processamento
		for (int i = 0 ; i < 10 ; i++) {
			objLista.inserir(i);
		}
		
		objLista.imprimir();
		System.out.println("==================");
		objLista.remover(0);
		objLista.remover(5);
		objLista.remover(9);
		objLista.remover(100);
		
		objLista.imprimir();
		
		
		
		
	}
}
