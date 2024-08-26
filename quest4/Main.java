import java.util.*;
class Car {
	private int carId;
	private String brand;
	private int testConducted;
	private int testPassed;
	private String env;
	
	
	
	public Car(int carId, String brand, int testConducted, int testPassed, String env) {
		super();
		this.carId = carId;
		this.brand = brand;
		this.testConducted = testConducted;
		this.testPassed = testPassed;
		this.env = env;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getTestConducted() {
		return testConducted;
	}
	public void setTestConducted(int testConducted) {
		this.testConducted = testConducted;
	}
	public int getTestPassed() {
		return testPassed;
	}
	public void setTestPassed(int testPassed) {
		this.testPassed = testPassed;
	}
	public String getEnv() {
		return env;
	}
	public void setEnv(String env) {
		this.env = env;
	}
	
}

public class Main {
    
	public static void main(String[] args) {
		List<Car> cars=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++) {
			int a=sc.nextInt();sc.nextLine();
			String b=sc.nextLine();
			int c=sc.nextInt();sc.nextLine();
			int d=sc.nextInt();sc.nextLine();
			String e=sc.nextLine();
			Car c1=new Car(a,b,c,d,e);
			cars.add(c1);
		}

		String input1=sc.nextLine();
		String input2=sc.nextLine();

		
		int ans1=findByPassedEnv(cars,input1);
		if(ans1!=0) {
			System.out.println(ans1);
		}else {
			System.out.println("no matching envs");
		}
		
		
		String ans2=findGrade(cars,input2);
		if(ans2.length()!=0) {
			System.out.println(ans2);
		}else {
			System.out.println("no matching brand");
		}
		
		
		sc.close();
		 
	}
	public static int findByPassedEnv(List<Car> cars,String input1) {
		 int ans=0;
		 for(Car c:cars) {
			 if(c.getEnv().equalsIgnoreCase(input1)) {
				 ans+=c.getTestPassed();
			 }
		 }
		 return ans;
	}

	public static String findGrade(List<Car> cars,String input2) {
		String ans="";
		int a=0,b=0;
		for(Car c:cars) {
			 if(c.getBrand().equalsIgnoreCase(input2)) {
				 a+=c.getTestConducted();
				 b+=c.getTestPassed();
			 }
		}
		int soln=0;
		if(a!=0) {
		   soln=(b*100)/a;
		}else {
			return ans;
		}
		
		if(soln>80) {
			ans="A1";
		}else {
			ans="B2";
		}
		return ans;
	}
}
