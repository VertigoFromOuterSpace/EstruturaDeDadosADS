
public class Lista {
	// Propriedades da classe
	private No cabeca = null;
	
	// Métodos da classe
	public void inserir(int numero) {
		cabeca = new No(numero, null, cabeca);
		if (cabeca.getProximo() != null) {
			cabeca.getProximo().setAnterior(cabeca);
		}
	}
	
	public void imprimir() {
		No ponteiro = cabeca;
		
		while (ponteiro != null) {
			System.out.print(ponteiro.getNumero());
			ponteiro = ponteiro.getProximo();
		}
	}
	
	public void remover(int numero) {
		// Caso muito fácil: lista vazia
		if (cabeca == null) {
			return;
		}
		
		// Caso fácil: excluir o primeiro ou único
		if (cabeca.getNumero() == numero) {
			cabeca = cabeca.getProximo();
			if (cabeca != null) {
				cabeca.setAnterior(null);
			}
			
			return;
		}
		
		// caso difícil: excluir no meio
		No ponteiro = cabeca;
		while ((ponteiro != null) && (ponteiro.getNumero() != numero)) {
			ponteiro = ponteiro.getProximo();
		}
		if (ponteiro == null) {
			return;
		}
		ponteiro.getAnterior().setProximo(ponteiro.getProximo());
		if (ponteiro.getProximo() != null) {
			ponteiro.getProximo().setAnterior(ponteiro.getAnterior());
		}
	}
}
