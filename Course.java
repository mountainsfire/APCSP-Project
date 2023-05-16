public class Course{
  private String className;
  private String teacherName;
  private Student[] students;
  private int roomNumber;
  private boolean isSafeSpace;

  public Course(String className, String teacherName, Student[] students, int roomNumber, boolean isSafeSpace){
    this.className = className;
    this.teacherName = teacherName;
    this.students = students;
    this.roomNumber = roomNumber;
    this.isSafeSpace = isSafeSpace;
  }

  //Constructor for making a course object

  //Getter and Setter methods for all course variables
  public String getClassName() {
  	return className;
  }
  
  public void setClassName(String className) {
  	this.className = className;
  }
  
  public String getTeacherName() {
  	return teacherName;
  }
  
  public void setTeacherName(String teacherName) {
  	this.teacherName = teacherName;
  }
  
  public Student[] getStudents() {
  	return students;
  }
  
  public void setStudents(Student[] students) {
  	this.students = students;
  }
  
  public int getRoomNumber() {
  	return roomNumber;
  }
  
  public void setRoomNumber(int roomNumber) {
  	this.roomNumber = roomNumber;
  }
  
  public boolean isSafeSpace() {
  	return isSafeSpace;
  }
  
  public void setSafeSpace(boolean isSafeSpace) {
  	this.isSafeSpace = isSafeSpace;
  }

  public String toString(){
    return className;
  }
  
}
