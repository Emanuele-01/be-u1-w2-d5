package Main1;

public class books extends materialeCartaceo{
	private String autore;
	private String genere;
	
	public books(long ISBN, String title, String yearProduction, int numPage, String autore, String genere) {
		super(ISBN, title, yearProduction, numPage);
		this.autore = autore;
		this.genere = genere;
	}
	
//setter
	
	public void setAutore(String autore) {
		this.autore = autore;
	}
	
	public void setGenere(String genere) {
		this.genere = genere;
	}
	
// getter
	
	public String getAutore() {
		return autore;
	}
	
	public String getGenere() {
		return genere;
	}
	
}
