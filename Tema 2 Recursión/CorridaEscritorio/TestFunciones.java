package CorridaEscritorio;
import Metodos.FuncionesIterativas;
import Metodos.FuncionesRecursivas;
import EntradaSalida.Tools;
public class TestFunciones {
	public static void main(String[] args) {
	//Impresion funciones Iterativas 2
	Tools.imprimePantalla("Uso while");
	FuncionesIterativas.usoWhile(10);
	
	Tools.imprimePantalla("Uso DoWhile");
	FuncionesIterativas.usoDoWhile(20);
	
	Tools.imprimePantalla("Uso For");
	FuncionesIterativas.usoFor(30);
	
	Tools.imprimePantalla("Tabla multiplicar");
	FuncionesIterativas.tablaMultiplicar((byte)5);
	
	int arreglo[]= {1,2,3,4,5,6,7,8,9,10};
	
	Tools.imprimePantalla("Display arreglo");
	FuncionesIterativas.imprimeArray(arreglo);
	
	//Impresion funciones recursivas 2
	
/*	Tools.imprimePantalla("Funcion Recursiva normal");
	Tools.imprimePantalla(FuncionesRecursivas.funcionIterativa1(1,10));
	
	Tools.imprimePantalla("Fucnion recursiva binaria");
	Tools.imprimePantalla(FuncionesRecursivas.funcionIterativaBinaria(1,20));
	
	Tools.imprimePantalla("Tablas de multiplicar decimal");
	Tools.imprimePantalla(FuncionesRecursivas.tablaMultiplicar((byte)1,(byte)5));
	
	Tools.imprimePantalla("tabla de multiplicar binaria");
	Tools.imprimePantalla(FuncionesRecursivas.tablaMultiplicarBinaria((byte)1,(byte)10));
	
	int arreglo1[] = {1,2,3,4,5,6,7,8,9,10};
	int arreglo2[] = {10,20,30,40,50,60,70,80,90,100};
	Tools.imprimePantalla("impresion de arreglos en decimal");
	Tools.imprimePantalla(FuncionesRecursivas.verArray(0,arreglo1));
	
	Tools.imprimePantalla("impresion de arreglos en binario");
	Tools.imprimePantalla(FuncionesRecursivas.verArrayBinario(0, arreglo2));*/
}}