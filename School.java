import java.util.ArrayList;

public class School {
  
  private ArrayList<Teacher> teachers;
  private ArrayList<Student> students;
  private double totalMoneyEarned;
  private double totalMoneySpent;

  // Constructor
  public School(ArrayList<Teacher> teachers, ArrayList<Student> students) {
    this.teachers = teachers;
    this.students = students;
    this.totalMoneyEarned = 0;
    this.totalMoneySpent = 0;
  }

  // Getters and setters
  public ArrayList<Teacher> getTeachers() {
    return teachers;
  }

  public ArrayList<Student> getStudents() {
    return students;
  }

  public double getTotalMoneyEarned() {
    return totalMoneyEarned;
  }

  public double getTotalMoneySpent() {
    return totalMoneySpent;
  }
  
  // Method to add a teacher
  public void addTeacher(Teacher teacher) {
    this.teachers.add(teacher);
  }

  // Method to add a student
  public void addStudent(Student student) {
    this.students.add(student);
  }

  // Method to update total money earned
  public void updateTotalMoneyEarned(double moneyEarned) {
    this.totalMoneyEarned += moneyEarned;
  }

  // Method to update total money spent
  public void updateTotalMoneySpent(double moneySpent) {
    this.totalMoneyEarned -= moneySpent;
  }

}