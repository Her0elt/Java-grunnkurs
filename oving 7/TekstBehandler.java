class TekstBehandler{
	String tekst;
	public TekstBehandler(String minTekst){
		tekst=minTekst;
	}
	public void antallOrd(){
		String[]ord=tekst.split(" ");
		System.out.println("Det er "+ord.length+" ord i teksten din");
	}
	public void snittOrdlengde(){
		String[]ord=tekst.split(" ");
		int lengde=0;
		for(int i=0;i<ord.length;i++){
			lengde+=ord[i].length();
		}
		int snitt=lengde/ord.length;
		System.out.println("Gjennomsnitt lengde til alle ordene er "+snitt);
	}
	public void ordPerSetning(){
		String[]setninger=tekst.split("\\.\\s+");
		int antallOrd=0;
		for(int i=0;i<setninger.length;i++ ){
			String[]ord=setninger[i].split(" ");
			antallOrd+=ord.length;
		}
		int snitt=antallOrd/setninger.length;
		System.out.println(snitt);
	}
	public void skiftUtOrd(String ordet, String nyttOrd){
		String str=tekst.replace(ordet,nyttOrd);
		System.out.println(str);
	}
	public void hentTekst(){
		System.out.println(tekst);
	}
	public void storeBokstaver(){
		System.out.println(tekst.toUpperCase());
	}

}