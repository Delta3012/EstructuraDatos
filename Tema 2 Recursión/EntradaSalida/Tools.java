package EntradaSalida;
import javax.swing.JOptionPane; 
public class Tools {
	
		public static String leerString(String msje){
	    
			return(JOptionPane.showInputDialog(null,msje,"Lectura String",JOptionPane.QUESTION_MESSAGE));
		}
		public static float leerFloat(String msje){
	        return(Float.parseFloat(JOptionPane.showInputDialog(null,msje,"Lectura Float",JOptionPane.QUESTION_MESSAGE)));
		}
		public static double leerDouble(String msje){
	        return(Double.parseDouble(JOptionPane.showInputDialog(null,msje,"Lectura Double",JOptionPane.QUESTION_MESSAGE)));
	    }
		public static char leerChar(String msje){
	        return(JOptionPane.showInputDialog(null,msje,"Lectura Char",JOptionPane.QUESTION_MESSAGE).charAt(0));
	    }
	        public static void imprimePantalla(String msje)
		{	
			JOptionPane.showMessageDialog(null,msje,"Salida datos",JOptionPane.QUESTION_MESSAGE);
		}	
			public static void imprimeError(String msje) 
		{
			JOptionPane.showMessageDialog(null,msje,"¡Error!",JOptionPane.ERROR_MESSAGE);
		}
			public static short leerShort(String msje)
		{
			return (Short.parseShort(JOptionPane.showInputDialog(null,msje,"Dato [short]",JOptionPane.INFORMATION_MESSAGE)));
		}
			public static byte leerByte(String msje)
		{	
			return (Byte.parseByte(JOptionPane.showInputDialog(null,msje,"Dato [byte]",JOptionPane.INFORMATION_MESSAGE)));
		}
			public static int leerInt(String msje)
		{	
			return (Integer.parseInt(JOptionPane.showInputDialog(null,msje,"Dato [int]",JOptionPane.INFORMATION_MESSAGE)));
		}
			public static void imprime(String msje){
				JOptionPane.showMessageDialog(null,msje,"Salida",JOptionPane.INFORMATION_MESSAGE);
	    }
			public static long leerLong(String msje)
		{	
			return(Long.parseLong(JOptionPane.showInputDialog(null,msje,"Dato [long]",JOptionPane.INFORMATION_MESSAGE)));
		}
			public static String  Carrera() {
				  String valores[] = { "Ing. En Sistemas", "Ing. Informatica" };
				  return ((String) JOptionPane.showInputDialog(null, "seleciona", "tu carrera", JOptionPane.QUESTION_MESSAGE, null,
				  valores, valores[0]));		
	}
			public static byte Semestre(){
			        String valores[] = { "1","2","3","4","5","6","7","8","9","10","11","12" };
			        return Byte.parseByte((String)JOptionPane.showInputDialog(null,"Selecciona ","Semestre",JOptionPane.QUESTION_MESSAGE, null,valores,valores[0])); 
	}
			public static int seguirsino()
	{
			return JOptionPane.showConfirmDialog(null,"¿Deseas continuar?","Capturando datos",JOptionPane.INFORMATION_MESSAGE);	
}
			public static void imprimePantalla(int decimal) {
				// TODO Auto-generated method stub
				
			}}
