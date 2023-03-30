package empresaIT;

import java.time.temporal.ChronoUnit;
import java.util.Comparator;

public class CompareProfessionalExperience implements Comparator<Candidate>{

	@Override
	public int compare(Candidate c1, Candidate c2) {
		int resultado=0;
		if(c1==null) {
			resultado=-1;
		}else if(c2==null) {
			resultado=-1;
		}else if(c1==null && c2==null) {
			
		}else {
			resultado=(int)ChronoUnit.YEARS.between(c2.getStartDate(), c1.getStartDate());
		}
		return resultado;
	}

}
