public class Teacher {
  
  private int id;
  private String name;
  private double salary;

   // Constructor
  public Teacher(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
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

  
  
}
