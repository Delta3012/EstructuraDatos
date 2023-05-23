package Metodos;
import EntradaSalida.Tools;
public class FuncionesRecursivas {

	public static int funcionIterativa1(int j, int n) {
		if (j <= n) {
			System.out.println(j);
			return funcionIterativa1(j + 1, n);
		} else
			return n;
	}
	public static String funcionIterativa2(int j, int n) {
		if (j <= n) {
			Tools.imprimePantalla("\n"+j);
			return "\n" + j + funcionIterativa2(j + 1, n);
		} else
			return " ";
	}
	public static String funcionIterativa3(int j, int n) {
		return (j <= n) ? "\n" + j + funcionIterativa3(j + 1, n) : "";
	}
	// diseñar un metodo de clase que reciba como parametro un valor entero e
	// imprima la tabla de multiplicar
	public static String tablaMultiplicar(byte num, byte j) {
		if (j <= 10) {
			return num + "*" + j + "=" + (num * j) + "\n" + tablaMultiplicar(num, (byte) (j + 1));
		} else {
			return "";
	}}
	public static String tablaMultiplicarBinaria(byte j, byte n){
	return(j<=10)?"\n"+n+"x"+j+"="+(n+j)+tablaMultiplicarBinaria((byte)(j+1), n):"";
	}
	public static String verArray(int j, int a[]) {
	if(j<a.length)
	{	
	return "\n"+j+"["+a[j]+"]"+verArray((j+1),a);	
		}else return "";
	}
	public static String verArrayBinario(int j, int a[]) {
		return(j<a.length)?"\n"+j+"["+a[j]+"]"+verArrayBinario((j+1),a):"";
	}
	public static String funcionIterativaBinaria(int j, int n)
	{
	return(j<=n)?"\nIncremento"+j+funcionIterativaBinaria(j+1,n):"";
}}
