
public class Employee extends Staff implements ICalculator {

	private int overtimehours;

	public Employee(String name, float coefficientssalary, int overtimehours) {
		super(overtimehours, overtimehours, overtimehours, name, name, name, coefficientssalary);
		this.overtimehours = overtimehours;
	}

	public Employee(int id, String name, int age, float coefficientssalary, String workingday, String workingparts,
			int numberofdaysofleave, int overtimehours) {
		super(id, age, numberofdaysofleave, name, workingday, workingparts, coefficientssalary);
		this.overtimehours = overtimehours;
		// TODO Auto-generated constructor stub
	}

	public int getOvertimehours() {
		return overtimehours;
	}

	public void setOvertimehours(int overtimehours) {
		this.overtimehours = overtimehours;
	}

	@Override
	public void displayInformation() {
		System.out.println("ID: " + getId() + "\t;Tên: " + getName() + "\t;Tuổi: " + getAge() + " ;Hệ số lương: "
				+ getCoefficientssalary() + " ;Ngày vào làm: " + getWorkingday() + "\t;Bộ phận làm việc: "
				+ getWorkingparts() + "\t;Số ngày nghỉ phép: " + getNumberofdaysofleave() + "\t;Số giờ làm thêm: "
				+ getOvertimehours());

	}

	@Override
	// tính lương của nhân viên
	public int calculateSalary() {
		int salary = (int) (getCoefficientssalary() * 3000000 + overtimehours * 200000);
		return salary;
	}
	
}