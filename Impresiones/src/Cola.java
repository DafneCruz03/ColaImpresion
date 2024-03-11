
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

}
