package DobleLiga;

import EntradaSalida.Tools;
import javax.swing.JOptionPane;

public class MenuDobleLiga {

	public static void menu3(String menu){
		
        DatosDesordenadosDobleLiga<Integer> lista = new DatosDesordenadosDobleLiga<Integer>();
        
        String sel="";
      
        do {
            sel=boton(menu);
            DatosDesordenadosDobleLiga<Integer> obj;
			switch(sel){
			
			case "Insertar Inicio":
                lista.inserFrente(Tools.leerString("Inserta Frente"));
                Tools.imprime("Datos de la lista\n"+lista.imprimeLista());
                break;
                
            case "Insertar Final":
                if(lista.isListaVacia()) Tools.imprimeError("Lista vacia");
                else {
                	Nodito existe=lista.bucSecLista(Tools.leerString("Nombre a buscar"));                     
                }
                break;
                
            case "Eliminar":
            	
            	break;
            	
            case "Imprimir":
            	if(lista.isListaVacia()) Tools.imprimeError("Lista vacia");
            	else  Tools.imprime("Datos\n"+lista.imprimeLista());
                break;
                
            case "Buscar":
            	if(lista.isListaVacia()) Tools.imprimeError("Lista vacia");
            	else{
            	Nodito  existe = lista.bucSecLista(Tools.leerString("nombre a buscar"));
            	if(existe!=null){                    	
           		 Tools.imprimePantalla("Si existe el dato"+existe.getInfo()+"\n"+lista.imprimeLista());	
            	}else {
            	Tools.imprimeError("No existe el dato");
            	}}
				break;
            case "Modificar": 
            	
            	break;
            case "Ordenar":
            	
            case "Salir": 
            	Tools.imprime("Fin del programa");  
            break;
        }
     
        }while(!sel.equalsIgnoreCase("Salir"));
    }
    public static void main(String[]args) {
        String menu = "Insertar Inicio,Insertar Final,Eliminar,Imprimir,Buscar,Modificar,Ordenar,Salir";
        menu3(menu);
    }
    public static String boton(String menu) {
        String valores[]=menu.split(",");
        int n;
        n = JOptionPane.showOptionDialog(null," SELECCIONA DANDO CLICK ", "Menu doble Liga",
                JOptionPane.NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,
                valores,valores[0]);
        return ( valores[n]);
    
}

	private static String boton1(String menu) {
		// TODO Auto-generated method stub
		return null;
}}
