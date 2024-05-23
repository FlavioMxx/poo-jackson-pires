package br.com.fj.cursopoojacksonpires.agregacao;

public class Vendedor {
    private float comissao;

	public void setComissao(float comissao) {
		this.comissao = comissao ;
	}
	
	public float getComissao() {
		return comissao;
	}
	

    public void vende() {
        System.out.println("Vendido!");
    }

}
