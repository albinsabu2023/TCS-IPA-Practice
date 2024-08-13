import java.util.*;
class Employee {
	private String name;
	private String branch;
	private double rating;
	private boolean compTransport;
	private int empId;
	public Employee(int empId, String name, String branch, double rating, boolean compTransport) {
		super();
		this.empId = empId;
		this.name = name;
		this.branch = branch;
		this.rating = rating;
		this.compTransport = compTransport;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	public boolean isCompTransport() {
		return compTransport;
	}
	public void setCompTransport(boolean compTransport) {
		this.compTransport = compTransport;
	}
}

public class Main {
	public static void main(String args[]) {
//		Employee e1=new Employee(1001,"Ashwa","IT",5,true);
//		Employee e2=new Employee(1002,"Preti","IT",4,true);
//		Employee e3=new Employee(1003,"Uma","Asdmin",3.5,false);
//		Employee e4=new Employee(1004,"Akasj","Hw",4.5,false);
//		Employee e5=new Employee(1005,"Abin","Sw",4.2,false);
//		List<Employee> employees=new ArrayList<>(Arrays.asList(e1,e2,e3,e4,e5));
		Scanner sc=new Scanner(System.in);
		int id;
		String name,department;
		double rating;
		boolean transport;
		List<Employee> employees = new ArrayList<>();
		for(int i=0;i<3;i++) {
			System.out.println("enter details of"+ i +"th emplyee");
			id=sc.nextInt();sc.nextLine();
			name=sc.nextLine();
			department=sc.nextLine();
			rating=sc.nextDouble();sc.nextLine();
			transport=sc.nextBoolean();sc.nextLine();
			Employee e=new Employee(id,name,department,rating,transport);
			employees.add(e);
		}
		String dep=sc.nextLine();
		
		int ans=findUsingTransport(employees,dep);
		System.out.println(ans);
		Employee e=findSecondHighest(employees);
		if(e==null) {
			System.out.println("not found");	
		}else {
			System.out.println(e.getName());
		}
		sc.close();
	}
	
	public static int findUsingTransport(List<Employee> emps,String dep) {
		int count =0;
		for(Employee e:emps) {
			if(e.getBranch().equalsIgnoreCase("IT")) {
				count++;
			}
		}
		return count;
	}
	public static Employee findSecondHighest(List<Employee>employees) {
		double secondHighest=0;
		double highest =0;
		Employee highestEmp=null;
		Employee secondHighestEmp=null;
		List<Employee> newList=new ArrayList<>();
		for(Employee emps:employees) {
			if(!emps.isCompTransport()) {
				newList.addLast(emps);
			}
		}
		for(Employee e:newList) {
			//this need to be done exactly this way why?
			//first task is to find highest and fix it,fix second highest also same
			if(e.getRating()>highest) {
				secondHighest=highest;
				secondHighestEmp=highestEmp;
				highest=e.getRating();
				highestEmp=e;
				//second task if anything found in between highest and secondhighest set 
				//as second Highest
			}else if(e.getRating()>secondHighest && e.getRating()<highest) {
				secondHighest=e.getRating();
				secondHighestEmp=e;
			}
			
		}
		return secondHighestEmp;	
	}
	
    
}


