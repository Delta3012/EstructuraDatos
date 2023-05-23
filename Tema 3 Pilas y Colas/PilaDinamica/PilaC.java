package PilaDinamica;
import java.util.ArrayList;

import PilasEstatica.PilaTDA;
public class PilaC<T> implements PilaTDA<T> {
	//investigar sobre aplicaciones de las pilas 
	private ArrayList<T> pila; 
	int tope; 

	public PilaC() {
	pila=new ArrayList<T>();
	tope=-1; 
	}
	public int size() {
	return pila.size();
	}	
	@Override 
	public boolean isEmpty()
	{
	return pila.isEmpty();
	}
	public void vaciar() {
		pila.clear();
	}
	@Override
	public void push(T dato) {
		pila.add(dato);
		tope++; 
	}
	@Override
	public T pop() {
	T dato=(T) pila.get(tope);
	pila.remove(tope);		
	tope--;
	return dato; 
	}
	@Override
	public T peek() {
	return(T)pila.get(tope);
	}
	@Override
	public String toString() {
		return toString(tope); }
	private String toString(int i) {
	return(i>=0)?"tope ===>"+i+"["+pila.get(i)+"]\n"+toString(i-1):"";
}
	@Override
	public void freePila() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isSpace() {
		// TODO Auto-generated method stub
		return false;
	}}
