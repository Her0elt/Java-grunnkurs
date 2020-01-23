class TerningSpill{
	public static void main(String[]args){
		Spiller spiller1= new Spiller();
		Spiller spiller2= new Spiller();
		int kastNr=0;

		while(spiller1.getSumPoeng()<100 && spiller2.getSumPoeng()<100){
			kastNr++;
			System.out.println("Dette er runde "+kastNr+":");
			System.out.println("");
			spiller1.kastTerning("Spiller 1");
			spiller2.kastTerning("Spiller 2");
			System.out.println("Spiller 1 har nå "+spiller1.getSumPoeng());
			System.out.println("Spiller 2 har nå "+spiller2.getSumPoeng());
			System.out.println("");
		}
		if(spiller1.getSumPoeng()==100){
			spiller1.erFerdig("Spiller 1");
		}
		else if(spiller2.getSumPoeng()==100){
			spiller2.erFerdig("Spiller 2");
		}

	}
}