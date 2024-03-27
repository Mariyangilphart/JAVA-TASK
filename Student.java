import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
    private String name;
    private Map<String, Integer> assignmentScores;

    public Student(String name) {
        this.name = name;
        this.assignmentScores = new HashMap<>();
    }

    public void addAssignmentScore(String assignmentName, int score) {
        assignmentScores.put(assignmentName, score);
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getAssignmentScores() {
        return assignmentScores;
    }
}

class GradeBookManager {
    private List<Student> students;

    public GradeBookManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addAssignmentScore(String assignmentName, int score) {
        for (Student student : students) {
            student.addAssignmentScore(assignmentName, score);
        }
    }

    public void generateReport() {
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
            Map<String, Integer> assignmentScores = student.getAssignmentScores();
            for (Map.Entry<String, Integer> entry : assignmentScores.entrySet()) {
                System.out.println("Assignment: " + entry.getKey() + ", Score: " + entry.getValue());
            }
            System.out.println("-------------------------------");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        GradeBookManager gradeBookManager = new GradeBookManager();

        // Adding students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        gradeBookManager.addStudent(student1);
        gradeBookManager.addStudent(student2);

        // Adding assignment scores
        gradeBookManager.addAssignmentScore("Assignment 1", 90);
        gradeBookManager.addAssignmentScore("Assignment 2", 85);
        gradeBookManager.addAssignmentScore("Assignment 1", 75);
        gradeBookManager.addAssignmentScore("Assignment 2", 80);

        // Generating report
        gradeBookManager.generateReport();
    }
}