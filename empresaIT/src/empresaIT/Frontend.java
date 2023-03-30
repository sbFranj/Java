package empresaIT;

public interface Frontend {
	
	public static final Double WEB_INTERFACE_DESIGN_COST=2100.0;
	public static final Double FE_MAINTENANCE_COST=700.0;
	
	static Double computeWebDesignCost() {
		return WEB_INTERFACE_DESIGN_COST;
	}
	
	static Double computeFEMaintenanceCost() {
		return FE_MAINTENANCE_COST;
	}

}
