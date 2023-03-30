package empresaIT;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BackendProgrammer extends Candidate implements Backend{

	
	public BackendProgrammer() {
		super();
	}

	public Double createWebAPIAndDBConnectionCost() {
		return WEB_API_DB_COST;
	}
	
	public Double maintenanceCost() {
		return BE_MAINTENANCE_COST;
	}
	
	@Override
	public Double computeGrossSalary() {
		Double tariff=(getCt().getPrecio())+((int)ChronoUnit.YEARS.between(getStartDate(),LocalDate.now())*EXPERIENCE_PERCENTAGE);
		
		return tariff;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
	

}
