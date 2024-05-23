package br.com.fj.cursopoojacksonpires.agregacao;

public class Comprador {
    private float verba;
	
	public void setVerba(float verba) {
		this.verba = verba ;
	}
	
	public float getVerba() {
		return verba;
	}
	
    public void compra() {
        System.out.println("Comprado!");
    }
}