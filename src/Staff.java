
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class Staff {
	private int id;
	private int age;
	private int numberOfDaysOfLeave;
	private String workingDay;
	private String name;
	private String workingParts;
	private float coefficientsSalary;
    public Staff() {
		// TODO Auto-generated constructor stub
	}
	public Staff(int id, int age, int numberofdaysofleave, String name, String workingday, String workingparts,
			float coefficientssalary) {
		super();
		this.id = id;
		this.age = age;
		this.numberOfDaysOfLeave = numberofdaysofleave;
		this.name = name;
		this.workingDay = workingday;
		this.workingParts = workingparts;
		this.coefficientsSalary = coefficientssalary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumberofdaysofleave() {
		return numberOfDaysOfLeave;
	}

	public void setNumberofdaysofleave(int numberofdaysofleave) {
		this.numberOfDaysOfLeave = numberofdaysofleave;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWorkingday() {
		return workingDay;
	}

	public void setWorkingday(String workingday) {
		this.workingDay = workingday;
	}

	public String getWorkingparts() {
		return workingParts;
	}

	public void setWorkingparts(String workingparts) {
		this.workingParts = workingparts;
	}

	public float getCoefficientssalary() {
		return coefficientsSalary;
	}

	public void setCoefficientssalary(float coefficientssalary) {
		this.coefficientsSalary = coefficientssalary;
	}

	public abstract void displayInformation();

	public abstract int calculateSalary();

}
