package CorridaEscritorio;
import Metodos.Burbuja;
import Metodos.EjercicioIterativo;
import Metodos.EjercicioRecursivo;
import EntradaSalida.Tools;
public class TestPrueba {
	public static void main(String[]args) {
		
		//Ejercicios Iterativos
		Tools.imprimePantalla(EjercicioIterativo.OctalDecimal(173));
        Tools.imprimePantalla(EjercicioIterativo.potencia(2,2));
        Tools.imprimePantalla(EjercicioIterativo.binario(1111011));
        Tools.imprimePantalla(EjercicioIterativo.fibonacci(100));
        
        //Ejercicio Recursivos
    /*    Tools.imprimePantalla(EjercicioRecursivo.OctalRec(0,1,173));
        Tools.imprimePantalla(EjercicioRecursivo.potenciaRecursiva(1,2,2,2));
        Tools.imprimePantalla(EjercicioRecursivo.Decimal("110",0,0));
        Tools.imprimePantalla(EjercicioRecursivo.fibonacciRecursivo(10, 0,1,0,1));	
	//metodo de burbuja 	
	int dat[]= {35,8,-16,25,60,18,23};
	Burbuja.ordenaBurbuja(dat,0);
	Tools.imprimePantalla("Datos ordenados \n");*/
}}
