package br.com.fj.cursopoojacksonpires.heranca;

public class Gerente extends Funcionario {
    private String senha;
    private int tempoDeEmpresa;
    
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getTempoDeEmpresa() {
		return tempoDeEmpresa;
	}
	public void setTempoDeEmpresa(int tempoDeEmpresa) {
		this.tempoDeEmpresa = tempoDeEmpresa;
	}

   
}