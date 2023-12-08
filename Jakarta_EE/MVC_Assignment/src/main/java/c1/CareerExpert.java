package c1;

public class CareerExpert {
	private String qualification;
public String getAdvice() {
	if(qualification.equalsIgnoreCase("be"))
		return "do cdac";
	else 
		return "do Engineering";
}

public void setQualification(String qualification) {
	this.qualification = qualification;
}

}
