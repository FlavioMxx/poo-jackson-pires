package br.com.fj.cursopoojacksonpires.agregacao;

public class Produto {
    private float preco;
    private int tamanho;

	public void setPreco(float preco) {
		this.preco = preco ;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho ;
	}
	
	public float getTamanho() {
		return tamanho;
	}

    void vendido() {
        System.out.println("Vendido.");
    }
}
