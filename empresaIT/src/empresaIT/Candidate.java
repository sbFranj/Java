package empresaIT;

import java.time.LocalDate;

public abstract class Candidate {
	
	public final static Double EXPERIENCE_PERCENTAGE = 0.05;

	private LocalDate dateOfBirth;
	private LocalDate startDate;
	private String dni;
	private String name;
	private String surname;
	private ContractType ct;
	private boolean inProyect;
	
	public Candidate() {
	}
	
	abstract public Double computeGrossSalary();

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public ContractType getCt() {
		return ct;
	}

	public void setCt(ContractType ct) {
		this.ct = ct;
	}

	public boolean isInProyect() {
		return inProyect;
	}

	public void setInProyect(boolean inProyect) {
		this.inProyect = inProyect;
	}

	@Override
	public String toString() {
		return String.format("Name: %s\n"
						   + "Surname: %s\n"
						   + "Contract Type: %s\n"
						   + "Start date: %s\n", 
						   getName(),
						   getSurname(),
						   getCt(),
						   getStartDate());
	}
	
	
	
	
}
