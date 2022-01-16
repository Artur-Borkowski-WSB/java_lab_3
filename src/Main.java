import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		/* ćw 5 Dziedziczenie */

		/* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
		 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
			a) Proszę stworzyć układ klas dziedziczących po sobie,
			b) proszę użyć pól i metod protected jak i private,
			c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
			d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
			(można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
			e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
			oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
		 */

		List<Pojazd> listaPojazdow = new ArrayList<>();
		Pojazd p1 = new Pojazd("Giant", 5000, 2);
		Pojazd p2 = new Samochod("Volkswagen", 5000, 110, 400, 1900);
		Pojazd p3 = new Samochod("Porsche", 1500000, 510, 10000, 4000);
		Pojazd p4 = new SamochodElektryczny("Tesla", 300000, 510, 1500, 85);
		Pojazd p5 = new SamochodElektryczny("Renault", 150000, 135, 1000, 50);
		listaPojazdow.add(p1);
		listaPojazdow.add(p2);
		listaPojazdow.add(p3);
		listaPojazdow.add(p4);
		listaPojazdow.add(p5);
		for (Pojazd p : listaPojazdow) {
			System.out.println(p);
		}
	}
}
