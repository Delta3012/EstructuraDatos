package Menus;
import javax.swing.JOptionPane;
import PilaDinamica.PilaC;
import EntradaSalida.Tools;
public class MenuPilaC {

	public static void menu3(String menu) {
		String sel="";
		PilaC <Integer> pila = new PilaC<Integer>();
		
		do {
			sel=boton(menu);
			switch(sel) {
			
			case "Push":
				pila.push(Tools.leerInt("Escribe un valor entero: "));
				Tools.imprime("Datos de la pila \n"+pila.toString());
				break;
			case "Pop":
				if(pila.isEmpty())Tools.imprimeError("Pila vacia");
				else Tools.imprime("Dato eliminado de la cima... \n"+pila.pop());
				break;
			case "Peek":
				if(pila.isEmpty())Tools.imprimeError("Pila vacia");
				else {	
				Tools.imprime("Desplegando datos de la cima de la pila \n"+pila.peek());
			}
			case "Free": Tools.imprimePantalla("Purgando todos los datos de la pila");
				if(pila.isEmpty())Tools.imprimeError("Pila vacia ");
				else {
				   pila.vaciar();
			}
				break;
			case "Salir":
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
			n = JOptionPane.showOptionDialog(null, "SELECCIONA DANDO CLIC ", "MENU PILA C",
				JOptionPane.INFORMATION_MESSAGE,JOptionPane.QUESTION_MESSAGE, null, valores, valores[1]);
			return(valores[n]);
}}
