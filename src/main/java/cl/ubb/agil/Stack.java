package cl.ubb.agil;


public class Stack{

	private int ultimo;
	
	public Stack(){
		
		ultimo = -1;
	}
	
	/*
	 * Verifica si la pila esta vacia
	 */
	public boolean isEmpty() {
		if (ultimo == 1)
			return false;
		return true;
	}

	/*
	 * Añade un elemento a la pila
	 */
	public void push(int i) {
		ultimo = 1;
	}

}
