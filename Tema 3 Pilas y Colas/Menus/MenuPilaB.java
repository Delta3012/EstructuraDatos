package Menus;
import javax.swing.JOptionPane;
import PilaDinamica.PilaB;
import EntradaSalida.Tools;

public class MenuPilaB {
	
	public static void menu3(String menu) {
	String sel="";
	PilaB <Integer> pila = new PilaB<Integer>();
	
	do {
		sel=boton(menu);
		switch(sel) {
		
		case "Push":
			pila.push(Tools.leerInt("Escribe un valor entero: "));
			Tools.imprime("Datos de la pila \n"+pila.toString());
			break;
		case "Pop":
			if(pila.isEmpty())Tools.imprimeError("¡Pila vacia!");
			else Tools.imprime("Dato eliminado de la cima... \n"+pila.pop());
			break;
		case "Peek":
			if(pila.isEmpty())Tools.imprimeError("¡Pila vacia!");
			else {	
			Tools.imprime("Desplegando datos de la cima de la pila \n"+pila.peek());
		}
		case "Free": 
			Tools.imprimePantalla("Purgando todos los datos de la pila");
			if(pila.isEmpty())Tools.imprimeError("Pila vacia ");
			else {
				pila.vaciar();
			}
			break;
		case "Salir": Tools.imprime("Proceso Terminado");
		break; 
		}
	}while(!sel.equalsIgnoreCase("Salir"));
	}
	public static void main(String[]args) {
		String menu2="Push,Pop,Peek,Free,Salir";
		menu3(menu2);
	}
	public static String boton(String menu) {
		String valores[]=menu.split(",");
		int n; 
		n = JOptionPane.showOptionDialog(null, "SELECCIONA DANDO CLIC ", "MENU Pila B",
			JOptionPane.INFORMATION_MESSAGE,JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);
		return(valores[n]);
}}
			