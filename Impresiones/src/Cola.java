import javax.swing.JOptionPane;

public class Cola {
	private Nodo inicioCola, finalCola;
	String Cola = "";  //atributos 
	
	public Cola() {
		inicioCola = null;
		finalCola = null;
	}//constructor1
	
	//colavacia
	public boolean ColaVacia() {
		if(inicioCola==null) {
			return true;
		}else {
			return false;
		}
	}//finMetodo la cola vacia nos servira para verificar que no haya archivos pendientes 
	//insertaralaCola
			public void Insertar(int info) {
				Nodo nuevo = new Nodo();
				nuevo.info=info;
				nuevo.siguiente=null;
				
				if (ColaVacia()) {
					inicioCola =  nuevo;
					finalCola = nuevo;
				}else {
					finalCola.siguiente=nuevo;
					finalCola=nuevo;
				}
			}//finMetodo
			
			//imprimir(salir)delaCola
			
			public int Extraer() {
				if (!ColaVacia()) {
					int info = inicioCola.info;
					
					if (inicioCola == finalCola) {
						inicioCola=null;
						finalCola=null;
					}else {
						inicioCola=inicioCola.siguiente;
					}
					return info;
				}else {
					return Integer.MAX_VALUE;
				}
			}//finMetodo
			//Necesitamos un metodo para vaciar la cola (como cuando se traban)
			public void VaciarCola(int info) {
				info=0;
				inicioCola=null;
				finalCola=null;
				JOptionPane.showMessageDialog(null, "La cola de impresion se ha vaciado correctamente");
				//declaro la variable vacias para dar entender que ya no hay elementos, y al mismo tiempo mando el mensaje de que ya no hay elementos.
				//falta el metodo de pendiente
			}
			
			//mostrarCola
			public void MostrarCola() {
				Nodo recorrido = inicioCola;
				String ColaInvertida = "";
				
				//ciclo
				while(recorrido!=null) {
					Cola += recorrido.info;
					recorrido = recorrido.siguiente;
				}//finCiclo
				
				String cadena[] = Cola.split(" ");
				
				for (int i=cadena.length-1; i>=0; i--) {
					ColaInvertida += " " +cadena[i];
				}//contadores
				
				JOptionPane.showMessageDialog(null, ColaInvertida);
				Cola = " ";
			}//finMetodo
			
			
}
