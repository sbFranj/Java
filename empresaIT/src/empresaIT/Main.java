package empresaIT;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
	
	public static void toRegister(Candidate candidate, Candidate[] candidates) {
		boolean up=false;
		for(int i=0; i<candidates.length && !up; i++) {
			if(candidates[i]==null && !up) {
				candidates[i]=candidate;
				up=true;
			}
		}
	}
	
	public static String searchEmployee(String dni, Candidate[] employees) {
		String employee="";
		for(int i=0; i<employees.length && employee.equals(""); i++) {
			if(employees[i]!=null && employees[i].getDni().equals(dni)) {
				employee=employees[i].toString();
			}
		}
		return employee;
	}
	
	public static String showEmployees(Candidate[] employees) {
		StringBuilder employeesList = new StringBuilder("EMPLOYEES\n\n");
		Arrays.sort(employees, new CompareProfessionalExperience());
		for(Candidate e:employees) {
			if(e!=null) {
				employeesList.append(e+"\n");
			}
		}
		
		return employeesList.toString();
		
	}
	
	public static Double showPrice(boolean maintenance, Candidate candidate, boolean front) {
		Double price=-1.0;
		if(candidate instanceof BackendProgrammer) {
			if(maintenance) {
				price=((BackendProgrammer) candidate).maintenanceCost()*candidate.computeGrossSalary();
			}else if(!maintenance) {
				price=((BackendProgrammer) candidate).createWebAPIAndDBConnectionCost()*candidate.computeGrossSalary();
			}
			
		}else if(candidate instanceof WebDesigner) {
			if(maintenance) {
				price=((WebDesigner) candidate).computeFEMaintenanceCost()*candidate.computeGrossSalary();
			}else if(!maintenance) {
				price=((WebDesigner) candidate).computeWebDesignCost()*candidate.computeGrossSalary();
			}
			
		}else if(candidate instanceof FullStackDeveloper && front) {
			if(maintenance) {
				price=((FullStackDeveloper) candidate).computeFEMaintenanceCost()*candidate.computeGrossSalary();
			}else if(!maintenance) {
				price=((FullStackDeveloper) candidate).computeWebDesignCost()*candidate.computeGrossSalary();
			}
			
		}else if(candidate instanceof FullStackDeveloper && !front) {
			if(maintenance) {
				price=((FullStackDeveloper) candidate).maintenanceCost()*candidate.computeGrossSalary();
			}else if(!maintenance) {
				price=((FullStackDeveloper) candidate).createWebAPIAndDBConnectionCost()*candidate.computeGrossSalary();
			}
		}
		
		
		return price;
	}

	public static void main(String[] args) {
		//3webdesigner 
		//1parcial
		WebDesigner eva = new WebDesigner();
			eva.setCt(ContractType.PARTIAL);
			eva.setStartDate(LocalDate.of(2010, 1, 24));
			eva.setDni("0");
		WebDesigner juan = new WebDesigner();
			juan.setCt(ContractType.FULLTIME);
			juan.setStartDate(LocalDate.of(2012, 6, 10));
			juan.setDni("1");
		WebDesigner maria = new WebDesigner();
			maria.setCt(ContractType.FULLTIME);
			maria.setStartDate(LocalDate.of(2013, 4, 2));
			maria.setDni("2");
		
		//6backend
		//2parcial
		BackendProgrammer antonio = new BackendProgrammer();
			antonio.setCt(ContractType.PARTIAL);
			antonio.setStartDate(LocalDate.of(2014, 7, 26));
			antonio.setDni("3");
		BackendProgrammer pilar = new BackendProgrammer();
			pilar.setCt(ContractType.PARTIAL);
			pilar.setStartDate(LocalDate.of(2015, 9, 6));
			pilar.setDni("4");
		BackendProgrammer roberto = new BackendProgrammer();
			roberto.setCt(ContractType.FULLTIME);
			roberto.setStartDate(LocalDate.of(2016, 3, 10));
			roberto.setDni("5");
		BackendProgrammer carlos = new BackendProgrammer();
			carlos.setCt(ContractType.FULLTIME);
			carlos.setStartDate(LocalDate.of(2016, 4, 11));
			carlos.setDni("6");
		BackendProgrammer emanuel = new BackendProgrammer();
			emanuel.setCt(ContractType.FULLTIME);
			emanuel.setStartDate(LocalDate.of(2017, 5, 23));
			emanuel.setDni("7");
		BackendProgrammer elvira = new BackendProgrammer();
			elvira.setCt(ContractType.FULLTIME);
			elvira.setStartDate(LocalDate.of(2018, 11, 3));
			elvira.setDni("8");
		
		//2fullstack
		FullStackDeveloper arida = new FullStackDeveloper();
			arida.setCt(ContractType.FULLTIME);
			arida.setStartDate(LocalDate.of(2019, 12, 1));
			arida.setDni("9");
		FullStackDeveloper aaron = new FullStackDeveloper();
			aaron.setCt(ContractType.FULLTIME);
			aaron.setStartDate(LocalDate.of(2018, 9, 6));
			aaron.setDni("10");
		
		
		Candidate[] jacaIT = new Candidate[11];
		
		/*jacaIT[0]=eva;
		jacaIT[1]=juan;
		jacaIT[2]=maria;
		jacaIT[3]=antonio;
		jacaIT[4]=pilar;
		jacaIT[5]=roberto;
		jacaIT[6]=carlos;
		jacaIT[7]=emanuel;
		jacaIT[8]=elvira;
		jacaIT[9]=arida;
		jacaIT[10]=aaron;*/
		
		toRegister(eva, jacaIT);
		toRegister(juan, jacaIT);
		toRegister(maria, jacaIT);
		toRegister(antonio, jacaIT);
		toRegister(pilar, jacaIT);
		toRegister(roberto, jacaIT);
		toRegister(carlos, jacaIT);
		toRegister(emanuel, jacaIT);
		toRegister(elvira, jacaIT);
		toRegister(arida, jacaIT);
		toRegister(aaron, jacaIT);
		
		System.out.println(searchEmployee("4", jacaIT));
		System.out.println(showEmployees(jacaIT));
		
		System.out.println(showPrice(true, arida, false));
		System.out.println(showPrice(false, eva, false));
		System.out.println(showPrice(false, roberto, true));

	}

}
