class Main {
	
  public static void main(String[] args) {
		
    Contenitore<Birra,Birra> c= new Contenitore<>(new Birra(),new Birra());
    Contenitore<Tequila,Integer> d=new Contenitore<>(new Tequila(),1);
    Contenitore<Vino,Double> e=new Contenitore<>(new Vino(),0.76);
    System.out.println(c.getElemento());
     Integer[] valori={1,2,3,4,5,6};
		Statistica<Integer> numeri =new Statistica<>(valori);
		System.out.println(numeri.getMedia());

  }
}