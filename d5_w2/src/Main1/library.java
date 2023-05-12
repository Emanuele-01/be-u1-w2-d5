package Main1;

import java.util.List;
import java.util.ArrayList;

public class library {

	public static void main(String[] args) {
		
// creazione libri
		
		books libro1 = new books(9788806229079L, "1984", "2017", 416, "George Orwell", "Distopia");
		
		books libro2 = new books(9788807882576L, "Il cacciatore di aquiloni", "2003", 368, "Khaled Hosseini", "Romanzo storico");
		
		books libro3 = new books(9788807901635L, "Orgoglio e pregiudizio", "2013", 416, "Jane Austen", "Romanzo d'amore");
		
		books libro4 = new books(9788804668718L, "La ragazza del treno", "2016", 408, "Paula Hawkins", "Thriller psicologico");
		
		books libro5 = new books(9788858640448L, "La verità sul caso Harry Quebert", "2012", 656, "Joël Dicker", "Thriller");
		
		books libro6 = new books(9788877827025L, "Harry Potter e la Pietra Filosofale", "2011", 256, "J.K. Rowling", "Fantasia per ragazzi");
		
		books libro7 = new books(9788845278282L, "Il nome della rosa", "2014", 592, "Umberto Eco", "Giallo storico");
		
		books libro8 = new books(9788804680369L, "Il signore degli anelli: La Compagnia dell'Anello", "2012", 560, ".R.R. Tolkien", "Fantasy epico");
		
		books libro9 = new books(9788807882743L, "Il vecchio e il mare", "2003", 144, "Ernest Hemingway", "Romanzo breve");
		
		books libro10 = new books(9788830446134L, "La caduta dei giganti", "2010", 1024, "Ken Follett", "Romanzo storico");
		
// creazione array libreria di libri e aggiunta dei libri
		
		List<books> libreriaBook = new ArrayList<books>();
		
		libreriaBook.add(libro1);
		libreriaBook.add(libro2);
		libreriaBook.add(libro3);
		libreriaBook.add(libro4);
		libreriaBook.add(libro5);
		libreriaBook.add(libro6);
		libreriaBook.add(libro7);
		libreriaBook.add(libro8);
		libreriaBook.add(libro9);
		libreriaBook.add(libro10);
		
// creazione riviste
		
		riviste rivista1 = new riviste(9788408147631L, "Wired", "2022", 110, "mensile");
		
		riviste rivista2 = new riviste(9788804742875L, "National Geographic", "2022", 120, "mensile");
		
		riviste rivista3 = new riviste(9788820053749L, "Vogue", "2022", 350, "mensile");
		
		riviste rivista4 = new riviste(9788868362275L, "The New Yorker", "2022", 80, "settimanale");
		
		riviste rivista5 = new riviste(9788846785685L, "Time", "2022", 84, "settimanale");
		
		riviste rivista6 = new riviste(9788868367102L, "The Economist", "2021", 110, "semestrale");
		
		riviste rivista7 = new riviste(9788820042873L, "National Geographic Traveler", "2020", 135, "semestrale");
		
//creazione array libreria di riviste e aggiunta delle riviste
		
		List<riviste> libreriaRiviste = new ArrayList<riviste>();
		
		libreriaRiviste.add(rivista1);
		libreriaRiviste.add(rivista2);
		libreriaRiviste.add(rivista3);
		libreriaRiviste.add(rivista4);
		libreriaRiviste.add(rivista5);
		libreriaRiviste.add(rivista6);
		libreriaRiviste.add(rivista7);

	}

}
