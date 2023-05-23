package Actualizacion;
import EntradaSalida.Tools;
public class DatOrdenado {
	
	private int ordenados[];
	private byte p; 
	//constructor que recibe el tamano para reservar un arreglo
	public DatOrdenado(byte tam) {
	ordenados = new int[tam]; 
	p=-1;//sub-indice, -1 para validar si esta vacío 
	}
	public boolean validaVacio() { //para validar si esta vacio el array 
		return (p==-1); 
	}
	public void corrimiento(byte pos) {
		for(int j= p+1; j>pos; j--) {
			ordenados[j]=ordenados[j-1];
		}
		
	}
	public String imprimeOrdenados()
	{
	String cad="";
	for(int i=0; i<=p; i++) {
		cad+=i+"["+ordenados[i]+"]"+"\n";
	}
	return "\n"+cad; 
	}
	public byte BuSecuencialOrdenada(int dato) {
		byte  i=0;
		while(i<=p && (Integer)ordenados[i]<dato)
			  i++; 
		return (byte) ((i>p || (Integer)ordenados[i]>dato)?-i:i);
	}
	public void eliminaDato(byte pos) {
		for(int k=pos; k<=p; k++) {
			ordenados[k]=ordenados[k+1];
		}
		p--;
		
		}
	public void agregarOrdenado() {
		if(validaVacio()) {
		ordenados[p+1] = Tools.leerInt("Ingrese un valor");	
		p++; 
	}else{
		int dato = Tools.leerInt("Escribe un valor a insertar");	
		byte pos = (byte) busquedaOrdenada(dato);	
		if(pos>=0)
			   Tools.imprimeError("¡Ese dato ya existe!"); 
	else { 
		pos*=-1;
		recorrePosiciones((byte)pos); 
		p++;
	}
		ordenados[pos]=dato;
		}
	}
	public byte  busquedaOrdenada(int dato) {
		byte i=0;
		while(i<=p && ordenados[i] < dato) 
			i++;
		return (byte) ((i>p || ordenados[i] > dato)?-i:i);
	
}
	public void modificaOrdenados(byte existe) {
		int dato;
        if(existe==0)
        {
            if(existe<=(Integer)ordenados[0]){
                do
                {
               
                    dato =  Tools.leerByte("Ingresa un valor menor a: " + ordenados[existe + 1]);
                }
                while (dato >= (Integer) ordenados[existe*(-1)+1]);
                ordenados[existe*(-1)] = dato;
            }
            else
            {
                do
                {
                    dato = Tools.leerByte("Ingresa un valor menor a: '" + ordenados[existe + 1] +  "'  mayor a: '" + ordenados[existe - 1] + "'");
                }
                while (dato >= (Integer) ordenados[existe + 1] && existe <= (Integer) ordenados[existe - 1]);
                ordenados[existe] = dato;
            }
        }
        else
        {
            do
            {
                dato = Tools.leerByte("Ingresa un valor mayor a: " + ordenados[existe - 1]);
            }
            while (dato <= (Integer) ordenados[existe - 1]);
            ordenados[existe] = dato;
        }
}
	public void recorrePosiciones(byte pos) {// este metodo recorre de forma ordenada
		for(int j= p+1; j>pos; j--) {
			ordenados[j]=ordenados[j-1];
		}
	}

	}