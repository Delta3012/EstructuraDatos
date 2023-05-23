package MenuCola;
import javax.swing.JOptionPane;
import ColaDinamica.ColaD;
import EntradaSalida.Tools;

public class MenuColaD {
	public static void menu3(String menu) {
		String sel="";
		ColaD <Integer> pila = new ColaD<Integer>();
		
		do {
			sel=boton(menu);
			switch(sel) {
			case "Push":
				pila.pushCola(Tools.leerInt("Escribe un valor entero"));
				Tools.imprime("Datos de la cola:  \n"+pila.toString());
				break;
			case "Pop":
				if(pila.isEmptyCola()) Tools.imprimeError("Cola vacia");
				else Tools.imprime("Dato eliminado de la cima... \n"+pila.popCola());
				break;
			case "Peek":
				if(pila.isEmptyCola()) Tools.imprimeError("Cola vacia");
				else {	
				Tools.imprime("Desplegando datos de la cima de la cola \n"+pila.peekCola());
			}
			case "Salir":
			break; 
			}
		}while(!sel.equalsIgnoreCase("Salir"));
		}
		public static void main(String[]args) {
			String menu2="Push,Pop,Peek,Salir";
			menu3(menu2);
		}
		public static String boton(String menu) {
			String valores[]=menu.split(",");
			int n; 
			n = JOptionPane.showOptionDialog(null, "SELECCIONA DANDO CLIC ", "MENU COLA D",
				JOptionPane.INFORMATION_MESSAGE,JOptionPane.QUESTION_MESSAGE, null, valores, valores[1]);
			return(valores[n]);
}}
