import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.exit;
public class Proiect1{
	// definire variabile globale
	// dezvoltare metoda pentru meniu
	int optionRegistered = 0;
	int oraDeschidere, oraInchidere,nrProduse;
	ProduseMarket pr[] = new ProduseMarket[1000];
	String numeMagazin;
	int  buget;
	String res;
	// definire produse market
	public static void Menu (String[] options){
		for (String option: options){
			System.out.println (option);
		}
		// printare mesaje fereastra
	System.out.println ("Alege o optiune");
	}
		// metoda main
		public static void main (String [] args){
			// declarare scanner, random
		Scanner scan = new Scanner (System.in);
		Random rand = new Random ();
			// initializare optiune,buget,nrProduse
		int optiune;
		System.out.println("Introdu bugetu");
		Proiect1 p = new Proiect1 ();
		p.buget=scan.nextInt();
			// mesajul de optiuni
		String[] options = {
			" 1 - Inregistrare marketplace",
			" 2 - Adaugare produse",
			" 3 - Afisare metode de livrare",
			" 4 - Cumparare Produse. Efectuare comenzi",
			" 5 - Iesire din aplicatie",
		};
		// implementare optiuni (apeluri la functii si optimizari comunicare)
		optiune = 1;
		while (optiune!=5){
			// afisarea mesajului de meniu
			Menu (options);
				optiune = scan.nextInt();
				switch (optiune){
					case 1 : p.register ();break;
					case 2: p.products();break;
				   	case 3: p.livrare(p.buget); break;
					case 4: p.comanda(p.buget); break;
					case 5: exit(0); break;
				}
			}
			}
	// implementare metode pentru a face legaturi cu optiunile
		private  void register () {
					// declarare scanner, random
			Scanner scan = new Scanner (System.in);
			System.out.println  ("Inregistrare marketplace");
			System.out.println ("Introdu numele magazinului");
			numeMagazin = scan.next();
			System.out.println ("Introdu ora de deschidere si de inchidere a magazinului");
			do {
				System.out.println ("Ora de deschidere trb sa fie >6 si de inchidere <24");
				oraDeschidere = scan.nextInt();
				oraInchidere = scan.nextInt();
				optionRegistered = 1;
			}
			while (oraDeschidere < 6 && oraInchidere <24);
			System.out.println ("Magazinul "+numeMagazin);
			System.out.println ("Programul in fiecare zi de la "+oraDeschidere+" - "+oraInchidere);
		}
		// option 2 problema cu referintele pulii
	private void products (){
		if (optionRegistered == 0){
			System.out.println ("Nu exista informatii despre marketplace. Reveniti pana la introducerea informatilor.");
		} else {
			System.out.println ("Introdu numarul de produse pentru marketplace-ul "+numeMagazin);
			Scanner scan = new Scanner (System.in);
			nrProduse = scan.nextInt();
			System.out.println (nrProduse);
			// initalizare in vectori de produse. cu informatii produse (nume, lot,stoc si pret)
			for (int i = 0; i<nrProduse;i++){
				System.out.println ("Pentru produsul "+i+" introdu numele, lot, stoc si pretul");
				pr[i] = new ProduseMarket("0","0",0,0);
				pr[i].setNume(scan.next());
				pr[i].setLot(scan.next());
				pr[i].setStoc (scan.nextInt());
				pr[i].setPret(scan.nextInt());
			}
		}
	}
private void livrare (int buget){
	Scanner scan = new Scanner (System.in);
	int pret=20;
	System.out.println ("Livrarea te va costa 20 de unitati monetare.Doresti livrare?");
	res=scan.next();
	String da = "da";
	if (res.equals(da)){
	if (buget<20){
		System.out.println ("Nu sunt bani suficienti");
		} else{
		buget-=20;
		System.out.println ("Efectuat cu succes mai ai "+buget+"unitati monetare");
		}
	}
	}

private void comanda (int buget){
// afisare produse
	Scanner scan = new Scanner (System.in);
	for (int i=0;i<nrProduse;i++){
		System.out.println (i+"."+pr[i].getNume()+ " lot "+pr[i].getLot()+" stoc "+pr[i].getStoc()+" pret "+pr[i].getPret());
	}
	int contor=-1,cantitate;
	while (contor!=-2){
	System.out.println("Alege produsele, unul cate unul pana la -2");
	contor = scan.nextInt();
	System.out.println ("Alege cantitatea produsului "+pr[contor].getNume());
	cantitate = scan.nextInt();
	if (pr[contor].getPret()*cantitate < buget) {
		if (pr[contor].getStoc()>0){
			buget-=contor*pr[contor].getPret();
			System.out.println ("Buget ramas "+buget);
	} else {
		System.out.println ("Produsul "+pr[contor].getNume()+ "nu mai este pe stoc");
	} }
	else{
		System.out.println ("Nu te incadrezi in  pret! ");
	}
	}
	}
	}
