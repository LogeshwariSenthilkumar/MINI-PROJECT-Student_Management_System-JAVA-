import java.util.Scanner;
import model.Student;
import service.StudentService;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StudentService ss=new StudentService();
        boolean run=true;
        while(run){
            System.out.println("\n===== Student Management System =====");
            System.out.println("\n1.Add Student");
            System.out.println("\n2.Display All");
            System.out.println("\n3.Search for Roll Number");
            System.out.println("\n4.Update Marks");
            System.out.println("\n5.Delete Students");
            System.out.println("\n6.Exit");
            System.out.println("\nEnter the Choice : ");
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Enter the Name : ");
                    String name=sc.nextLine();
                    System.out.println("Enter the Roll Number : ");
                    int rollNo=sc.nextInt();
                    System.out.println("Enter the Marks : ");
                    int marks=sc.nextInt();
                    Student s=new Student(name,rollNo,marks);
                    ss.addStudent(s);
                    break;
                case 2:
                    ss.displayAll();
                    break;
                case 3:
                    System.out.println("Enter the Roll Number To be Found : ");
                    int rollNos=sc.nextInt();
                    ss.search(rollNos);
                    break;
                case 4:
                    System.out.println("Enter the Roll Number To be Found : ");
                    int rollNoss=sc.nextInt();
                     System.out.println("Enter the New Marks : ");
                    int newmarks=sc.nextInt();
                    ss.updateMarks(rollNoss,newmarks);
                    break;
                case 5:
                     System.out.println("Enter the Roll Number To be Found : ");
                     int rollNosss=sc.nextInt();
                     ss.deleteStudent(rollNosss);
                     break;
                    
                case 6:
                    run=false;
                    System.out.println("Exiting!!!");
                    break;
                default:
                    System.out.println("Invalid Choice!!!");
            }

        }
    }
}