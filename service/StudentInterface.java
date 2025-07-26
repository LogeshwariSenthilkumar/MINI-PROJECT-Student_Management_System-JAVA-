package service;
import model.Student;
public interface StudentInterface{
    void addStudent(Student s);
    void displayAll();
    void search(int rollNo);
    void updateMarks(int rollNo,int marks);
    void deleteStudent(int rollNo);
}