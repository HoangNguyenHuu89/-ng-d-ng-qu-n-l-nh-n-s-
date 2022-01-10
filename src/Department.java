
public class Department {
	private int partCode, currentNumberOfEmployees;
	private String partName;

	public Department(String partname) {
		this.partName = partname;
	}

	public Department(int partcode, int currentnumberofemployees, String partname) {
		super();
		this.partCode = partcode;
		this.currentNumberOfEmployees = currentnumberofemployees;
		this.partName = partname;
	}

	public int getPartcode() {
		return partCode;
	}

	public void setPartcode(int partcode) {
		this.partCode = partcode;
	}

	public int getCurrentnumberofemployees() {
		return currentNumberOfEmployees;
	}

	public void setCurrentnumberofemployees(int currentnumberofemployees) {
		this.currentNumberOfEmployees = currentnumberofemployees;
	}

	public String getPartname() {
		return partName;
	}

	public void setPartname(String partname) {
		this.partName = partname;
	}

	@Override
	public String toString() {
		return "Mã bộ phận:" + partCode + " ;Tên bộ phận:" + partName + " \t;Tổng số nhân viên:"
				+ currentNumberOfEmployees + "";
	}

//khi thêm mới nhân viên thì số lượng nhân viên tại bộ phận được thêm tăng lên
	public int Add() {
		if (getPartname().equals("Kinh doanh") || getPartname().equals("Dự án") || getPartname().equals("Kỹ thuật")) {
			return currentNumberOfEmployees++;
		}
		return 0;
	}
}
