// ✅ Program 1: College Management System
// Classes:
// Person (parent)
// fields: name, email
// method: displayDetails()
// Student (child)
// fields: rollNo, course
// overrides displayDetails()
// Professor (child)
// fields: employeeId, subject
// overrides displayDetails()
// ✅ Use constructor chaining (super())

class Person {
    String name;
    String email;
    Person(String name,String email){
        this.name=name;
        this.email=email;
    }
    void displayDetails(){
        System.out.println("Name of the person is :"+name);
        System.out.println("Email of the person is :"+email);
    }
}
class Student extends Person{
    String rollNo;
    String course;
    Student(String name,String email,String rollNo,String course){
        super(name,email);
        this.rollNo=rollNo;
        this.course=course;
    }
    @Override
    void displayDetails(){
       super.displayDetails();
        System.out.println("Roll Number Of the Student:"+rollNo);
        System.out.println("Course of the Student :"+course);
    }
}
class Professor extends Person{
    String employeeId;
    String subject;
    Professor(String name,String email,String employeeId,String Subject){
    super(name,email);
    this.employeeId=employeeId;
    this.subject=subject;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Professor Employee Id:"+employeeId);
        System.out.println("Subject Of the Professor:"+subject);
    }
}
class collageManagementSystem{
    public static void main(String[]args){
        Person p=new Person("Ali", "ali123@gmail.com");
        Student s=new Student("Syhed Abu", "syded234@gmail.com","221A", "CSE");
        Professor pr=new Professor("Sk.Malik","malik132@gmail.com","221S","AI-Ml");
        
        System.out.println("\nPerson Details>>>>>>>>>>>>>>>>");
        p.displayDetails();
        System.out.println("\nStudent Details>>>>>>>>>>>>>>>>");
        s.displayDetails();
        System.out.println("\nProfessor Details>>>>>>>>>>>>>>>>");
        pr.displayDetails();
    }
}
