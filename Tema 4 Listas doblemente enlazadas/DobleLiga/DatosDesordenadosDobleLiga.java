package DobleLiga;

import OperacionesTDA.AccionesTDA;

public class DatosDesordenadosDobleLiga<T> implements AccionesTDA<T> {
	private Nodito<T> puntero;
	private Nodito<T> f; 
	
	public DatosDesordenadosDobleLiga() {
		puntero=null; 
	}
	@Override
	public boolean isListaVacia() {
		return (puntero==null);
	}
	@Override
	public void inserFrente(Object dato) {
		Nodito<T> p = new Nodito(dato); 
		if(isListaVacia()) {puntero=p; f=p;} 
		else { 
		p.der=puntero;	
		puntero.izq=p; 
		puntero=p; 
	}}
	
	@Override
	public void insertFinal(Object dato) {
		Nodito<T> p=new Nodito(dato); 
		if(isListaVacia()) puntero=p;
		else {
		f.der=p; 
		p.izq=f; 
	}
		f=p; 
	}
	@Override
	public void eliminaLista() {
		//TODO Auto-generated method stub
	}
	@Override
	public Nodito <T> bucSecLista(Object dato) {
		Nodito<T> i=puntero; 
		while(i!=null && !(dato.equals((Object)i.getInfo())));
		i=i.getDer();
		return (i);
	}
	@Override
	public String imprimeLista() {
		String cad=""; 
		for(Nodito<T> j=f; j!=null; j=j.der)
		cad+=j.info + "===>"; 
		cad+= "\n Izquierda a derecha\n"; 
		for(Nodito<T> j=puntero; j!=null; j=j.izq)
			cad+= j.info + "<==="; 
		return cad;
	}
	@Override
	public void vaciaLista() {
		//TODO Auto-generated method stub 
	}
	@Override
	public Nodito buscarAntecesor(Nodito r) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void eliminar(Nodito existe) {
		// TODO Auto-generated method stub
		
}}
