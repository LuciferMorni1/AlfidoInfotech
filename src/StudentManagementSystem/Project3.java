package StudentManagementSystem;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Course {
    private int courseId;
    private String courseName;

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}

class Grade {
    private Course course;
    private int grade;

    public Grade(Course course, int grade) {
        this.course = course;
        this.grade = grade;
    }

    public Course getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "course=" + course +
                ", grade=" + grade +
                '}';
    }
}

class Attendance {
    private Date date;
    private boolean present;

    public Attendance(Date date, boolean present) {
        this.date = date;
        this.present = present;
    }

    public Date getDate() {
        return date;
    }

    public boolean isPresent() {
        return present;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "date=" + date +
                ", present=" + present +
                '}';
    }
}

class Student {
    private int studentId;
    private String name;
    private List<Course> courses;
    private List<Grade> grades;
    private List<Attendance> attendance;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
        this.attendance = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        courses.add(course);
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public void markAttendance(Attendance attendance) {
        this.attendance.add(attendance);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                ", grades=" + grades +
                ", attendance=" + attendance +
                '}';
    }
}

public class Project3 {
    public static void main(String[] args) {
        // Create courses
        Course mathCourse = new Course(1, "Mathematics");
        Course scienceCourse = new Course(2, "Science");

        // Create a student
        Student student1 = new Student(101, "Alice");
        student1.enrollCourse(mathCourse);
        student1.enrollCourse(scienceCourse);

        Grade mathGrade = new Grade(mathCourse, 90);
        student1.addGrade(mathGrade);

        Attendance attendance1 = new Attendance(new Date(), true);
        student1.markAttendance(attendance1);

        // Display student information
        System.out.println(student1);
    }
}
