import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/* ćw 1 enum-y */

		/* zad.1
			a) Stworzyć prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi słownie,
			b) stworzyć prosty enum "StatusEnum" z wartościami KONTYNUUJEMY i KONIEC,
			c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla),
			d) niech w pętli są podawane wartości liczbowe z klawiatury,
			e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie,
			f) umieścić w pętli switch() case: które będą wypisywały cyfry słownie odpowiednio
			do podanych cyfr przez użytkownika,
			g) gdy użytkownik wciśnie 0 ma wyświetlić się status KONIEC w innym wypadku KONTYNUUJEMY :),
		*/
		Scanner scan = new Scanner(System.in);
		while (true) {
			int liczba = scan.nextInt();
			switch (liczba) {
				case 0:
					System.out.println(StatusEnum.KONIEC);
					return;
				case 1:
					System.out.println(LiczyEnum.JEDEN);
					System.out.println(StatusEnum.KONTYNUUJEMY);
					break;
				case 2:
					System.out.println(LiczyEnum.DWA);
					System.out.println(StatusEnum.KONTYNUUJEMY);
					break;
				case 3:
					System.out.println(LiczyEnum.TRZY);
					System.out.println(StatusEnum.KONTYNUUJEMY);
					break;
				case 4:
					System.out.println(LiczyEnum.CZTERY);
					System.out.println(StatusEnum.KONTYNUUJEMY);
					break;
				case 5:
					System.out.println(LiczyEnum.PIEC);
					System.out.println(StatusEnum.KONTYNUUJEMY);
					break;
				case 6:
					System.out.println(LiczyEnum.SZESC);
					System.out.println(StatusEnum.KONTYNUUJEMY);
					break;
				default:
					System.out.println(StatusEnum.KONTYNUUJEMY);
					break;
			}
		}

		/* statusy i wybór ze switch case to najczęstsze użycia enumów, enumy są często używane
		 * w różnego rodzaju listach, selectach jako krótkie opcje wyboru np. jako status A, X (Aktualny, Usunięty) */

	}
}

enum LiczyEnum {
	JEDEN, DWA, TRZY, CZTERY, PIEC, SZESC
}

enum StatusEnum {
	KONTYNUUJEMY, KONIEC
}