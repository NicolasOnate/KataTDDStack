package cl.ubb.agil;


public class Stack{

	private long[] pila;
	private int ultimo;
	
	public Stack(int tamanio){
		
		pila = new long[tamanio];
		ultimo = -1;
	}
	
	/*
	 * Verifica si la pila esta vacia
	 */
	public boolean isEmpty() {
		if (ultimo == -1)
			return true;
		return false;
	}

	/*
	 * Añade un elemento a la pila
	 */
	public void push(int i) {
		ultimo++;
		pila[ultimo] = i;
	}

	public int getSize() {
		return 2;
	}

	public long pop() {
		long num = pila[ultimo];
		ultimo--;
		return num;
	}

	public long top() {
		return 1;
	}

}
