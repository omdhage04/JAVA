import com.Student.info.Student;
import com.Student.info.StudentDao;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        boolean exit = true;
        Scanner sc = new Scanner(System.in);
        int choise = 0;

        while (exit) {

            System.out.println("\nWelcome to Student Management App");
            System.out.println("Select an Option");
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Read student");
            System.out.println("4. Update student");
            System.out.println("5. Exit");
            System.out.println("____________________________________________________");

            choise = sc.nextInt();

            if (choise == 1) {
                System.out.println("1 choice - Add Student");
                System.out.println("Enter the name of the student");
                String studentName = sc.next();
                System.out.println("Enter the Phone of the student");
                String studentNumber = sc.next();
                System.out.println("Enter the City of the student");
                String studentCity =  sc.next();
                
                
                Student stud = new Student(studentName,studentNumber,studentCity);
               boolean ans =  StudentDao.insertStudent(stud);
               if (ans == true) {
            	   System.out.println("its successful");
               }else {
            	   System.out.println("uncessfull");
               }

            } else if (choise == 2) {
                System.out.println("2 choice - Remove Student");
                System.out.println("Enter the sid to remove thre record");
                int rem = sc.nextInt();
                boolean rr =  StudentDao.deleteStudent(rem);
                if (rr == true) {
             	   System.out.println("its successful removal opretion");
                }else {
             	   System.out.println("uncessfull removal opretion");
                }


            } else if (choise == 3) {
                System.out.println("3 choice - Read Student");
                
             StudentDao.displayAll();
            

            } else if (choise == 4) {
                System.out.println("4 choice - Update Student");
                    System.out.println("Enter id to update the student info ");
                   
                    int UpdateID = sc.nextInt();
                    System.out.println("Enter New name of the student ");
                    String studentName = sc.next();
                    System.out.println("Enter new Phone of the student");
                    String studentPhone =  sc.next();
                    System.out.println("Enter new city of the student");
                    String studentCity =  sc.next();

                    Student sss = new Student(UpdateID,studentName,studentPhone,studentCity);
                    boolean state = StudentDao.UpdateRecord(sss);
                    if (state == true) {
                  	   System.out.println("update opretion successful");
                     }else {
                  	   System.out.println("update opretion unsessful");
                     }

            } else if (choise == 5) {
                System.out.println("Exiting...");
                exit = false;

            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}