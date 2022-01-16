import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		/* ćw 4 klasy */

		/* zad.1
				a) Stworzyć klasę Osoba z polami prywatnymi:
				- imie (String),
				- nazwisko (String),
				- indeks (Integer)

				b) stworzyc konstruktory, gettery i settery
				c) napisać metodę w klasie Osoba która zwróci informację o osobie,
		 */

		/* zad.2
				a) Stworzyć klasę Student z polami prywatnymi
				- Osoba osoba,
				- WydzialEnum wydzial;
				b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
				c) stworzyc konstruktory, gettery i settery
				d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
		 */

		/* zad.3
				a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
				b) dodać studentów do Listy ArrayList,
				c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
		 */
		List<Student> listaStudentow = new ArrayList<>();
		Student student = new Student(new Osoba("Jan", "Kowalski", 11111), WydzialEnum.WYDZIAL1);
		listaStudentow.add(student);
		student = new Student(new Osoba("Cezary", "Śląski", 22222), WydzialEnum.WYDZIAL2);
		listaStudentow.add(student);
		student = new Student(new Osoba("Stefan", "Kozłowski", 33333), WydzialEnum.WYDZIAL3);
		listaStudentow.add(student);
		student = new Student(new Osoba("Jakub", "Piotrowski", 44444), WydzialEnum.WYDZIAL1);
		listaStudentow.add(student);
		student = new Student(new Osoba("Alicja", "Filipek", 55555), WydzialEnum.WYDZIAL2);
		listaStudentow.add(student);
		for (Student s : listaStudentow) {
			System.out.println(s); // niejawny toString
		}
	}
}
