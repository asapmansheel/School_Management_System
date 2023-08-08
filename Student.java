public class Student {

  private int id;
  private String name;
  private int grade;
  private double feesPaid;
  private double totalFees;

  // Constructor
  public Student(int id, String name, int grade) {
    // Fees paid is initially $0.00
    this.feesPaid = 0;
    // Total fees for every student is $30000
    this.totalFees = 30000;

    this.id = id;
    this.name = name;
    this.grade = grade;
  }

  // Getters and setters
  // We are not going to alter id and name of student
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }
  
  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  public double getFeesPaid() {
    return feesPaid;
  }

  public void setFeesPaid(double feesPaid) {
    this.feesPaid = feesPaid;
  }

  public double getTotalFees() {
    return totalFees;
  }

  public void setTotalFees(double totalFees) {
    this.totalFees = totalFees;
  }

  // Method to update the fees that have been paid
  public void payFees(double fees) {
    this.feesPaid += fees;
    School.updateTotalMoneyEarned(feesPaid);
  }
  
  

}
