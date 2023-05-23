package Metodos;
import EntradaSalida.Tools;
public class FuncionesIterativas {

	public static void usoWhile(int n)
	{
	String cad="";
	int j=1; //valor inicial
	while (j<=n)	//condicion true
	{
	cad+="\nIncremento"+j;
	j++; //incremento
	Tools.imprimePantalla(""+j+cad);
	}}	
	public static void usoFor(int n )
	{	String cad= "";
		//valor inicial, condicion true; incremeto 
		for(int j=1;j<=n;j++)
	{
		cad+="\nIncremento: "+j;
	}
		Tools.imprimePantalla(cad);
	}
	public static void usoDoWhile(int n)
	{ 
	String cad="";
		int j=1;
		do
	{
			cad+=j+"\n";
			j++; //incremento
	}while (j<=n); //condicion true
		Tools.imprimePantalla(""+cad);
	}
	public static void tablaMultiplicar(byte num) {
	String tabla="";
	for(int j=1; j<=10; j++) {
	tabla+=num+"*"+j+"="+(num*j)+"\n";
	}
	Tools.imprimePantalla("Tabla de multiplicar: \n"+tabla);
	}
	public static void imprimeArray(int a[]) {
	String lista=""; 
	for(byte j=0; j<a.length; j++) {
	lista+=j+"["+a[j]+"]"+"\n";
	}
	Tools.imprimePantalla("Lista del arreglo: \n"+lista);
}}
