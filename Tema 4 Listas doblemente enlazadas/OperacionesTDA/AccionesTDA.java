package OperacionesTDA;
import DobleLiga.Nodito;
import Nodos.Nodo;

public interface AccionesTDA<T> {

		public boolean isListaVacia();	//Regresa true si la pila 
		public void inserFrente(T dato);
		public void insertFinal(T dato); 
		public void eliminaLista();	//Debe quitar el elemento que 
		public Nodito bucSecLista(T dato);
		public String imprimeLista();
		public void vaciaLista();
		public Nodito buscarAntecesor(Nodito r);
		      void eliminar(Nodito existe); 
	 	
	}
