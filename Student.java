public class Student {
  private String studentName;
  private int grade;
  private int age;
  private String email;
  private boolean hasDriversLicense;

  public Student(String studentName, int grade, int age, String email, boolean hasDriversLicense) {
    this.studentName = studentName;
    this.grade = grade;
    this.age = age;
    this.email = email;
    this.hasDriversLicense = hasDriversLicense;
  }
  // student object constructor

  // getter and setter methods for student object
  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public boolean getDriversLicense() {
    return hasDriversLicense;
  }

  public void setHasDriversLicense(boolean hasDriversLicense) {
    this.hasDriversLicense = hasDriversLicense;
  }

  public String toString() {
    return studentName + "'s info:\nEmail: " + email + "\nAge: " + age + "\nGrade: " + grade + "\nCan drive: "
        + hasDriversLicense;
  }
  // toString for when printing the student's information
}
