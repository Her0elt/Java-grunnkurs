//Programmet tester hvilket av de to Kj�tt pakkene er billigst
class Oving2Oppg2{
	public static void main(String[]args){
		double kA=35.90;
		double kB=39.50;
		double kjottAPrG=(kA/450);
		double kjottBPrG=(kB/500);

		if(kjottAPrG>kjottBPrG){
			System.out.println("Kj�tt A koster mer pr kg enn Kj�tt B derfor er B billigere enn A");
		}else{
			System.out.println("Kj�tt A koster mindre pr kg enn Kj�tt B derfor er A billigere enn B");
		}
	}
}