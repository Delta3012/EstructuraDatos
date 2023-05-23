package Menus;
import javax.swing.JOptionPane;
import PilasEstatica.PilaA;
import EntradaSalida.Tools;

public class MenuPilaA<T> {
	public static void menu3(String menu) {
		String sel="";
		PilaA <Integer> pila = new PilaA<Integer>((byte)10);
		
		do {
		sel=boton(menu);
		switch(sel) {
		case "Push":
			pila.push(Tools.leerInt("Escribe un valor entero"));
				Tools.imprime("Datos de la pila \n"+pila.toString());
			break;
		case "Pop": 
			if(pila.isEmpty())Tools.imprimeError("¡pila Vacia!");
			else 
				Tools.imprime("Dato eliminado de la cima \n"+pila.pop());
			break;
		case "Peek":	
			if(pila.isEmpty())Tools.imprimeError("¡Pila vacia!");
			else {
				Tools.imprimePantalla("Dato de la cima de la pila: \n"+pila.peek());
			} 
			break;
		case "Free": Tools.imprimePantalla("Purgando todos los datos de la pila");
			if (pila.isEmpty())Tools.imprimeError("Pila vacia!");
			else {
				pila=new PilaA((byte)10);
			}
			break;
		case "Salir": Tools.imprime("Proceso terminado");
			break;
		}
		}while(!sel.equalsIgnoreCase("Salir"));
}
	public static void main(String []args) {	//Recordatorio 
		String menu2="Push,Pop,Peek,Free,Salir"; //TODO ¡esto no de de ir espaciado! 
			   menu3(menu2);
}
	public static String boton(String menu) {
		String valores[]=menu.split(",");
		int n;
		n=JOptionPane.showOptionDialog(null,"Selecciona una opcion","MENU Pila A",
		  JOptionPane.NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
	return(valores[n]);
}}
