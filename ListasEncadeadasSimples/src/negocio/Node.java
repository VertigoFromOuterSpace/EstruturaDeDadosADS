package negocio;

public class Node {

	// Propriedades da classe
	private int numero = 0;
	private Node proximo = null;
	
	// Métodos construtores da classe
	public Node() {
		super();
	}

	public Node(int numero, Node proximo) {
		super();
		this.numero = numero;
		this.proximo = proximo;
	}

	
	// Métodos de acesso da classe
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Node getProximo() {
		return proximo;
	}

	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}
	
	
	
	
	
	
	
	
	
}
