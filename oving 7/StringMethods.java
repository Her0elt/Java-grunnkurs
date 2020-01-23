class StringMethods{
	String tekst;
	public StringMethods(String bTekst){
		tekst=bTekst;
	}
	public void forkorting(){
		String[]ord=tekst.split(" ");
		for (int i=0;i<ord.length;i++){
			System.out.print(ord[i].charAt(0));
		}
		System.out.println("");
	}
	public void fjerning(String bokstav){
		String str=tekst.replace(bokstav,"");
		System.out.println(str);
	}
}