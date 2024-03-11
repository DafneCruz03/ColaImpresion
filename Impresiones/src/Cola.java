
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
}
