package cl.ubb.agil;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackTest {
	
	private Stack stack;
	
	@Before
	public void setup(){
		stack = new Stack(2);
	}

	@Test
	public void stackParteVacia() {
		
		boolean resultado = stack.isEmpty();
		
		assertTrue(resultado);	
	}
	
	@Test
	public void agregarNumeroUnoStackNoVacio(){
		
		
		stack.push(1);
		
		boolean resultado = stack.isEmpty();
		
		assertFalse(resultado);
	}
	
	@Test
	public void agregarNumeroUnoYDosStackNoVacio(){
		
		
		stack.push(1);
		stack.push(2);
		
		boolean resultado = stack.isEmpty();
		
		assertFalse(resultado);
	}
	
	@Test
	public void agregarNumeroUnoYDosTamanioStack2(){
		
		stack.push(1);
		stack.push(2);
		
		int resultado = stack.getSize();
		
		assertEquals(2, resultado);
	}
	
	@Test
	public void agregarNumeroUnoYhacerPop(){
		
		stack.push(1);
		
		long resultado = stack.pop();
		
		assertEquals(1, resultado);
	}
	
	@Test
	public void hacerPopStackDevuelveNumeroDos(){
		
		stack.push(1);
		stack.push(2);
		
		long resultado = stack.pop();
		
		assertEquals(2, resultado);
	}
	
	@Test
	public void hacerPopDosVecesDevuelveCuatroYTres(){
		
		stack.push(3);
		stack.push(4);
		
		long resultado = stack.pop();
		assertEquals(4, resultado);
		
		resultado = stack.pop();
		assertEquals(3, resultado);
		
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void hacerPopEnUnStackVacioLanzaError() throws ArrayIndexOutOfBoundsException{

		long resultado = stack.pop();
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void hacerPushAUnStackLleno() throws ArrayIndexOutOfBoundsException{
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
	}
	
	@Test
	public void topDevuelveUno(){
		
		stack.push(1);
		long resultado = stack.top();
		
		
		assertEquals(1, resultado);
	}
	
	@Test
	public void topDevuelveDos(){
		
		stack.push(1);
		stack.push(2);
		
		long resultado = stack.top();
		
		assertEquals(2, resultado);
	}

}
