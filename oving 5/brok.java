class brok{
	private int x;
	private int y;

	public brok(int teller, int nevner){
		x=teller;
		y=nevner;
		if(nevner==0){
		throw new ArithmeticException("Du har skrevet inn en ugyldig verdi");
		}

	}

	public brok(int teller){
	x=teller;
	y=1;

	}
	public int getTeller(){
		return x;
	}

	public int getNevner(){
		return y;
	}

	public void sub(int tall1,int tall2){
		int tellerSvar=(tall2*this.x)-(tall1*this.y);
		int nevnerSvar=(tall2*this.y);
		String svar=(tellerSvar+"/"+nevnerSvar);
		System.out.println("Svaret blir da "+svar);

	}
	public void multi(int tall1,int tall2){
		int tellerSvar=this.x*tall1;
		int nevnerSvar=this.y*tall2;
		String svar=(tellerSvar+"/"+nevnerSvar);
		System.out.println("Svaret blir da "+svar);


	}
	public void div(int tall1,int tall2){
		int tellerSvar=this.x*tall2;
		int nevnerSvar=this.y*tall1;
		String svar=(tellerSvar+"/"+nevnerSvar);
		System.out.println("Svaret blir da "+svar);

	}
	public void pluss(int tall1,int tall2){
		int tellerSvar=(tall2*this.x)+(tall1*this.y);
		int nevnerSvar=(tall2*this.y);
		String svar=(tellerSvar+"/"+nevnerSvar);
		System.out.println("Svaret blir da "+svar);
	}
	public static void main(String[]args){
		brok brok1=new brok(2,3);
		brok brok2=new brok(4);

		int a = brok2.getTeller();
		int b = brok2.getNevner();

		brok1.pluss(a,b);
		brok1.sub(a,b);
		brok1.div(a,b);
		brok1.multi(a,b);

	}







}