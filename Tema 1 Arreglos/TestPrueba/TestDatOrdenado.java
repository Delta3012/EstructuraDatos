package TestPrueba;
import javax.swing.JOptionPane;
import Actualizacion.DatOrdenado;
import EntradaSalida.Tools;  

public class TestDatOrdenado {
	public static void main(String[] args)
    {
        String menu2="Agregar,Imprimir,Busqueda,Modificar,Eliminar,Salir";
        menu3(menu2);
    }
    public static String boton(String menu)
    {
        String valores[]=menu.split(",");
        int n;

        n = JOptionPane.showOptionDialog(null," SELECCIONA DANDO CLICK ", " M E N U Dato Ordenado",
                JOptionPane.NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,
                valores,valores[0]);
        return (valores[n]);
    }
    public static void menu3(String menu)
    {
        DatOrdenado obj = new DatOrdenado((byte)10);;
        String sel="";
        byte pos=0;
        do
        {
            sel=boton(menu);
            switch(sel)
            {
                case "Agregar":
                    obj.agregarOrdenado();
                    break;
                case "Imprimir":
                    if(obj.validaVacio())
                        Tools.imprimeError("Arreglo vacio");
                    else
                        Tools.imprimePantalla("Datos del arreglo" + obj.imprimeOrdenados());
                    break;
                case "Busqueda":
                    if(obj.validaVacio())
                        Tools.imprimeError("Arreglo vacio");
                    else
                    {
                         pos = obj.busquedaOrdenada(Tools.leerInt("Ingrese el valor"));
                        if (pos >= 0)
                            Tools.imprimePantalla("Se encuentra en la posicion: " + pos);
                        else
                            Tools.imprimeError("Se debe de insertar en la posicion" + pos * (-1));
                    }
                    break;
                case "Modificar":
                	if(obj.validaVacio()) Tools.imprime("Array vacio");
					else 
					{
						pos = obj.BuSecuencialOrdenada(Tools.leerInt("Numero a modificar"));
						if(pos>=0)
						{
							Tools.imprime("Dato modificado en la posicion: " +pos);
							obj.modificaOrdenados(pos);
							Tools.imprime("Datos del arreglo"+obj.imprimeOrdenados());
						}
						else Tools.imprimeError("Dato no encontrado");
					}
					break;

                case "Eliminar":
                    if(obj.validaVacio())
                        Tools.imprimeError("Arreglo Vacio");
                    else {
                         pos = obj.busquedaOrdenada(Tools.leerInt("Ingrese el valor"));
                        if (pos >= 0) {
                            obj.eliminaDato((byte) pos);
                            Tools.imprimePantalla("Dato eliminado en la posicion: " + pos);

                    } else
                          Tools.imprimeError("Dato no encontrado");
                    }
                    break;
                case "Salir":;
                    break;
}}
        while(!sel.equalsIgnoreCase("Salir"));
}}
