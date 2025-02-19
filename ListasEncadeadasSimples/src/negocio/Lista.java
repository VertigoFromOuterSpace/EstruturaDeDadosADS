package negocio;

public class Lista {
	// Propriedades da classe
	private Node cabeca = null;
	
	// Métodos da classe
	public void inserir(int numero) {
		
		Node ultimo = cabeca;
		
		// Caso fácil: lista vazia
		if (cabeca == null) {
			cabeca = new Node(numero, null);
			return;
		}
		
		// Caso difícil: lista não vazia só tem um único nó
		if (cabeca.getProximo() == null) {
			cabeca.setProximo(new Node (numero, null));
			return;
		}
		
		// Caso difícil: Lista tem vários nós, tem que procurar o último
		while (ultimo.getProximo() != null) {
			ultimo = ultimo.getProximo();
		}
		
		ultimo.setProximo(new Node(numero, null));
	}
	
	public void imprimir() {
		Node ponteiro = cabeca;
		while (ponteiro != null) {
			System.out.println(ponteiro.getNumero());
			ponteiro = ponteiro.getProximo();
		}
	}
	
	
	
	public void remover(int numero) {
		// Caso muito fácil: lista vazia
		if (cabeca == null) {
			return;
		}
		
		// Caso fácil: excluir primeiro
		if (cabeca.getNumero() == numero) {
			cabeca = cabeca.getProximo();
			return;
		}
		
		// Caso difícil: excluir no meio ou no fim
		Node anterior = cabeca;
		while  ((anterior.getProximo() != null) && (anterior.getProximo().getNumero() != numero)) { // Cheguei no fim da lista ( e não achou)
			anterior = anterior.getProximo(); 
		}
		
		if (anterior.getProximo() == null) { // Caso (iv) numero inexistente na lista
			return;
		}
		
		anterior.setProximo(anterior.getProximo().getProximo());
		
	}
}
