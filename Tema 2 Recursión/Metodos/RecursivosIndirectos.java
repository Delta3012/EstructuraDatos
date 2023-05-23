package Metodos;

public class RecursivosIndirectos {
public static String imprimeArray(int j, int a[]) {
	if(j< a.length) {
	return "\n"+j+"["+a[j]+"]"+imprimeArray((j+1),a);
}else return "";}	
public static String OrdenaBurbuja(int[] datos, int i) {
if(i<datos.length-1)
	return ordenaBurbuja2(datos, i, i+1);
else return "";
}
public static String ordenaBurbuja2(int[] datos, int i, int j) {
	int aux=0; 
	if(j<datos.length)
	if(datos[i]>datos[j]) {
		aux=datos[i];
		datos[i]=datos[j];
		datos[j]=aux;
		return ordenaBurbuja2(datos, i, j+1);
	}
	else return ordenaBurbuja2(datos, i, j+1);
	return "";
}
public static int multiplicacionRusa(int a, int b) {
	if(a==1) {
	return (b);
}
	if(a%2!=0) {
	return (b+multiplicacionRusa(a/2, b*2));
	}
	else {
	return(multiplicacionRusa(a/2,b*2));	
}}}
