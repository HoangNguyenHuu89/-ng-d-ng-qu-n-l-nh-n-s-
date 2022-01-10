
public class Manager extends Staff implements ICalculator {
	private String regency;

	public Manager(int id, String name, int age, float coefficientssalary, String workingday, String workingparts,
			int numberofdaysofleave, String regency) {
		super(id, age, numberofdaysofleave, name, workingday, workingparts, coefficientssalary);
		this.regency = regency;
		// TODO Auto-generated constructor stub
	}

	public String getRegency() {
		return regency;
	}

	public void setRegency(String regency) {
		this.regency = regency;
	}

	@Override
	public void displayInformation() {
		// TODO Auto-generated method stub
		System.out.println("ID: " + getId() + "\t;Tên: " + getName() + "\t;Tuổi: " + getAge() + " ;Hệ số lương: "
				+ getCoefficientssalary() + " ;Ngày vào làm: " + getWorkingday() + "\t;Bộ phận làm việc: "
				+ getWorkingparts() + "\t;Số ngày nghỉ phép: " + getNumberofdaysofleave() + "\t;Chức danh: "
				+ getRegency());
	}

	@Override
//tính lương của quản lý theo chức danh
	public int calculateSalary() {
		if (getRegency().equals("Business Leader")) {
			int salary = (int) (getCoefficientssalary() * 5000000 + 8000000);
			return salary;
		} else if (getRegency().equals("Project Leader")) {
			int salary = (int) (getCoefficientssalary() * 5000000 + 5000000);
			return salary;
		} else if (getRegency().equals("Technical Leader")) {
			int salary = (int) (getCoefficientssalary() * 5000000 + 6000000);
			return salary;
		}
		return 0;
	}

}
