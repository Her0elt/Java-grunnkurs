import java.util.Scanner;
class StorTekst{
	public static void main(String[]args){
		String rt="Tre minutter tidligere hadde den norske Genk-profilen ankommet Red Bull Arenas tettpakkede presserom. Østerrikere, tilreisende belgiere og VG var alle på plass for å høre fra 21-åringen og manager Felice Mazzù.";
		TekstBehandler t=new TekstBehandler(rt);
		Scanner in=new Scanner(System.in);
		boolean fortsett=true;
		while(fortsett){
			System.out.println("1 for antall ord 2 for snitt på ord lengde 3 for ord per setning 4 for å bytte ut et ord 5 print tekst 6 for å få teksten med store bokstaver eller 7 for å avslutte");
			int valg=in.nextInt();
			if(valg==1){
				t.antallOrd();
			}
			else if(valg==2){
				t.snittOrdlengde();
			}
			else if(valg==3){
				t.ordPerSetning();
			}
			else if(valg==4){
				in.nextLine();
				System.out.println("Hvilket ord ønsker du å bytte ut?");
				String hentOrd=in.nextLine();
				System.out.println("Hvilket ord ønsker du å sette inn?");
				String settIn=in.nextLine();
				t.skiftUtOrd(hentOrd, settIn);
			}
			else if(valg==5){
				t.hentTekst();
			}
			else if(valg==6){
				t.storeBokstaver();
			}
			else{
				fortsett=false;
			}
		}
	}
}