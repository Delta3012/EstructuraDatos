package Metodos;

public class Burbuja {

	public static String ordenaBurbuja(int datos[], int i) {
	if(i<datos.length-1) {
	return burbuja_Intercambio(datos, i, i+1)+ordenaBurbuja(datos,i+1);
	}
	else return "";
	}
	public static String burbuja_Intercambio(int datos[], int i, int j) {
	int aux=0;
	if(j<datos.length) {
	if(datos[i]>datos[j]) {
		aux=datos[i];
		datos[i]=datos[j];
		datos[j]=aux; 	
	}
	return burbuja_Intercambio(datos, i, j+1);
	}
	return "";
}}
