public class School{
  private int numStudents;
  private String schoolName;
  private String address;
  private Course[] courses;
  private String mascot;

  public School(int numStudents, String schoolName, String address, Course[] courses, String mascot){
    this.numStudents = numStudents;
    this.schoolName = schoolName;
    this.address = address;
    this.courses = courses;
    this.mascot = mascot;
  }
  //School object constructor

  //getter and setter methods for school variables
  public int getNumStudents() {
  	return numStudents;
  }
  public void setNumStudents(int numStudents) {
  	this.numStudents = numStudents;
  }
  public String getSchoolName() {
  	return schoolName;
  }
  public void setSchoolName(String schoolName) {
  	this.schoolName = schoolName;
  }
  public String getAddress() {
  	return address;
  }
  public void setAddress(String address) {
  	this.address = address;
  }
  public Course[] getCourses() {
  	return courses;
  }
  public void setCourses(Course[] courses) {
  	this.courses = courses;
  }
  public String getMascot() {
  	return mascot;
  }
  public void setMascot(String mascot) {
  	this.mascot = mascot;
  }

  public String toString(){
    return schoolName;
  }
  
}
