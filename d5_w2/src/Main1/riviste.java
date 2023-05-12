package Main1;

public class riviste extends carta{
	
	private Main1.periodicità periodicità;
	
	public riviste(String ISBN, String title, String yearProduction, int numPage, periodicità periodicità) {
		super(ISBN, title, yearProduction, numPage);
		this.periodicità = periodicità;
	}
	
// setter
	
	public void setPeriodicità(periodicità periodicità) {
		this.periodicità = periodicità;
	}

// getter
	
	public periodicità getPeriodicità() {
		return periodicità;
	}
	
	@Override
    public String toString() {
        return "Rivista{" +
                "title: '" + title + "'" +
                ", year: " + yearProduction + 
                ", periodicità: " + periodicità +
                '}';
    }
}
