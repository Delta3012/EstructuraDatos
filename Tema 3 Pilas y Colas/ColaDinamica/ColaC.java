package ColaDinamica;
import java.util.ArrayList;
import Colas.ColaTDA;

public class ColaC<T> implements ColaTDA<T> {

	private ArrayList<T> cola; 
	byte u;
	
	public ColaC() {
		cola=new ArrayList();
		u=0;
	}
	public int size() {
		return cola.size();	
	}
	
	public boolean IsEmptyCola() {
		return cola.isEmpty();
	}
	public void vaciar() {
		cola.clear();
	}
	public void pushCola(Object dato) {
		cola.add((T) dato);
		u++;
	}
	public T popCola() {
		T dato=(T) cola.get(0);
		cola.remove(0);
		u--;
		return dato; 
	}
	
	public T peekCola() {
		return (T) cola.get(0);
	}
	public String toString() {
		return toString(0); } 
	
		private String toString(int i) {
			return (i<u)?""+i+"["+cola.get(i)+"] ===>"+toString(i+1):"";
}
		@Override
		public boolean isEmptyCola() {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public void freeCola() {
}}
