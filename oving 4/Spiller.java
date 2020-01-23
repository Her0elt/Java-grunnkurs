
class Spiller{
	 int sumPoeng;



	public int getSumPoeng(){
	 return sumPoeng;
	}


	public void kastTerning(String spillerNavn ){
		java.util.Random terning=new java.util.Random();
		int terningkast=terning.nextInt(6)+1;
		System.out.println(spillerNavn+ " har kastet "+terningkast);
		System.out.println("");
		if(terningkast==1){
			sumPoeng=0;
		}
		else{
			sumPoeng+=terningkast;
		}
		if(sumPoeng>100){
			sumPoeng-=terningkast;
		}
	}
	 public void erFerdig(String spillerNavn){
		 System.out.println(spillerNavn+ " har vunnet");

	}

}