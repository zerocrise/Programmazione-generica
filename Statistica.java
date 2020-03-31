public class Statistica<T extends Number>{
	private T[] a;

  public Statistica(T[] a){
    
    this.a = a;
    
  }
	
  public double getMedia(){
    double media=0;
    for(int i=0;i<a.length;i++){
      media+= a[i].doubleValue();
    }
    media=media/a.length;
    return media;
  }
}