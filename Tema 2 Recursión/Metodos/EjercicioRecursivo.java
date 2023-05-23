package Metodos;
public class EjercicioRecursivo {

	public static int OctalRec(int nOctal,int cont, int decimal)
	{
	if(decimal!=0)
		return OctalRec((nOctal+((decimal % 8)*cont)),cont + 10, decimal/8);
	return nOctal;
	}
	public static int potenciaRecursiva(int i, int n, int p, int potencia)
	{
	if(i<p)
		return potenciaRecursiva(i+1,n,p,potencia*n);
	else return potencia;
	}
	public static int Decimal(String binario, int decimal, int potencia)	
	{
	int val = Integer.parseInt(binario);	
	if(val!=0) return Decimal(Integer.toString(val/10), (int) (decimal+(((Integer.parseInt(binario)%10)*Math.pow(2,potencia)))), potencia+1);
	else return decimal; 
	}
	public static String fibonacciRecursivo(int incremento, int n, int f, int numero, int i)
	{
	if(i<=incremento)
		return "\n"+numero+fibonacciRecursivo(incremento, f,(f+n),(n+f),i+1);
	else return "";
}}
