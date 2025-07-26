package service;
import model.Student;
public class StudentService implements StudentInterface{
    private Student[] students=new Student[100];
    private int count=0;
    public void addStudent(Student s){
        if(count<students.length){
            students[count]=s;
            count++;
            System.out.println("Student Added Successfully...");
        }
        else{
            System.out.println("Limit Reached No Student cannot be Added!!!");
        }
    }
    public void displayAll(){
        if(count==0){
            System.out.println("No Students Avaiable!!!");
        }
        else{
            System.out.println("\nList of Students :");
            for(int i=0;i<count;i++){
                Student s=students[i];
                System.out.println("\nName :"+s.getName()+"\n"+"Roll Number : "+s.getRollNo()+"\n"+"Marks : "+s.getMarks());
            }
        }
    }
    public void search(int rollNo){
        int found=0;
        for(int i=0;i<count;i++){
            Student s=students[i];
            if(s.getRollNo()==rollNo){
                System.out.println("Student Found : ");
                System.out.println("Name : "+s.getName());
                System.out.println("Marks : "+s.getMarks());
                found=1;
            }
        }
        if(found==0){
            System.out.println("Roll Number Not Found !!!");
        }
    }
    public void updateMarks(int rollNo,int marks){
        int found=0;
        for(int i=0;i<count;i++){
            Student s=students[i];
            if(s.getRollNo()==rollNo){
                s.setMarks(marks);
                System.out.println("Marks Updated Successfully...");
                found=1;
                System.out.println("Name : "+s.getName());
                System.out.println("Marks : "+s.getMarks());
            }
        }
         if(found==0){
            System.out.println("Roll Number Not Found !!!");
        }
        
    }
    public void deleteStudent(int rollNo){
        int found=0;
        for(int i=0;i<count;i++){
            Student s=students[i];
            if(s.getRollNo()==rollNo){
                for(int j=i;j<count;j++){
                    students[j]=students[j+1];
                }
                students[count-1]=null;
                count--;
                System.out.println("Student Deleted Succesfully!!!");
                found=1;
            }
        }
        if(found==0){
            System.out.println("Roll Number Not Found !!!");
        }
    }
}