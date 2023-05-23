package PilaDinamica;
import PilasEstatica.PilaTDA;

public class PilaD<T> implements PilaTDA <T> {
	private Nodo<T> pila; 
	public PilaD() {
	pila=null;
	}
	@Override
	public boolean isEmpty() {
		//TODO Auto-Generated method stub
	return (pila==null);
	}
	public void vaciar() {
		pila=null; 
	}
	public boolean isSpace() {
		return false;
	}
	@Override
	public void push(T dato) {
		Nodo<T> tope=new Nodo<T>(dato);
			if (isEmpty()) pila=tope; 
			else { 
			tope.sig=pila;	
			pila=tope;}
	}
	@Override
	public T pop()
	{
		T dato=(T) pila.getInfo();
		pila=pila.getSig();
		return dato; 		
	}
	@Override 
	public T peek()
	{
	return (T)(pila.getInfo());
	}	
	public void freePila() {}
	@Override
	public String toString() {
	Nodo<T> tope=pila; 
	return toString(tope); 
	}
	private String toString(Nodo<T> i) {
		return(i!=null)?"tope ===>"+i+"["+pila.getInfo()+"]\n"+toString(i.getSig()):"";
}}
