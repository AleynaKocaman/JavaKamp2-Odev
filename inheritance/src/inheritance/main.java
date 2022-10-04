package inheritance;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		Employee employee=new Employee();
		
		EmployeeManager employeeManager=new EmployeeManager();
		CustomerManager customerManager=new CustomerManager();
		
		customerManager.add();
		customerManager.List();
		customerManager.BestCustomer();
		
		employeeManager.List();
		employeeManager.add();
		employeeManager.BestEmployee();
	}

}
