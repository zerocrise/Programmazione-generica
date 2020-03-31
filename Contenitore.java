public class  Contenitore<T,V>{
	private T elemento;
	private V elemento1; 
//Golban
public Contenitore(T elemento,V elemento1){
  this.elemento=elemento;

	this.elemento1=elemento1;
}

//davì
public T getElemento(){
 return  elemento;
}
public V getElemento1(){
  return elemento1;
}

//Spena
public void setElemento(T elemento){

this.elemento = elemento;

}


}