package cl.ubb.agil;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void stackParteVacia() {
		
		Stack stack = new Stack(2);
		
		boolean resultado = stack.isEmpty();
		
		assertTrue(resultado);	
	}
	
	@Test
	public void agregarNumeroUnoStackNoVacio(){
		
		Stack stack = new Stack(2);
		
		stack.push(1);
		
		boolean resultado = stack.isEmpty();
		
		assertFalse(resultado);
	}
	
	@Test
	public void agregarNumeroUnoYDosStackNoVacio(){
		
		Stack stack = new Stack(2);
		
		stack.push(1);
		stack.push(2);
		
		boolean resultado = stack.isEmpty();
		
		assertFalse(resultado);
	}
	
	@Test
	public void agregarNumeroUnoYDosTamanioStack2(){
		
		Stack stack = new Stack(2);
		
		stack.push(1);
		stack.push(2);
		
		int resultado = stack.getSize();
		
		assertEquals(2, resultado);
	}

}
