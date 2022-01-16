public class Main {

	public static void main(String[] args) {

		/* ćw 2 klasy */
		/* zad.1
			a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
			klasa ma się znajdować w osobnym pliku Student.java
			b) stworzyć 3 objekty klasy student i wstawić je do tablicy
			c) wyświetlić dane z tablicy, użyć pętli for lub forEach
			d) dane powinny być estetycznie przedstawione
		 */
		Student[] tab = {new Student(), new Student(), new Student()};
		tab[0].imie = "Jan";
		tab[0].nazwisko = "Kowalski";
		tab[0].wiek = 20;
		tab[0].aktywny = true;

		tab[1].imie = "Piotr";
		tab[1].nazwisko = "Zieliński";
		tab[1].wiek = 34;
		tab[1].aktywny = false;

		tab[2].imie = "Anna";
		tab[2].nazwisko = "Wilk";
		tab[2].wiek = 22;
		tab[2].aktywny = true;

		for (Student student : tab) {
			System.out.println(student);
		}
	}
}
