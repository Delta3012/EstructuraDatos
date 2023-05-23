package Actualizacion;

import EntradaSalida.Tools;

public class DatoSimple {	
	 private Object datos[];
	 private byte p;
	 //Constructores
	 public DatoSimple(byte tam)
	 {
		 datos=new Object[tam];
		 p=-1;
	 }
	 public boolean validaVacio()
	 {
		return (p==-1); 
	 }
	 public int modificaSimple(int i) {
		 i = 0;
		while (i<=p);
		return(p) ;
	 }	 
	 //almacenamiento de datos y guardado
	 public void almacenarDato()
	 {
		 if(p<datos.length) 
	 {
			datos[p+1] = Tools.leerInt("Escribe un numero");
			p++; 
	 }
		 else Tools.imprimeError("¡Arreglo lleno!");			 
	 }
	 //impresion de datos
	 public String imprimeDatos()
	 {
		 String cad="";
		 for(int i = 0; i <=p; i++)
	 {
			 cad+="["+datos[i]+"]"+"\n"; 
	 }
		 return "\n"+cad;
	}
	 //busqueda secuencial
	 public byte busSecuencial(Object valor)
{	 
		byte i=0;
		while(i<=p && !valor.equals(datos[i]))
			i++;
		//forma larga (long)
		//return (valor.equals(datos[i]))?i:-1; 
		//forma recortada (short) 
		return(i<=p)? i: -1;
}
	 public void modificaSimple(byte pos) {
		int nombre=0;
		nombre = Tools.leerInt("Introduzca un nuevo valor");
		for(int j=pos; j<=pos; j++) {
		datos[j]=nombre; 
}}
	 public void eliminaDato(int pos) 
	 {
		for(int j=pos; j<= p; j++){
		datos[j]=datos[j+1];
}
		p--;
}
	 public void recorre(byte pos) {
		 for(int j=p+1; j>pos; j--) {
		 	datos[j]=datos[j-1];
}}}
