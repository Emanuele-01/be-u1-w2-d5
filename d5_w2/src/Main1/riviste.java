package Main1;

public class riviste extends materialeCartaceo{
	
	private String periodicità;
	
	public riviste(long ISBN, String title, String yearProduction, int numPage, String periodicità) {
		super(ISBN, title, yearProduction, numPage);
		this.periodicità = periodicità;
	}
	
// setter
	
	public void setPeriodicità(String periodicità) {
		this.periodicità = periodicità;
	}

// getter
	
	public String getPeriodicità() {
		return periodicità;
	}
	

}
