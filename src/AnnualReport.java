

public class AnnualReport implements Report{

    private String title;
    private Json data;
    private String category;
    private int year;


    public AnnualReport(String title, Json data, String category, int year){

	this.title = title;
	this.data = data;
	this.category = category;
	this.year = year;

    }

    public AnnualReport createReport(){

	return null;
	
    }

}
