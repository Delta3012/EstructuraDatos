package Colas;

public interface ColaTDA<T> {

	public boolean isEmptyCola();
	public T popCola();
	public void pushCola(T dato);
	public T peekCola();
	public void freeCola();
	public void vaciar();
}
