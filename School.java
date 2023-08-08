import java.util.ArrayList;

public class School {
  
  private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
  private ArrayList<Student> students = new ArrayList<Student>();
  private static double totalMoneyEarned;
  private static double totalMoneySpent;
  

  public School(ArrayList<Teacher> teachers, ArrayList<Student> students) {
    this.teachers = teachers;
    this.students = students;
    totalMoneyEarned = 0;
    totalMoneySpent = 0;
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
  public static void updateTotalMoneyEarned(double moneyEarned) {
    totalMoneyEarned += moneyEarned;
  }

  // Method to update total money spent
  public static void updateTotalMoneySpent(double moneySpent) {
    totalMoneyEarned -= moneySpent;
  }

}