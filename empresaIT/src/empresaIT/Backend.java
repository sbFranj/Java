package empresaIT;

public interface Backend {

	public static final Double WEB_API_DB_COST=2200.0;
	public static final Double BE_MAINTENANCE_COST=500.0;
	
	static Double createWebAPIAndDBConnectionCost() {
		return WEB_API_DB_COST;
	}
	
	static Double maintenanceCost() {
		return BE_MAINTENANCE_COST;
	}
}


