package br.com.fj.cursopoojacksonpires.associacao;

public class Carro {
	private Pneu p1;
    private Pneu p2;
    private Pneu p3;
	private Pneu p4;

    public void liga() {
        System.out.println("Carro liga.");
    }

    public void desliga() {
        System.out.println("Carro delsigado.");
    }
}
