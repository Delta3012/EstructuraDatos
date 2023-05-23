package MenuCola;
import javax.swing.JOptionPane;
import ColaDinamica.ColaB;
import EntradaSalida.Tools;

public class MenuColaB {
		public static void menu3(String menu) {
			String sel="";
			ColaB <Integer> cola = new ColaB<Integer>();
			
			do {
				sel=boton(menu);
				switch(sel) {
				case "Push":
					cola.pushCola(Tools.leerInt("Escribe un valor entero"));
					Tools.imprime("Datos de la cola:  \n"+cola.toString());
					break;
				case "Pop":
					if(cola.isEmptyCola()) Tools.imprimeError("Cola vacia");
					else Tools.imprime("Dato eliminado de la cima... \n"+cola.popCola());
					break;
				case "Peek":
					if(cola.isEmptyCola()) Tools.imprimeError("Cola vacia");
					else {	
					Tools.imprime("Desplegando datos de la cima de la cola \n"+cola.peekCola());					
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
				n = JOptionPane.showOptionDialog(null, "SELECCIONA DANDO CLIC ", "MENU COLA B",
					JOptionPane.INFORMATION_MESSAGE,JOptionPane.QUESTION_MESSAGE, null, valores, valores[1]);
				return(valores[n]);
}}
