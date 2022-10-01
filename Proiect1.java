import java.util.*;
import static java.lang.System.exit;
// incepere program
public class Proiect1 {
	public static void main  (String args[]) {
	Scanner sc =new Scanner (System.in);
	System.out.println ("Inainte de a incepe programul, introdu un buget.");
	int n = sc.nextInt();
	System.out.println ("Bugetul tau este "+n+" unitati monetare");
	String[] options ={
	"1 - Catalogul cu articole de gradinarit",
	"2 - Catalogul cu articole de casa",
	"3 - Catalogul cu decoratiuni",
	"4 - Iesire",
	};
	// implementare options
	int option=1;
	while (option!=4){
		Meniu (options);
		try {
			option=sc.nextInt();
			switch (option){
			case 1:option1(n);break;
			case 2:option2(n);break;
			case 3:option3(n);break;
			case 4:exit(0);break;
			}
		}
		catch (Exception ex){
			sc.next();
		}
 }  }
	public static void Meniu (String[] options){
	// dezvoltare optiuni
	for (String option : options){
			System.out.println(option);
		}
	System.out.println ("Bun venit in Marketplace-ul nostru.");
	System.out.println ("Alege un compartiment.");
// acorlasa de la marketplace
}
 public static void option1 (int n){
 	System.out.println ("testare optiune 1");
}
 public static void option2 (int n){
 	System.out.println ("testare optiune 2");}

 public static void option3 (int n){
 	System.out.println ("testare optiune 3");
 }
 }