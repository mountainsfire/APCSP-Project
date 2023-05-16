import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Student stud1 = new Student("John", 11, 16, "johnSmith.com", true);
    Student stud2 = new Student("Alan", 11, 17, "aTuring@gmail.com", true);
    System.out.println("What's the name of the student?");
    String newName = input.nextLine();
    System.out.println("Grade number?");
    int newGrade = input.nextInt();
    System.out.println("Age?");
    int newAge = input.nextInt();
    input.nextLine();
    System.out.println("Student's email?");
    String newEmail = input.nextLine();
    System.out.println("Do they have a driver's license? (true/false)");
    boolean newLicense = input.nextBoolean();
    input.nextLine();

    //Lines 5-18 Creates student objects as well as gets information for the user to make a new student
    
    Student studInput = new Student(newName, newGrade, newAge, newEmail, newLicense);
    Student[] students = {stud1, stud2, studInput};
    //Line 23 creates an array of all student objects to be accessed.
    Course compsci = new Course("APCSP", "Mr. Teacher", students, 354, true);
    //Line 25 creates an object for the course
    Course[] course = {compsci};
    //Line 27 adds the course object to an array
    
    School newSchool = new School(1500, "Computer Science High", "1234 W 567th St.", course, "Computers");

    System.out.println();
    System.out.println("...");
    System.out.println();
    
    System.out.println("Would you like to hide the names and only see the number of students? (yes/no)");
    String hide = input.nextLine();
    System.out.println();
    int j = 0;
    int num = 0;
    if(hide.equals("yes")){
      for(Student i : students){
        i.setStudentName("HIDDEN");
        //Line 39 executes a function with a given parameter, setting all the students names to "HIDDEN"
        num++;
      }
      System.out.println("There are " + num + " people in that class.");
    }else if(hide.equals("no")){
      System.out.println(newSchool + ":");
      System.out.println();
      System.out.println("In " + compsci.getTeacherName() + "'s " + compsci.getClassName() + " class, there are the following students:");
      System.out.println();
      for(Student i : students){
        System.out.println(j + ". " + i.getStudentName());
        j++;
        }
      System.out.println();
    }
    //Lines 50-53 executes a for loop that prints the names of the students in a numbered list 
      while(true){
        //Line 57-72 has a while loop asking the user which student's information they want to see until they break the code(line 60)
      System.out.println("Which student would you like to see the info for? (0-2) -1 to exit");
      int info = input.nextInt();
      //Line 59/60 asks the user which student's information they would like to see, or whether or not they want to quit
      if(info == -1){
        System.out.println("All done");
        break;
      }else{
        System.out.println();
        System.out.println("Here is the info for the student you selected:");
        System.out.println();
        System.out.println(students[info]); 
        System.out.println();
      }
    }
  }
}
