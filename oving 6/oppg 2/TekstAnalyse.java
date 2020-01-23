class TekstAnalyse{
	String tekst;
	int[] antallTegn=new int[30];
	char[] bokstaver={'a','b','c','d','e','f','g','h','i','j',
						'k','l','m','n','o','p','q','r','s','t','u',
						'v','w','x','y','z','æ','ø','å'};

	public void Analyse(String tekst){
		this.tekst=tekst;
		for(int r=0;r<tekst.length();r++){
			int ikkeB=0;
			char bi=tekst.charAt(r);
			for (int i = 0; i <bokstaver.length; i++){
				if(bokstaver[i]==bi){
					antallTegn[i]++;
					ikkeB++;
				}
			}
			if(ikkeB==0){
				antallTegn[29]++;
			}
		}
	}

	public void skrivArray(){
		for(int s=0;s<antallTegn.length;s++){
			if(antallTegn[s]!=0){
				if(s<bokstaver.length){
				System.out.println("Det er "+antallTegn[s]+" av bokstaven "+bokstaver[s]);
				}
				else{
				System.out.println("Det er "+antallTegn[s]+" som ikke er bokstaver");
				}
			}
		}
	}
	public void finnTotal(){
		int sumBokstaver=0;
		for(int r=0;r<tekst.length();r++){
			char bi=tekst.charAt(r);
			for (int i = 0; i <bokstaver.length; i++){
				if(bokstaver[i]==bi){
					sumBokstaver++;
				}
			}
		}
		System.out.println("Det er "+sumBokstaver+" antall bokstaver i teksten");
	}
	public void finnProsent(){
		double sumBokstaver=0;
			for(int r=0;r<tekst.length();r++){
				char bi=tekst.charAt(r);
				for (int i = 0; i <bokstaver.length; i++){
					if(bokstaver[i]==bi){
						sumBokstaver++;
					}
				}
			}
		System.out.println("Det er "+(antallTegn[29]/(sumBokstaver+antallTegn[29]))*100+"% er ikke bokstaver i teksten");
	}
	public void forekomster(char valgtBokstav){
		for (int i = 0; i <bokstaver.length; i++){
			if(bokstaver[i]==valgtBokstav){
				System.out.println("Det er "+antallTegn[i]+" av bokstaven "+valgtBokstav);

			}
		}
	}
	public void flest(){
		int teller=0;

		for(int k=0;k<antallTegn.length;k++){
			if(antallTegn[k]>teller){
				teller=antallTegn[k];
			}
		}
		for(int t=0;t<antallTegn.length;t++){
			if(teller==antallTegn[t]){
				if(t<bokstaver.length){
					System.out.println(bokstaver[t]+" forekommer flest ganger");
				}
				if(teller==antallTegn[29]){
					System.out.println("Det er ikke en bokstav som forekommer flest ganger");
				}
			}
		}
	}
}