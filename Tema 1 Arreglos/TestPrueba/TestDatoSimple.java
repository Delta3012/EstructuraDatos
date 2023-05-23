package TestPrueba;
import javax.swing.JOptionPane;
import Actualizacion.DatoSimple;
import EntradaSalida.Tools;

public class TestDatoSimple {
    public static void main(String[]args) {
        String menu2="Agregar,Imprimir,Busqueda,Modificar,Eliminar,Salir";
        menu3(menu2);
    }
    public static String boton(String menu)
    {
        String valores[]=menu.split(",");
        int n;
        n = JOptionPane.showOptionDialog(null,"SELECCIONA UNA ACCION", " M E N U Datos Simples",JOptionPane.NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
        return ( valores[n]);
    }
    public static void menu3(String menu)
    {
       
        DatoSimple obj = new DatoSimple((byte)10);
        String sel="";
        byte pos=0;
        do
        {
            sel=boton(menu);
            switch(sel)
            {
                case "Agregar":
                    obj.almacenarDato();
                    break;
                case "Imprimir":
                    if(!obj.validaVacio())Tools.imprimeError("Arreglo vacio");
                    else Tools.imprime("Datos del arreglo" + obj.imprimeDatos());
                    break;
                case "Busqueda":
                    if(obj.validaVacio())
                        Tools.imprimeError("Arreglo Vacio");
                    else
                    {
                         pos = obj.busSecuencial(Tools.leerInt("Ingresa el valor a buscar"));
                        Tools.imprimePantalla("El valor se encuentra en la posicion: "+pos);
                    }
                    break;
                case "Modificar":
                    if(obj.validaVacio())
                        Tools.imprimeError("Arreglo Vacio");
                    else
                    {
                         pos = obj.busSecuencial(Tools.leerInt("Ingresa el valor a buscar"));
                        if(pos>=0)
                        {
                            obj.modificaSimple(pos);
                            Tools.imprimePantalla("Dato modificado" + obj.imprimeDatos());
                        }
                        else
                            Tools.imprimeError("Dato no encontrado");
                    }
                   break;
                case "Eliminar":
                    if(obj.validaVacio())
                        Tools.imprimeError("Arreglo Vacio");
                    else
                    {
                         pos = obj.busSecuencial(Tools.leerInt("Ingresa el valor a buscar"));
                        if(pos>=0)
                        {
                            Tools.imprimePantalla("Dato eliminado en la posicion:" +pos);
                        }
                        else
                            Tools.imprimeError("Dato no encontrado");
                    }
                    break;
                case "Salir":;
                    break;
            }
        }while(!sel.equalsIgnoreCase("Salir"));
}}