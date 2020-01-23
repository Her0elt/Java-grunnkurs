//Programmet tester hvilket av de to Kjøtt pakkene er billigst
class Oving2Oppg2{
	public static void main(String[]args){
		double kA=35.90;
		double kB=39.50;
		double kjottAPrG=(kA/450);
		double kjottBPrG=(kB/500);

		if(kjottAPrG>kjottBPrG){
			System.out.println("Kjøtt A koster mer pr kg enn Kjøtt B derfor er B billigere enn A");
		}else{
			System.out.println("Kjøtt A koster mindre pr kg enn Kjøtt B derfor er A billigere enn B");
		}
	}
}