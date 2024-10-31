import java.util.*;

//parent class Person
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private char gender;

    public Person(String firstName, String lastName, int age, char gender) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

}

// faculty class inherited from person
public class Faculty extends Person {
    private int eployeeId;
    private String department;
    private String designation;
    private double Salary;

    public Faculty(String firstName, String lastName, int age, char gender, int eployeeId, String department,
            String designation, double salary) {
        super(firstName, lastName, age, gender);
        this.eployeeId = eployeeId;
        this.department = department;
        this.designation = designation;
        Salary = salary;
    }

    public int getEployeeId() {
        return eployeeId;
    }

    public void setEployeeId(int eployeeId) {
        this.eployeeId = eployeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

}

// student class inherited from person
public class Student extends Person {
    private int rollNo;
    private String course;
    private int semester;
    private double gpa;

    public Student(String firstName, String lastName, int age, char gender, int rollNo, String course, int semester,
            double gpa) {
        super(firstName, lastName, age, gender);
        this.rollNo = rollNo;
        this.course = course;
        this.semester = semester;
        this.gpa = gpa;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

// main method with solution in Main class

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("fName1", "lName1", 20, 'M', 10, "c1", 1, 3.5);
        Student s2 = new Student("fName2", "lName2", 21, 'F', 11, "c2", 2, 3.9);
        Student s3 = new Student("fName3", "lName3", 22, 'F', 12, "c2", 3, 2.9);
        Student s4 = new Student("fName4", "lName4", 23, 'M', 13, "c1", 1, 7.2);
        List<Student> students = new ArrayList<>(Arrays.asList(s1, s2, s3, s4));
        Faculty f1 = new Faculty("fName5", "lName5", 24, 'M', 12, "dept1", "assoPro", 90000);
        Faculty f2 = new Faculty("fName6", "lName6", 25, 'F', 13, "dept2", "Pro", 50000);
        Faculty f3 = new Faculty("fName7", "lName7", 26, 'M', 14, "dept2", "assoPro", 120000);
        Faculty f4 = new Faculty("fName8", "lName8", 27, 'F', 11, "dept1", "Pro", 80000);
        List<Faculty> faculties = new ArrayList<>(Arrays.asList(f1, f2, f3, f4));
        Student ans = findHighestGpa(students);
        System.out.println("student with higest gpa  " + ans.getFirstName());
        Faculty ans2 = findHighestSalary(faculties);
        System.out.println("faculty with higest salary  " + ans2.getFirstName());

    }

    private static Student findHighestGpa(List<Student> students) {
        Student s = students.get(0);
        for (Student st : students) {
            if (st.getGpa() > s.getGpa()) {
                s = st;
            }
        }

        return s;
    }

    public static Faculty findHighestSalary(List<Faculty> faculties) {
        Faculty f = faculties.get(0);
        for (Faculty ft : faculties) {
            if (ft.getSalary() > f.getSalary()) {
                f = ft;
            }
        }
        return f;
    }
}
