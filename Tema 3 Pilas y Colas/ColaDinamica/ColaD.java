package ColaDinamica;
import Colas.ColaTDA;
import PilaDinamica.Nodo;

public class ColaD<T> implements ColaTDA<T> {
	private Nodo f; 
	private Nodo cola;
	byte u;
	
	public ColaD() {
		cola=null;
	}
	@Override
	public boolean isEmptyCola() {
		return (cola==null);
	}
	@Override
	public void pushCola(T dato) {
		Nodo u=new Nodo(dato);
		Object f;
		if(isEmptyCola())
				cola=u;
		else { 	
		f=u;		
	}
		f=u;
	}
	@Override
	public T popCola() {
		Nodo u=cola;
		T dato=(T) cola.getInfo();
		cola=cola.getSig();
		u=null;
		return dato;
	}
	@Override
	public T peekCola() { 
		return (T) (cola.getInfo());
	}
	public void freeCola() {
		cola=null; 
		f=null;
	}
	@Override
	public String toString() {
		Nodo u=cola;
		return toString(u);
	}
	private 
	String toString(Nodo i) {
	return (i!=null)?"tope ===>"+"["+i.getInfo()+"]\n"+toString(i.getSig()):"";
}
	@Override
	public void vaciar() {
		// TODO Auto-generated method stub		
	}}