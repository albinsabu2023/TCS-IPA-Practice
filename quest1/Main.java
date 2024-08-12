
import java.util.*;

class Course {
    private int courseId;

    public Course(int courseId, String courseName, String courseAdmin, int quiz, int handson) {
        super();
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseAdmin() {
        return courseAdmin;
    }

    public void setCourseAdmin(String courseAdmin) {
        this.courseAdmin = courseAdmin;
    }

    public int getQuiz() {
        return quiz;
    }

    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    public int getHandson() {
        return handson;
    }

    public void setHandson(int handson) {
        this.handson = handson;
    }

}

public class Main {
    public static void main(String[] args) {
        Course c1 = new Course(111, "kubernetes", "Nisha", 40, 10);
        Course c2 = new Course(321, "cassandra", "Rashmi", 30, 15);
        Course c3 = new Course(457, "appache spark", "Nisha", 30, 12);
        Course c4 = new Course(987, "sitecore", "tirth", 50, 20);

        String cAdmin = "Nisha";
        int q = 17;
        Course[] courses = { c1, c2, c3, c4 };

        // Get sorted courses based on the hands-on value
        Course[] ans1 = findSortedCourse(courses, q);
        for (Course c : ans1) {
            System.out.println(c.getCourseName());
        }

        // Get the average quiz value
        int ans2 = findAvgQuiz(courses, cAdmin);
        System.out.println("ans is " + ans2);
    }

    public static Course[] findSortedCourse(Course[] courses, int q) {
        List<Course> filteredList = new ArrayList<>();

        // Filter courses based on hands-on value
        for (Course course : courses) {
            if (course.getHandson() < q) {
                filteredList.add(course);
            }
        }

        // Convert List to array
        Course[] newList = filteredList.toArray(new Course[0]);

        // Sort the array by hands-on value
        Arrays.sort(newList, (c1, c2) -> Integer.compare(c1.getHandson(), c2.getHandson()));

        return newList;
    }

    public static int findAvgQuiz(Course[] courses, String name) {
        int sum = 0;
        int count = 0;

        for (Course c : courses) {
            if (c.getCourseAdmin().equalsIgnoreCase(name)) {
                sum += c.getQuiz();
                count++;
            }
        }

        // Return 0 if no courses match to avoid division by zero
        return (count > 0) ? (sum / count) : 0;
    }
}
