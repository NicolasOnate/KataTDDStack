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
	
	@Test
	public void agregarNumeroUnoYhacerPop(){
		
		Stack stack = new Stack(2);
		
		stack.push(1);
		
		long resultado = stack.pop();
		
		assertEquals(1, resultado);
	}
	
	@Test
	public void hacerPopStackDevuelveNumeroDos(){
		
		Stack stack = new Stack(2);
		
		stack.push(1);
		stack.push(2);
		
		long resultado = stack.pop();
		
		assertEquals(2, resultado);
	}
	
	@Test
	public void hacerPopDosVecesDevuelveCuatroYTres(){
		
		Stack stack = new Stack(2);
		
		stack.push(3);
		stack.push(4);
		
		long resultado = stack.pop();
		assertEquals(4, resultado);
		
		resultado = stack.pop();
		assertEquals(3, resultado);
		
	}

}
