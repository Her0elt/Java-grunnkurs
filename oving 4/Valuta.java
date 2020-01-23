import java.util.Scanner;

public class Valuta{

	private double x;
	private String y;

 	public Valuta(double kurs ,String navn){
		x=kurs;
		y=navn;
	}
	public void OmgjoringFraNok(){
		Scanner henter=new Scanner(System.in);
		System.out.println("Skriv inn ditt beløp");
		double penger=henter.nextDouble();
		double svar=penger/x;
		/*System.out.printf("Det blir %-8.2",svar);
		System.out.print(y);*/
		System.out.println("Det blir "+svar+" "+y);
		System.out.println("");
	}
	public void OmgjoringTilNok(){
			Scanner henter=new Scanner(System.in);
			System.out.println("Skriv inn ditt beløp");
			double penger=henter.nextDouble();
			double svar=penger*x;
			/*System.out.printf("Det blir %-8.2",svar);
			System.out.print(y);*/
			System.out.println("Det blir "+svar+" NOK");
			System.out.println("");
	}

 	public static void main(String[]args){
		Valuta dollar=new Valuta(9,"dollar");
		Valuta euro=new Valuta(10,"euro");
		Valuta sek=new Valuta(0.93,"SEK");
		Scanner in=new Scanner(System.in);

		boolean fortsett=true;
		while(fortsett){
			System.out.println("Velg hvilken valuta du ønsker 1 Dollar 2 Euro 3 Svenske kroner 4 Avslutt program");
			int valg=in.nextInt();
			if(valg==1){
				System.out.println("Velg 1 for NOK til Dollar eller 2 for Dollar til NOK");
				int velger1=in.nextInt();
				if(velger1==1){
					dollar.OmgjoringFraNok();
				}
				else{
					dollar.OmgjoringTilNok();
			}
			}
			if(valg==2){
				System.out.println("Velg 1 for Euro til Dollar eller 2 for Euro til NOK");
				int velger2=in.nextInt();
				if(velger2==1){
					euro.OmgjoringFraNok();
				}
				else{
					euro.OmgjoringTilNok();
				}
			}
			if(valg==3){
					System.out.println("Velg 1 for NOK til SEK eller 2 for SEK til NOK");
					int velger3=in.nextInt();
				if(velger3==1){
					sek.OmgjoringFraNok();
				}
				else{
					sek.OmgjoringTilNok();
				}
				}
			if(valg==4){
				fortsett=false;
				System.out.println("Ha en fin dag, takk");

				}



		}
	}
}