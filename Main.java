import java.util.ArrayList;
import java.util.Scanner;;

public class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // Create lists of teachers and students
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();

    // Create a school object
    School school = new School(teachers, students);

    // Create teachers and add it to the list of teachers
    for (int i = 0; i < 6; i++) {
      System.out.println("Enter teacher number " + (i + 1) + "'s ID: ");
      int teacherID = input.nextInt();
      System.out.println("Enter teacher number " + (i + 1) + "'s name: ");
      String teacherName = input.next();
      input.nextLine();
      System.out.println("Enter teacher number " + (i + 1) + "'s monthly salary: ");
      double teacherSalary = input.nextDouble();
      input.nextLine();
      System.out.println();

      Teacher teacher = new Teacher(teacherID, teacherName, teacherSalary);
      teachers.add(teacher);
    }

    // Create students and add it to the list of students
    for (int i = 0; i < 6; i++) {
      System.out.println("Enter student number " + (i + 1) + "'s ID: ");
      int studentID = input.nextInt();
      System.out.println("Enter student number " + (i + 1) + "'s name: ");
      String studentName = input.next();
      input.nextLine();
      System.out.println("Enter student number " + (i + 1) + "'s grade: ");
      int studentGrade = input.nextInt();
      input.nextLine();
      System.out.println();

      Student student = new Student(studentID, studentName, studentGrade);
      students.add(student);
    }

    System.out.println();
    // Input student fees payment
    System.out.println("Enter the student's ID to pay fees: ");
    int studentIdToPayFees = input.nextInt();
    System.out.println("Enter the amount to pay:");
    double feesAmount = input.nextDouble();

    // Find the student with the specified ID
    Student studentToPayFees = null;
    for (Student student : students) {
      if (student.getId() == studentIdToPayFees) {
        studentToPayFees = student;
        break;
      }
    }
    
    if (studentToPayFees != null) {
      studentToPayFees.payFees(feesAmount);
      school.updateTotalMoneyEarned(feesAmount);
      System.out.println("Fees payment successful.");
    } else {
      System.out.println("Student not found with the specified ID.");
    }

    // Input teacher salary payment
    for (Teacher teacher : teachers) {
      System.out.println("Enter the salary amount for " + teacher.getName() + ":");
      double salaryAmount = input.nextDouble();
      teacher.receiveSalary(salaryAmount);
      school.updateTotalMoneySpent(salaryAmount);
      System.out.println("Salary payment successful for " + teacher.getName() + ".");
    }



 
  }
}
