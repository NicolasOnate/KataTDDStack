package cl.ubb.agil;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void stackParteVacia() {
		
		Stack stack = new Stack();
		
		boolean resultado = stack.isEmpty();
		
		assertTrue(resultado);	
	}
	
	@Test
	public void agregarNumeroUnoStackNoVacio(){
		
		Stack stack = new Stack();
		
		stack.push(1);
		
		boolean resultado = stack.isEmpty();
		
		assertFalse(resultado);
	}

}
