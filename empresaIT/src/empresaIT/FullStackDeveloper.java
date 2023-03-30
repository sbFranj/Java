package empresaIT;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FullStackDeveloper extends Candidate implements Backend, Frontend{

	public FullStackDeveloper() {
	}
	
	public Double computeWebDesignCost() {
		return WEB_INTERFACE_DESIGN_COST;
	}
	
	public Double computeFEMaintenanceCost() {
		return FE_MAINTENANCE_COST;
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
