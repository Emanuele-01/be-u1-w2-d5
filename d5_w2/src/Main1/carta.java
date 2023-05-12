package Main1;

public abstract class carta {
	protected String ISBN;
	protected String title;
	protected String yearProduction;
	protected int numPage;
	
	public carta(String ISBN, String title, String yearProduction, int numPage) {
		this.ISBN = ISBN;
		this.title = title;
		this.yearProduction = yearProduction;
		this.numPage = numPage;
	};
	
// setter
	
	public void setISBN(String iSBN) {
		 this.ISBN = iSBN;
	}
	
	public void setNumPage(int numPage) {
		this.numPage = numPage;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setYearProduction(String yearProduction) {
		this.yearProduction = yearProduction;
	}
	
// getter
	
	public String getISBN() {
		return ISBN;
	}
	
	public int getNumPage() {
		return numPage;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getYearProduction() {
		return yearProduction;
	}
}
