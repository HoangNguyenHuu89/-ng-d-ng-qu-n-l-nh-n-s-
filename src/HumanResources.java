import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import com.sun.tools.javac.Main;
public class HumanResources {
	public static void main(String[] args) {
		ArrayList<Staff> Employeelist = new ArrayList<>();
		ArrayList<Department> Departmentlist = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		// Danh sách nhân viên ban đầu
		Employee employee1 = new Employee(1, "Nguyễn Văn Nam", 20, 3, "29/8/2021", "Kinh doanh", 0, 2);
		Employee employee2 = new Employee(2, "Phạm Thu Trang", 21, 4, "29/8/2021", "Dự án", 0, 6);
		Employee employee3 = new Employee(3, "Bùi Đức Nam", 22, 2, "29/8/2021", "Kỹ thuật", 0, 4);
		Employeelist.add(employee1);
		Employeelist.add(employee2);
		Employeelist.add(employee3);
		Manager manager1 = new Manager(4, "Trần Việt Đức", 35, 6, "29/8/2021", "Kinh doanh", 0, "Business Leader");
		Manager manager2 = new Manager(5, "Lê Thị Minh Thu", 32, 7, "29/8/2021", "Dự án", 0, "Project Leader");
		Manager manager3 = new Manager(6, "Nguyễn Thị Tuyết", 30, 8, "29/8/2021", "Kỹ thuật", 0, "Technical Leader");
		Employeelist.add(manager1);
		Employeelist.add(manager2);
		Employeelist.add(manager3);
		// Danh sách bộ phận
		Department de1 = new Department(01, 2, "Kinh doanh");
		Department de2 = new Department(02, 2, "Dự án");
		Department de3 = new Department(03, 2, "Kỹ thuật");
		Departmentlist.add(de1);
		Departmentlist.add(de2);
		Departmentlist.add(de3);
		int choose;
		do {
			ShowMenu();
			choose = input.nextInt();
			if (choose == 0) {
				System.out.println("Bạn đã thoát chương trình!");
				break;
			}
			switch (choose) {
			case 1:
				// Hiển thị danh sách nhân viên
				for (int i = 0; i < Employeelist.size(); i++) {
					Employeelist.get(i).displayInformation();
				}
				break;
			case 2:
				// Hiển thị các bộ phận trong công ty
				for (Department department : Departmentlist) {
					System.out.println(department);
				}
				break;
			case 3:
				// Hiển thị các nhân viên theo từng bộ phận
				for (int i = 0; i < Departmentlist.size(); i++) {
					System.out.println(Departmentlist.get(i) + ": ");
					for (int j = 0; j < Employeelist.size(); j++) {
						if (Employeelist.get(j).getWorkingparts().equals(Departmentlist.get(i).getPartname()))
							Employeelist.get(j).displayInformation();
					}
				}
				break;
			case 4:
				// Thêm mới nhân viên
				System.out.println("Thêm nhân viên thông thường(nhấn phím 1)");
				System.out.println("Thêm nhân viên cấp quản lý(nhấn phím 2)");
				int choose1 = input.nextInt();
				// Thêm nhân viên thông thường
				if (choose1 == 1) {
					System.out.println("Nhập số nhân viên cần thêm");
					int n = input.nextInt();
					for (int i = 0; i < n; i++) {
						System.out.println("Nhập tên nhân viên:");
						String name = input.nextLine();
						name = input.nextLine();
						System.out.println("Nhập ngày vào làm của nhân viên:");
						String workingday = input.nextLine();
						System.out.println("Nhập bộ phận của nhân viên:");
						String workingparts = input.nextLine();
						System.out.println("Nhập id nhân viên:");
						int id = input.nextInt();
						System.out.println("Nhập tuổi nhân viên:");
						int age = input.nextInt();
						System.out.println("Nhập số giờ làm thêm của nhân viên:");
						int overtimehours = input.nextInt();
						System.out.println("Nhập số ngày nghỉ phép của nhân viên:");
						int numberofdaysofleave = input.nextInt();
						System.out.println("Nhập hệ số lương của nhân viên:");
						float coefficientssalary = input.nextFloat();
						Employee employee = new Employee(id, name, age, coefficientssalary, workingday, workingparts,
								numberofdaysofleave, overtimehours);
						Employeelist.add(employee);
						// khi thêm mới nhân viên thì số lượng nhân viên tại bộ phận được thêm tăng lên
						for (int j = 0; j < Departmentlist.size(); j++) {
							if (employee.getWorkingparts().equals(Departmentlist.get(j).getPartname())) {
								Departmentlist.get(j).Add();
							}
						}
					}
				}
				// Thêm nhân viên cấp quản lý
				if (choose1 == 2) {
					System.out.println("Nhập số nhân viên cần thêm");
					int n = input.nextInt();
					for (int i = 0; i < n; i++) {
						System.out.println("Nhập tên nhân viên:");
						String name = input.nextLine();
						name = input.nextLine();
						System.out.println("Nhập ngày vào làm của nhân viên:");
						String workingday = input.nextLine();
						System.out.println("Nhập bộ phận của nhân viên:");
						String workingparts = input.nextLine();
						System.out.println("Nhập id nhân viên:");
						int id = input.nextInt();
						System.out.println("Nhập tuổi nhân viên:");
						int age = input.nextInt();
						System.out.println("Nhập chức danh của nhân viên:");
						String regency = input.nextLine();
						regency = input.nextLine();
						System.out.println("Nhập số ngày nghỉ phép của nhân viên:");
						int numberofdaysofleave = input.nextInt();
						System.out.println("Nhập hệ số lương của nhân viên:");
						float coefficientssalary = input.nextFloat();
						Manager manager = new Manager(id, name, age, coefficientssalary, workingday, workingparts,
								numberofdaysofleave, regency);
						Employeelist.add(manager);
						// khi thêm mới nhân viên thì số lượng nhân viên tại bộ phận được thêm tăng lên
						for (int j = 0; j < Departmentlist.size(); j++) {
							if (manager.getWorkingparts().equals(Departmentlist.get(j).getPartname())) {
								Departmentlist.get(j).Add();
							}
						}
					}
				}
				break;
			case 5:
				// Tìm kiếm nhân viên
				int choose2;
				System.out.println("Chọn phím 1 để tìm theo tên:");
				System.out.println("Chọn phím 2 để tìm theo id:");
				choose2 = input.nextInt();
				// Tìm kiếm nhân viên theo tên
				if (choose2 == 1) {
					System.out.println("Mời bạn nhập tên của nhân viên:");
					String name = input.nextLine();
					name = input.nextLine();
					for (Staff e : Employeelist) {
						if (e.getName().indexOf(name) >= 0) {
							e.displayInformation();
						}
					}
				}
				// Tìm kiếm nhân viên theo ID
				if (choose2 == 2) {
					System.out.println("Mời bạn nhập id của nhân viên:");
					int id = input.nextInt();
					for (Staff e : Employeelist) {
						if (e.getId() == id) {
							e.displayInformation();
							break;
						}
					}
				}
				break;
			case 6:
				// Hiển thị bảng lương của nhân viên toàn công ty
				for (int i = 0; i < Employeelist.size(); i++) {
					System.out.println("ID: " + Employeelist.get(i).getId() + " ;Tên nhân viên: "
							+ Employeelist.get(i).getName() + "\t;Lương : " + Employeelist.get(i).calculateSalary());
				}
				break;
			case 7:
				// Hiển thị bảng lương của nhân viên theo thứ tự tăng hoặc giảm dần
				int choose3;
				System.out
						.println("Chọn phím 1 để hiển thị bảng lương của nhân viên toàn công ty theo thứ tự giảm dần");
				System.out
						.println("Chọn phím 2 để hiển thị bảng lương của nhân viên toàn công ty theo thứ tự tăng dần");
				choose3 = input.nextInt();
				// Hiển thị bảng lương của nhân viên theo thứ tự giảm dần
				if (choose3 == 1) {
					for (int i = 0; i < Employeelist.size(); i++) {
						Collections.sort(Employeelist, new Comparator<Staff>() {
							@Override
							public int compare(Staff o1, Staff o2) {

								return (int) (o2.calculateSalary() - o1.calculateSalary());
							}
						});
						System.out.println("ID: " + Employeelist.get(i).getId() + " ;Tên nhân viên: "
								+ Employeelist.get(i).getName() + "\t;Lương : "
								+ Employeelist.get(i).calculateSalary());
					}
				}
				// Hiển thị bảng lương của nhân viên theo thứ tự tăng dần
				else if (choose3 == 2) {
					for (int i = 0; i < Employeelist.size(); i++) {
						Collections.sort(Employeelist, new Comparator<Staff>() {
							@Override
							public int compare(Staff o1, Staff o2) {

								return (int) (o1.calculateSalary() - o2.calculateSalary());
							}
						});
						System.out.println("ID: " + Employeelist.get(i).getId() + " ;Tên nhân viên: "
								+ Employeelist.get(i).getName() + "\t;Lương : "
								+ Employeelist.get(i).calculateSalary());
					}
				}
				break;
			default:
				// Thoát chương trình
				System.out.println("Mời lựa chọn lại theo các mục trong menu!");
				break;
			}
		} while (choose != 0);
	} 
    public static void ShowMenu() {
    	 System.out.println("===================================================");
    	 System.out.println("1.Hiển thị danh sách nhân viên hiện có");
 	     System.out.println("2.Hiển thị các bộ phận trong công ty");
 	     System.out.println("3.Hiển thị các nhân viên theo từng bộ phận");
 	     System.out.println("4.Thêm nhân viên mới vào công ty: bao gồm 2 loại");
 	     System.out.println("5.Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên");
 	     System.out.println("6.Hiển thị bảng lương của nhân viên toàn công ty");
 	     System.out.println("7.Hiển thị bảng lương của nhân viên theo thứ tự tăng hoặc giảm dần");
 	     System.out.println("8.Thoát chương trình");
 	     System.out.println("===================================================");
    }
    
   
}
   
