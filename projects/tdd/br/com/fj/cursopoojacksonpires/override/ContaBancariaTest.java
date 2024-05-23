package br.com.fj.cursopoojacksonpires.override;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContaBancariaTest {

	@Test
	void test() {
		ContaEspecial ce = new ContaEspecial("Josefino", 110112, 100f, 250f);		
		assertEquals("Josefino", ce.getCliente());
		assertEquals(110112, ce.getNumConta());
		assertEquals(100, ce.getSaldo(), 0.000001);
	}

}
