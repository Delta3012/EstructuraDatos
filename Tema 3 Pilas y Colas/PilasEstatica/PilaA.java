package PilasEstatica;
import EntradaSalida.Tools;
public class PilaA <T> implements PilaTDA<T> {
	private T pila[];
	private byte tope; 
	
	@SuppressWarnings("unchecked")
	public PilaA(int max) {
		pila=(T[])(new Object[max]);
		tope=-1;
	}
	public boolean isEmpty() {
		return(tope==-1);
	}
	public boolean isSpace() {
		return(tope<pila.length-1);
	}
	public void push(T dato) {
		if(isSpace()) {
			tope++;
			pila[tope]=dato;
	}else
		Tools.imprimeError("�Pila llena!");
	}
	public T pop() {
		T dato=pila[tope];
		tope--;
		return dato;
	}
	public T peek() {
		return pila[tope];
	}
	public String toString() {
		return toString(tope);
	}
	private String toString(int i) {
		return(i>=0)?"\n"+"tope["+i+"]==>"+""+pila[i]+"  "+toString(i-1):"";
}
	@Override
	public void freePila() {
		// TODO Auto-generated method stub
}}
