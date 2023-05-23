package Metodos;
public class EjercicioIterativo {
	
	public static int OctalDecimal(int decimal) {
	int nOctal = 0, i=1;
	while (decimal!=0) {
	nOctal = nOctal + (decimal % 8)*1;
	decimal = decimal /8;
	i = i +10;
	}return nOctal;
	}
	public static int potencia(int n, int p)
	{
	int potencia = n; 
	for(int i= 1; i<p;i++)
	{
		potencia = potencia*n;
	}return potencia;
	}
	public static int binario(int binario)
	{
	int decimal= 0;
	int potencia = 0;
	while(binario!=0) {
	decimal += (binario % 10)*Math.pow(2, potencia);
	binario = binario /10;
	potencia++;
	}return decimal;
	}
	public static String fibonacci(int incremento)
	{
		int n = 0;  
		int f = 0;
		String cad="";
		int numero = 0; 
		for(int i = 1; i<incremento;i++) {
		cad+="\n"+numero;
		numero = n + f; 
		n = f;
		f = numero;
		}
		return cad;
}}
