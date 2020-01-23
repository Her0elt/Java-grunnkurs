import java.util.Scanner;
class Text{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Skriv inn teksten din");
		String text=in.nextLine();
		System.out.println("Skriv en bokstav du har lyst til å lete etter");
		String userBokstav=in.nextLine();
		char ub=userBokstav.charAt(0);
		TekstAnalyse t1=new TekstAnalyse();
		t1.Analyse(text);
		t1.skrivArray();
		t1.finnTotal();
		t1.finnProsent();
		t1.forekomster(ub);
		t1.flest();
	}
}