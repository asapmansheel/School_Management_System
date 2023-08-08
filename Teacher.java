public class Teacher {
  
  private int id;
  private String name;
  private double salary;
  private double salaryEarned;

   // Constructor
  public Teacher(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
    this.salaryEarned = 0;
  }

  // Getters and setters
  // We are not going to alter id and name of student
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  // Method that adds money to the teacher's salary, removes money from the total money earned by the school, and adds money to the total money spent by the school
  public void receiveSalary(double salary) {
    this.salaryEarned += salary;
    School.updateTotalMoneySpent(this.salary);


  }

  
  
}
