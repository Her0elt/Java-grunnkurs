import java.util.Scanner;
class brokRegning{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("Skriv inn teller til den første brøken");
		int teller1=in.nextInt();
		System.out.println("Skriv inn nenver til den første brøken");
		int nevner1=in.nextInt();
		System.out.println("Skriv inn teller til den andre brøken");
		int teller2=in.nextInt();
		System.out.println("Skriv inn nenver til den andre brøken");
		int nevner2=in.nextInt();
		System.out.println("Velg 1 for subtraksjon, 2 for multiplikasjon, 3 for divison, og 4 for addisjon");
		int vei=in.nextInt();
		brok brok1=new brok(teller1,nevner1);
		if(vei==1){
			brok1.sub(teller2, nevner2);
		}
		else if(vei==2){
			brok1.multi(teller2, nevner2);
		}
		else if(vei==3){
			brok1.div(teller2, nevner2);
		}
		else if(vei==4){
			brok1.pluss(teller2, nevner2);
		}
	}
}