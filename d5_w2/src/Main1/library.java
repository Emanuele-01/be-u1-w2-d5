package Main1;

import java.util.List;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import java.util.ArrayList;

public class library {
	
	private static Logger logger = (Logger) LoggerFactory.getLogger(library.class);
	
	static List<carta> library = new ArrayList<>();

	public static void main(String[] args) {
		
// creazione libri
		
		books libro1 = new books("9788806229079", "1984", "2017", 416, "George Orwell", "Distopia");
		
		books libro2 = new books("9788807882576", "Il cacciatore di aquiloni", "2003", 368, "Khaled Hosseini", "Romanzo storico");
		
		books libro3 = new books("9788807901635", "Orgoglio e pregiudizio", "2013", 416, "Jane Austen", "Romanzo d'amore");
		
		books libro4 = new books("9788804668718", "La ragazza del treno", "2016", 408, "Paula Hawkins", "Thriller psicologico");
		
		books libro5 = new books("9788858640448", "La verità sul caso Harry Quebert", "2012", 656, "Joël Dicker", "Thriller");
		
		books libro6 = new books("9788877827025", "Harry Potter e la Pietra Filosofale", "2011", 256, "J.K. Rowling", "Fantasia per ragazzi");
		
		books libro7 = new books("9788845278282", "Il nome della rosa", "2014", 592, "Umberto Eco", "Giallo storico");
		
		books libro8 = new books("9788804680369", "Il signore degli anelli: La Compagnia dell'Anello", "2012", 560, ".R.R. Tolkien", "Fantasy epico");
		
		books libro9 = new books("9788807882743", "Il vecchio e il mare", "2003", 144, "Ernest Hemingway", "Romanzo breve");
		
		books libro10 = new books("9788830446134", "La caduta dei giganti", "2010", 1024, "Ken Follett", "Romanzo storico");
			
		
// creazione riviste
		
		riviste rivista1 = new riviste("9788408147631", "Wired", "2022", 110, periodicità.MENSILE);
		
		riviste rivista2 = new riviste("9788804742875", "National Geographic", "2022", 120, periodicità.MENSILE);
		
		riviste rivista3 = new riviste("9788820053749", "Vogue", "2022", 350, periodicità.MENSILE);
		
		riviste rivista4 = new riviste("9788868362275", "The New Yorker", "2022", 80, periodicità.SETTIMANALE);
		
		riviste rivista5 = new riviste("9788846785685", "Time", "2022", 84, periodicità.SETTIMANALE);
		
		riviste rivista6 = new riviste("9788868367102", "The Economist", "2021", 110, periodicità.SEMESTRALE);
		
		riviste rivista7 = new riviste("9788820042873", "National Geographic Traveler", "2020", 135, periodicità.SEMESTRALE);
		
		
// aggiunta libro
		addLibro(libro1);
		addLibro(libro2);
		addLibro(libro3);
		addLibro(libro4);
		addLibro(libro5);
		addLibro(libro6);
		addLibro(libro7);
		addLibro(libro8);
		addLibro(libro9);
		addLibro(libro10);
		
// aggiunta riviste
		
		addRivista(rivista1);
		addRivista(rivista2);
		addRivista(rivista3);
		addRivista(rivista4);
		addRivista(rivista5);
		addRivista(rivista6);
		addRivista(rivista7);
		
		
		logger.info("questa è la attuale libreria: " + library);
		
// ricerca IBSN
		
		searchIBSN("9788408147631");
		
// ricerca anno di publicazione
		
		searchYearPublication("2022");
		
// ricerca per autore
		
		searchAutore("Umberto Eco");
	}
	
// metodo per aggiungere libro e riviste
	
		public static void addLibro(carta fn) {
			library.add(fn);
		};
		public static void addRivista(carta fn) {
			library.add(fn);
		};
	
//metodo per rimuovere un libro

		public static void removeLibro(carta sn) {
			library.remove(sn);
		};
		public static void removeRivista(carta sn) {
			library.remove(sn);
		};
		
// ricerca per IBSN
		
		public static void searchIBSN(String L1) {
			List<carta> searchIbsn = library.stream()
					.filter(ibsn -> ibsn.getISBN().equals(L1)).findFirst().stream().toList();
			logger.info("libro con lo stesso iBSN ricercato: " + searchIbsn.toString());
		};
// ricerca per anno di pubblicazione
		
		public static void searchYearPublication(String Y1) {
			List<carta> searchYear = library.stream()
					.filter(year -> year.getYearProduction().equals(Y1)).findFirst().stream().toList();
			logger.info("libro con lo stesso anno di produzione ricercato: " + searchYear.toString());
		};
		
// ricerca per autore
		
		public static void searchAutore(String A1) {
			List<books> searchAutore = library.stream()
					.filter(carta -> carta instanceof books).map(carta -> (books)carta)
					.filter(books -> books.getAutore().equals(A1)).findFirst().stream().toList();
			logger.info("libro con lo stesso autore ricercato: " + searchAutore.toString());
		};
		
	
}
